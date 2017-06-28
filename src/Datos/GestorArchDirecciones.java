/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Componentes.Mensajes;
import TechnicalFace.Direccion;
import TechnicalFace.TechnicalFace;
import TechnicalFace.Tecnico;
import TechnicalFace.Usuario;  
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.StringTokenizer;

/**
 *
 * @author root
 */
public class GestorArchDirecciones {
    public static void cargarDireccionesUsuario(TechnicalFace technical){
         try{
            RandomAccessFile arch = new RandomAccessFile(manejoArchivoyCarpetas()+File.separator+"DireccionesUsuarios.txt","rw");

                String linea = null;
                while((linea = arch.readLine())!=null){
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    Usuario usuario = technical.obtenerRegistroUsuario(Integer.parseInt(st.nextToken().trim()));
                    Direccion dir = new Direccion();
                    dir.setRegion(st.nextToken().trim());
                    dir.setProvincia(st.nextToken().trim());
                    dir.setComuna(st.nextToken().trim());
                    dir.setCalle(st.nextToken().trim());
                    dir.setNum_calle(st.nextToken().trim());
                    dir.setNum_dep(st.nextToken().trim());
                    usuario.setDireccion(dir);
            }
                arch.close();
        }catch(IOException | NumberFormatException ex){
            Mensajes.error("Error al cargar archivo: "+ex.getMessage());
        }
    }
    public static void cargarDireccionesTecnico(TechnicalFace technical){
         try{
            RandomAccessFile arch = new RandomAccessFile(manejoArchivoyCarpetas()+File.separator+"Direccionestecnicos.txt","rw");
  
                String linea = null;
                while((linea = arch.readLine())!=null){
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String as = st.nextToken().trim();
                    System.out.println("ID"+as);
                    Tecnico tecnico = technical.obtenerRegistroTecnico(Integer.parseInt(as));
                    Direccion dir = new Direccion();
                    dir.setRegion(st.nextToken().trim());
                    dir.setProvincia(st.nextToken().trim());
                    dir.setComuna(st.nextToken().trim());
                    dir.setCalle(st.nextToken().trim());
                    dir.setNum_calle(st.nextToken().trim());
                    dir.setNum_dep(st.nextToken().trim());
                    tecnico.setDireccion(dir);
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
    public static void guardarDireccionTecnico(TechnicalFace technicalFace){
         FileWriter fw2;
             PrintWriter pw2;
            try{
                fw2 = new FileWriter(manejoArchivoyCarpetas()+File.separator+"Direccionestecnicos.txt");
                pw2 = new PrintWriter(fw2);
                
                if (technicalFace.cantidadRegistroTecnico() != 0) {
                    for (int i = 0; i < technicalFace.cantidadRegistroTecnico(); i++) {
                        Tecnico tecnico = technicalFace.obtenerRegistroTecnico(i);
                        pw2.println(tecnico.toStringDir());
                    }
                }
                pw2.close();
                
            }catch(IOException ex){
                Mensajes.error("NO SE ENCUENTRA EL ARCHIVO");
            }
    }
    public static void guardarDireccionUsuario(TechnicalFace technicalFace){
         FileWriter fw2;
             PrintWriter pw2;
            try{
                fw2 = new FileWriter(manejoArchivoyCarpetas()+File.separator+"DireccionesUsuarios.txt");
                pw2 = new PrintWriter(fw2);
                
                if (technicalFace.cantidadRegistroUsuario() != 0) {
                    for (int i = 0; i < technicalFace.cantidadRegistroUsuario(); i++) {
                        Usuario usuario = technicalFace.obtenerRegistroUsuario(i);
                        pw2.println(usuario.toStringDir());
                    }
                }
                pw2.close();
                
            }catch(IOException ex){
                Mensajes.error("NO SE ENCUENTRA EL ARCHIVO");
            }
    }
    
}
