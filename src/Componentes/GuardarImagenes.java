/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import TechnicalFace.Usuario;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author root
 */
public class GuardarImagenes {
    /**
     * <<MODIFICA DIRECCION EN TU PC>>
     * Directorio donde guardar los recortes
     */
    private final String DIR = "G:\\";
    private Image photo;
    private static BufferedImage tmp_Recorte;
    private String nameFile;
    
    /**
     * Contador de recortes
     */
    private static int count=0;
    /**
     * Guarda imagen en disco del segmento seleccionado con el mouse
     * @param usu tipo Usuario el cual le pertenece la foto perfil
     * @param ruta
     * @return rutaGuardada
     */
    public  static String saveImage(Usuario usu , String ruta){
        File f = new File(ruta);
        
         try {
             tmp_Recorte = ImageIO.read(f);
            //se escribe en disco            
            count++;//contador
            File file = new File(File.separator+"Data"+File.separator+"Image"+File.separator);
            file.mkdirs();
            String rutaGuardada = file.getAbsolutePath() + File.separator+"Image" + "_" + usu.getId_persona()+"_"+usu.getUser()+ ".jpg";
            ImageIO.write(tmp_Recorte, "jpg", new File(rutaGuardada));
            return rutaGuardada;
	} catch (IOException e) {
            return null;
	}
    }   
}
