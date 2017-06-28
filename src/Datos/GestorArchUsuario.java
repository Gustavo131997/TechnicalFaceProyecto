/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


import Componentes.Mensajes;
import TechnicalFace.TechnicalFace;
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
 * @author gustavohuerta
 */
public class GestorArchUsuario {
        public static void cargarArchivo(TechnicalFace technical){
            try{
            RandomAccessFile arch = new RandomAccessFile(manejoArchivoyCarpetas()+File.separator+"usuarios.txt","rw");
                technical.setUsuarios(new ArrayList<>());
                String linea = null;
                while((linea = arch.readLine())!=null){
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    Usuario usuario = new Usuario();
                    usuario.setId_persona(Integer.parseInt(st.nextToken().trim()));
                    usuario.setNombre(st.nextToken().trim());
                    usuario.setAp_paterno(st.nextToken().trim());
                    usuario.setAp_materno(st.nextToken().trim());
                    usuario.setTipoPerfil(st.nextToken().trim());
                    usuario.setUser(st.nextToken().trim());
                    usuario.setPassword(st.nextToken().trim());
                    usuario.setCorreo(st.nextToken().trim());
                    usuario.setCelular(st.nextToken().trim());
                    usuario.setTelefono(st.nextToken().trim());
                    usuario.setDirFotoPerfil(st.nextToken().trim());
                    technical.añadirUsuario(usuario);
                    
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
                ex.printStackTrace();
            }
            return null;
        }
     public static void guardar(TechnicalFace technicalFace){
             FileWriter fw1;
             PrintWriter pw1;
            try{
                fw1 = new FileWriter(manejoArchivoyCarpetas()+File.separator+"usuarios.txt");
                pw1 = new PrintWriter(fw1);
                if (technicalFace.cantidadRegistroUsuario() != 0) {
                    for(int i = 0; i < technicalFace.cantidadRegistroUsuario(); i++){
                        Usuario usuario = technicalFace.obtenerRegistroUsuario(i);
                        if (i == 0) {
                            usuario.setTipoPerfil("admin");
                        }else{
                            usuario.setTipoPerfil("Usuario");
                        }
                        pw1.println(usuario.toString());
                    }
                }
                pw1.close();
                
            }catch(IOException ex){
                System.out.println("Se cayo");
            }
        }
}
