package Componentes;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;
   
public class validarCampos {  

    //Validar solo el ingreso de numeros
    public static void soloNumeros(JTextField txt) {
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
    }

    //Validar el ingreso de decimales
    public static void soloDecimales(JTextField txt) {
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && Character.isLetter(c)) {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
    }

    //Validar solo la cantidad de carateres deseados
    public static void cantCaracteres(final JTextField txt, final int limite) {
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (txt.getText().length() == limite) {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
            }

            @Override
            public void keyPressed(KeyEvent arg0) {
            }

            @Override
            public void keyReleased(KeyEvent arg0) {
            }
        });
    }

    //Validar que el ingreso sea solo letras
    public static void soloLetras(JTextField txt) {
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    e.consume();
                    Toolkit.getDefaultToolkit().beep();;
                }
            }
        });
    }

    //Validar que campos no esten vacios
    public static boolean estaVacio(JTextField txt) {
        boolean valor = false;

        String val = txt.getText().trim();
        if (val.isEmpty()) {
            valor = false;
        } else {
            valor = true;
        }

        return valor;
    }
    
    public static boolean validarPassword(char[]p1, char[]p2){
        boolean valor=false;
        int puntero=0;
        if(p1.length != p2.length)
        {
            valor = false;
        }
        else
        {
            while((!valor) && puntero<p1.length)
            {
                if(p1[puntero] != p2[puntero])
                {
                    valor = false;
                }
                else
                {
                    valor = true;
                }
            }
        }
        return valor;
    }
    public static boolean validarFormtCorreo(String correo){
        Pattern pat = Pattern.compile("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$");
        Matcher mac = pat.matcher(correo);
        return mac.matches();
    }
    public static boolean validarCorreo(String correo1, String correo2){
        return correo1.equals(correo2);
    }
}
