/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *   
 * @author root
 */
public class CustomPanel extends JPanel{
    int progress  = 0;
    public void UpdateProgress(int progress_value){
        this.progress = progress_value;
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);//mejora la calidad del pixelaje del circulo rojo
        g2.translate(this.getWidth()/2, this.getHeight()/2); // Mueve el grafico 2D al centro del JPanel
        g2.rotate(Math.toRadians(270)); //rota la imagen en diferentes grados
        Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
        Ellipse2D circle = new Ellipse2D.Float(0,0,80,80);
        arc.setFrameFromCenter(new Point(0,0), new Point(110,110));//ajusta el tamaño del circulo rojo
        circle.setFrameFromCenter(new Point(0,0), new Point(100,100));//ajusta el tamaño del circulo blanco
        arc.setAngleStart(1);
        arc.setAngleExtent(-progress*3.6); // 360/100
        g2.setColor(Color.red);
        g2.draw(arc);
        g2.fill(arc);
        g2.setColor(Color.WHITE);
        g2.draw(circle);
        g2.fill(circle);
        g2.setColor(Color.red);
        g2.rotate(Math.toRadians(90));  
        g.setFont(new Font("Verdana",Font.PLAIN, 50));
        FontMetrics fm = g2.getFontMetrics();
        Rectangle2D rec = fm.getStringBounds(50+"%", g);
        int x = (0-(int)rec.getWidth())/2;
        int y = (0-(int)rec.getHeight())/2 + fm.getAscent();
        g2.drawString(progress+"%", x, y);
    }
}
