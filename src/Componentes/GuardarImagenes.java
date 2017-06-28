/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

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
     * @param ruta
     * @return rutaGuardada
     */
    public  static String saveImage(String ruta){
        File f = new File(ruta);
        
         try {
             tmp_Recorte = ImageIO.read(f);
            //se escribe en disco            
            count++;//contador
            File file = new File("/home/gustavohuerta/Documentos/Proyecto de Programacion java/TechnicalFace/Data/Image/");
            file.mkdirs();
            String rutaGuardada = file.getAbsolutePath() + "/Image" + "_" + count + ".jpg";
            ImageIO.write(tmp_Recorte, "jpg", new File( rutaGuardada));
            return rutaGuardada;
	} catch (IOException e) {
            return null;
	}
    }   
}
