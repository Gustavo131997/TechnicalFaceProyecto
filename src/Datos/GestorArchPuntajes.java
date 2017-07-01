/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Componentes.Mensajes;
import TechnicalFace.Evaluacion;
import TechnicalFace.Tecnico;
import TechnicalFace.Usuario;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author root
 */
public class GestorArchPuntajes {
    
    public void cargarPuntajes(Usuario usuario){
         try{
            RandomAccessFile arch = new RandomAccessFile(manejoArchivoyCarpetas()+File.separator+"puntajes_"+tecnico.getId_persona()+".txt","r");
                tecnico.setPuntajes(new ArrayList<>());
                String linea = null;
                int cont = 0;
                while((linea = arch.readLine())!=null){
                    cont++;
                    System.out.println(cont);
                    if (cont == 1) {
                        System.out.println(cont);
                        StringTokenizer st = new StringTokenizer(linea, ",");
                        int id = Integer.parseInt(st.nextToken());
                        if (id == tecnico.getId_persona()) {
                            System.out.println("Ok");
                        }else{
                            Mensajes.error("Error no se encuentra el id del tecnico");
                        }
                        int id2 = Integer.parseInt(st.nextToken());
                        
                        
                    }else if (cont > 1){
                        System.out.println(cont);
                        StringTokenizer st = new StringTokenizer(linea, ";");
                        String evaluacion = st.nextToken().trim();
                        Evaluacion ev = null;
                        if (evaluacion.equalsIgnoreCase("MUYBIEN")) {
                            ev = Evaluacion.MUYBIEN;
                        }else if(evaluacion.equalsIgnoreCase("BIEN")){
                            ev = Evaluacion.BIEN;
                        }else if (evaluacion.equalsIgnoreCase("REGULAR")) {
                            ev = Evaluacion.REGULAR;
                        }else if (evaluacion.equalsIgnoreCase("MAL")) {
                            ev = Evaluacion.MAL;
                        }else if (evaluacion.equalsIgnoreCase("MUYMAL")) {
                            ev = Evaluacion.MUYMAL;
                        }
                        tecnico.añadirEvaluacion(ev);
                    }
                    
                }
                arch.close();
        }catch(IOException | NumberFormatException ex){
            Mensajes.error("Error al cargar archivo: "+ex.getMessage());
        }
    }
    
    public String manejoArchivoyCarpetas(){
            File file = new File("Data"+File.separator+"Registro"+File.separator);
            try{
                file.mkdirs();
                return file.getAbsolutePath();
            }catch(Exception ex){
                
             }
            return null;
        }
    
    public void guardarPuntajes(Usuario usuario){
            FileWriter fw2;  
             PrintWriter pw2;
            try{
                fw2 = new FileWriter(manejoArchivoyCarpetas()+File.separator+"usuario"+usuario.getId_persona()+"evaluacion"+".txt");
                pw2 = new PrintWriter(fw2);
                
                if (usuario.cantidadTecnicosEvaluados() != 0) {
                    for (int i = 0; i < usuario.cantidadTecnicosEvaluados(); i++) {
                        Tecnico tecnico = usuario.getEvaluado(i);
                        tecnico.setPuntajes(new ArrayList<>());
                        
                        pw2.println(tecnico.toString());
                    }
                }
                pw2.close();
                
            }catch(IOException ex){
                Mensajes.error("NO SE ENCUENTRA EL ARCHIVO");
            }
    }
}
