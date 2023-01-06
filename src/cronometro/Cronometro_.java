/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Cronometro_ extends javax.swing.JFrame {
    
    private Timer tiempo;
    private int centecimas = 0;
    private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;
    
    private ActionListener acciones = new ActionListener() { //el metodo ActionListener para detectar o manejar acciones (apretar un boton)
        public void actionPerformed(ActionEvent ae) {
            centecimas++;
            if (centecimas == 60) {
                segundos++;
                centecimas = 0;
            }
            
            if (segundos == 60) {
                minutos++;
                segundos = 0;
            }
            
            if (minutos == 60) {
                horas++;
                minutos = 0;
            }
            
            if (horas == 24) {
                horas = 0;
            }
// se actualiza el string (cronometro ) y llama al metodo para guardarlo :)
            actualizarTiempo();
        }
    };
    
    private void actualizarTiempo() {
        String texto = (horas <= 9 ? "0" : "") + horas + ":" + (minutos <= 9 ? "0" : "") + minutos + ":"
                + (segundos <= 9 ? "0" : "") + segundos + ":" + (centecimas <= 9 ? "0" : "") + centecimas;
        panelTiempo.setText(texto);
        
    }
    
    public Cronometro_() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Cronómetro");
       
        tiempo = new Timer(10, acciones); //esta linea especifica el rango de lo que va el reloj de 1 a 9 y las acciones es el evento de mas arriba que aumenta ++
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio2 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelTiempo = new javax.swing.JLabel();
        Inicio = new javax.swing.JToggleButton();
        botonIniciar = new javax.swing.JToggleButton();
        botonParar = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();

        Inicio2.setBackground(new java.awt.Color(239, 230, 221));
        Inicio2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Inicio2.setForeground(new java.awt.Color(88, 47, 14));
        Inicio2.setText("Inicio");
        Inicio2.setToolTipText("");
        Inicio2.setBorderPainted(false);
        Inicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inicio2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 114, 44));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 76, 92));
        jLabel1.setText("Cronómetro");

        panelTiempo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        panelTiempo.setForeground(new java.awt.Color(15, 76, 92));
        panelTiempo.setText("00:00:00:00");

        Inicio.setBackground(new java.awt.Color(239, 230, 221));
        Inicio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Inicio.setForeground(new java.awt.Color(88, 47, 14));
        Inicio.setText("Reiniciar");
        Inicio.setToolTipText("");
        Inicio.setBorderPainted(false);
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        botonIniciar.setBackground(new java.awt.Color(239, 230, 221));
        botonIniciar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonIniciar.setForeground(new java.awt.Color(88, 47, 14));
        botonIniciar.setText("Inicio");
        botonIniciar.setToolTipText("");
        botonIniciar.setBorderPainted(false);
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        botonParar.setBackground(new java.awt.Color(239, 230, 221));
        botonParar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonParar.setForeground(new java.awt.Color(88, 47, 14));
        botonParar.setText("Parar");
        botonParar.setToolTipText("");
        botonParar.setBorderPainted(false);
        botonParar.setEnabled(false);
        botonParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelTiempo)
                            .addComponent(botonParar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonParar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 360));

        jToggleButton6.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 18)); // NOI18N
        jToggleButton6.setText("Iniciar");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 201, 46));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        if (tiempo.isRunning()) {
            tiempo.stop();
        }
        centecimas = 0;
        segundos = 0;
        minutos = 0;
        horas = 0;
        actualizarTiempo();
        
        botonIniciar.setEnabled(true);
        botonIniciar.setText("Iniciar");
        
        botonParar.setEnabled(false);
        botonParar.setText("Parar");
    }//GEN-LAST:event_InicioActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        
        tiempo.start();
        botonIniciar.setEnabled(false);
        botonParar.setEnabled(true);
        botonIniciar.setText("Iniciado");
        botonParar.setText("Parar");

    }//GEN-LAST:event_botonIniciarActionPerformed

    private void Inicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inicio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Inicio2ActionPerformed

    private void botonPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPararActionPerformed
        botonIniciar.setText("Reanudar");
        botonParar.setText("Parado");
        botonIniciar.setEnabled(true);
        botonParar.setEnabled(false);
        tiempo.stop();
    }//GEN-LAST:event_botonPararActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cronometro_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cronometro_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cronometro_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cronometro_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cronometro_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Inicio;
    private javax.swing.JToggleButton Inicio2;
    private javax.swing.JToggleButton botonIniciar;
    private javax.swing.JToggleButton botonParar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JLabel panelTiempo;
    // End of variables declaration//GEN-END:variables
}
