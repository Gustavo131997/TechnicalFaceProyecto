/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Componentes.Mensajes;
import TechnicalFace.Evaluacion;
import TechnicalFace.TechnicalFace;
import TechnicalFace.Tecnico;
import TechnicalFace.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class GestorArchPuntajes {
    
    public void cargarPuntajes(Tecnico tecnico){
        
         try{
            RandomAccessFile arch = new RandomAccessFile(manejoArchivoyCarpetas()+File.separator+"puntajes_"+tecnico.getId_persona()+".txt","r");
                
                String linea = null;
                int cont = 0;
                while((linea = arch.readLine())!=null){
                        StringTokenizer st = new StringTokenizer(linea, ",");
                    if (!linea.equals("")) {
                        String evaluacion = st.nextToken().trim();
                        Evaluacion ev = null;
                        if (evaluacion.equalsIgnoreCase("MUYBIEN")) {
                            System.out.println(evaluacion);
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
                        tecnico.anadirEvaluacion(ev);
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
    
    public void guardarPuntajes(Tecnico tecnico){
            FileWriter fw2;  
             PrintWriter pw2;
            try{
                fw2 = new FileWriter(manejoArchivoyCarpetas()+File.separator+"puntajes_"+tecnico.getId_persona()+".txt");
                pw2 = new PrintWriter(fw2);
                
                if (tecnico.cantidadPuntajes() != 0) {
                    for (int i = 0; i < tecnico.cantidadPuntajes(); i++) {
                        Evaluacion eva = tecnico.getEvaluacion(i);
                        pw2.println(eva.toString());
                    }
                }
                pw2.close();
                System.out.println("OK");
            }catch(IOException ex){
                Mensajes.error("NO SE ENCUENTRA EL ARCHIVO");
            }
    }

    public void vaciarArch(Tecnico tecnico) {
        FileWriter fw2;  
        PrintWriter pw2;
        try {
            fw2 = new FileWriter(manejoArchivoyCarpetas()+File.separator+"puntajes_"+tecnico.getId_persona()+".txt");
            pw2 = new PrintWriter(fw2);
        } catch (IOException ex) {
            
        }
        
    }
    
    public void guardarTecnicosEvaluados(Usuario usu){
        FileWriter fw2;  
             PrintWriter pw2;
            try{
                fw2 = new FileWriter(manejoArchivoyCarpetas()+File.separator+"usuario_"+usu.getId_persona()+".txt");
                pw2 = new PrintWriter(fw2);
                
                if (usu.cantidadTecnicoEvaluado() != 0) {
                    for (int i = 0; i <usu.cantidadTecnicoEvaluado(); i++) {
                        Tecnico eva = usu.getEvaluado(i);
                        pw2.println(eva.getId_persona()+" , "+eva.getEspecialidad());
                    }
                }
                pw2.close();
                System.out.println("OK");
            }catch(IOException ex){
                Mensajes.error("NO SE ENCUENTRA EL ARCHIVO");
            }
    }
    /**
     * 
     * @param ev
     */
    public void guardarDatos(Evaluacion ev){
        try {
            File file = new File(this.manejoArchivoyCarpetas()+File.separator+"evaluaciones.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            RandomAccessFile arch = new RandomAccessFile(file,"rw");
            String linea = "";
            String cadena = "";
            while((linea = arch.readLine()) != null){
                if (!linea.equals("")) {
                    cadena += linea+"\n";
                }
            }
            arch.close();
            PrintWriter pw = new PrintWriter(file);
            pw.println(cadena);
            pw.println(ev.getId_tecnico()+","+ev.getId_usuario()+","+ev.toString()+ev.getFechaEvaluacion());
            pw.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
    }
    /**
     * 
     * @return 
     */
    public ArrayList<String> cargarDatos(){
        RandomAccessFile arch;
        try {
            arch = new RandomAccessFile(manejoArchivoyCarpetas()+File.separator+"evaluaciones.txt","r");
             String linea = null;
                int cont = 0;
                ArrayList<String> datos = new ArrayList<>();
                while((linea = arch.readLine())!=null){
                    if (!linea.equals("")) {
                        StringTokenizer st = new StringTokenizer(linea, ",");
                    datos.add(st.nextToken());
                    datos.add(st.nextToken());
                    datos.add(st.nextToken());
                    datos.add(st.nextToken());
                    datos.add(st.nextToken());
                    }
                }
                arch.close();
                return datos;
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
                
        return null;
    }
}
