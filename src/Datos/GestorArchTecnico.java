/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


import Componentes.Mensajes; 
import TechnicalFace.TechnicalFace;
import TechnicalFace.Tecnico;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author gustavohuerta
 */
public class GestorArchTecnico {
        public void cargarTecnicosGuardados(TechnicalFace technical){
            try{
                
            RandomAccessFile arch = new RandomAccessFile(manejoArchivoyCarpetas()+File.separator+"tecnicos.txt","rw");

                String linea = null;
                while((linea = arch.readLine())!=null){
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    Tecnico tecnico = new Tecnico();
                    tecnico.setId_persona(Integer.parseInt(st.nextToken().trim()));
                    tecnico.setNombre(st.nextToken().trim());
                    tecnico.setAp_paterno(st.nextToken().trim());
                    tecnico.setAp_materno(st.nextToken().trim());
                    tecnico.setTipoPerfil(st.nextToken());
                    tecnico.setUser(st.nextToken().trim());
                    tecnico.setPassword(st.nextToken().trim());
                    tecnico.setCorreo(st.nextToken().trim());
                    tecnico.setCelular(st.nextToken().trim());
                    tecnico.setTelefono(st.nextToken().trim()); 
                    tecnico.setEspecialidad(st.nextToken().trim());
                    tecnico.setAnoExperencia(st.nextToken().trim());
                    tecnico.setNivel_confianza(Integer.parseInt(st.nextToken().trim()));
                    tecnico.setDescripcion(st.nextToken().trim());
                    tecnico.setDirFotoPerfil(st.nextToken().trim());
                    tecnico.setPuntajes(new ArrayList<>());
                    tecnico.cargarPuntajes();
                    technical.añadirTecnico(tecnico);
                    
            }
                arch.close();
        }catch(IOException | NumberFormatException ex){
            Mensajes.error("Error al cargar archivo: "+ex.getMessage());
        }
        }

        
        public static String manejoArchivoyCarpetas(){
            File file = new File("Data"+File.separator+"Registro"+File.separator);
            try{
                file.mkdirs();
                return file.getAbsolutePath();
            }catch(Exception ex){
                
            }
            return null;
        }
     public static void guardar(TechnicalFace technicalFace){
             FileWriter fw2;  
             PrintWriter pw2;
            try{
                fw2 = new FileWriter(manejoArchivoyCarpetas()+File.separator+"tecnicos.txt");
                pw2 = new PrintWriter(fw2);
                
                if (technicalFace.cantidadRegistroTecnico() != 0) {
                    for (int i = 0; i < technicalFace.cantidadRegistroTecnico(); i++) {
                        Tecnico tecnico = technicalFace.obtenerRegistroTecnico(i);
                        pw2.println(tecnico.toString());
                    }
                }
                pw2.close();
                
            }catch(IOException ex){
                Mensajes.error("NO SE ENCUENTRA EL ARCHIVO");
            }
        }
}
