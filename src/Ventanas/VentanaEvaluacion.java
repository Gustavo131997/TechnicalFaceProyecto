/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import TechnicalFace.Evaluacion;
import TechnicalFace.Tecnico;
import TechnicalFace.Usuario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
   
/**
 *
 * @author gustavo huerta
 */
public class VentanaEvaluacion extends javax.swing.JFrame {
    Tecnico tecnico;
    Usuario usuario;
    /**
     * Creates new form VentanaEvaluacion
     */
    public VentanaEvaluacion() {
        this.setTitle("Evaluar");
        initComponents();
    }
    public void evaluar(Tecnico evaluado, Usuario evaluar){
        tecnico = evaluado;
        usuario = evaluar;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBMuyBueno = new javax.swing.JButton();
        jBBueno = new javax.swing.JButton();
        jBRegular = new javax.swing.JButton();
        jBMalo = new javax.swing.JButton();
        jBMuyMalo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre Tecnico:");

        jLabel3.setText("Gustavo Huerta Cayun");

        jBMuyBueno.setText("Muy Buena");
        jBMuyBueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMuyBuenoActionPerformed(evt);
            }
        });

        jBBueno.setText("Buena");
        jBBueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuenoActionPerformed(evt);
            }
        });

        jBRegular.setText("Regular");
        jBRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegularActionPerformed(evt);
            }
        });

        jBMalo.setText("Mala");
        jBMalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMaloActionPerformed(evt);
            }
        });

        jBMuyMalo.setText("Muy Mala");
        jBMuyMalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMuyMaloActionPerformed(evt);
            }
        });

        jLabel4.setText("¿Como evalua el desempeño del tecnico?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBMuyBueno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBueno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRegular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMalo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMuyMalo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBMuyBueno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBBueno, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBMalo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBMuyMalo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jBMuyBuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMuyBuenoActionPerformed
        Evaluacion eva = Evaluacion.MUYBIEN;
        eva.setFechaEvaluacion(this.getFechaActual()+","+this.getHoraActual());
        eva.setId_tecnico(""+tecnico.getId_persona());
        eva.setId_usuario(""+usuario.getId_persona());
        eva.guardarDatosEvaluacion();
        usuario.ingresarEvaluacion(tecnico, eva);
        usuario.anadirEvaluado(tecnico);
        usuario.grabarTecnicosEvaluados();
        PerfilTecnico perfilTecnico = new PerfilTecnico(true,usuario, tecnico);
        perfilTecnico.setVisible(true);
        dispose();   
    }//GEN-LAST:event_jBMuyBuenoActionPerformed
    public String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }

    //Metodo usado para obtener la hora actual del sistema
    //@return Retorna un <b>STRING</b> con la hora actual formato "hh:mm:ss"
    public String getHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss aa");
        return formateador.format(ahora);
    }
    private void jBBuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuenoActionPerformed
        Evaluacion eva = Evaluacion.BIEN;
        eva.setFechaEvaluacion(this.getFechaActual()+","+this.getHoraActual());
        eva.setId_tecnico(""+tecnico.getId_persona());
        eva.setId_usuario(""+usuario.getId_persona());
        eva.guardarDatosEvaluacion();
        usuario.ingresarEvaluacion(tecnico, eva);
        usuario.anadirEvaluado(tecnico);
        usuario.grabarTecnicosEvaluados();
        PerfilTecnico perfilTecnico = new PerfilTecnico(true, usuario , tecnico);
        perfilTecnico.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBBuenoActionPerformed

    private void jBRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegularActionPerformed
        Evaluacion eva = Evaluacion.REGULAR;
        eva.setFechaEvaluacion(this.getFechaActual()+","+this.getHoraActual());
        eva.setId_tecnico(""+tecnico.getId_persona());
        eva.setId_usuario(""+usuario.getId_persona());
        eva.guardarDatosEvaluacion();
        usuario.ingresarEvaluacion(tecnico, eva);
        usuario.anadirEvaluado(tecnico);
        usuario.grabarTecnicosEvaluados();
        PerfilTecnico perfilTecnico = new PerfilTecnico(true, usuario , tecnico);
        perfilTecnico.setVisible(true);    
        dispose();
    }//GEN-LAST:event_jBRegularActionPerformed

    private void jBMaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMaloActionPerformed
        Evaluacion eva = Evaluacion.MAL;
        eva.setFechaEvaluacion(this.getFechaActual()+","+this.getHoraActual());
        eva.setId_tecnico(""+tecnico.getId_persona());
        eva.setId_usuario(""+usuario.getId_persona());
        eva.guardarDatosEvaluacion();
        usuario.ingresarEvaluacion(tecnico, eva);
        usuario.anadirEvaluado(tecnico);
        usuario.grabarTecnicosEvaluados();
        PerfilTecnico perfilTecnico = new PerfilTecnico(true, usuario , tecnico);
        perfilTecnico.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBMaloActionPerformed

    private void jBMuyMaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMuyMaloActionPerformed
        Evaluacion eva = Evaluacion.MUYMAL;
        eva.setFechaEvaluacion(this.getFechaActual()+","+this.getHoraActual());
        eva.setId_tecnico(""+tecnico.getId_persona());
        eva.setId_usuario(""+usuario.getId_persona());
        eva.guardarDatosEvaluacion();
        usuario.ingresarEvaluacion(tecnico, eva);
        usuario.anadirEvaluado(tecnico);
        usuario.grabarTecnicosEvaluados();
        PerfilTecnico perfilTecnico = new PerfilTecnico(true, usuario , tecnico);
        perfilTecnico.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBMuyMaloActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBueno;
    private javax.swing.JButton jBMalo;
    private javax.swing.JButton jBMuyBueno;
    private javax.swing.JButton jBMuyMalo;
    private javax.swing.JButton jBRegular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
