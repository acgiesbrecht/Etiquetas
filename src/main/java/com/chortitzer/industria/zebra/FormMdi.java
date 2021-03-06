/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chortitzer.industria.zebra;

import java.awt.BorderLayout;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Industria
 */
public class FormMdi extends javax.swing.JFrame {

    /**
     * Creates new form FormMdi
     */
    public FormMdi() {
        try {
            initComponents();
            InputStream resourceAsStream = this.getClass().getResourceAsStream("/version.properties");
            Properties prop = new Properties();
            prop.load(resourceAsStream);
            setTitle("Etiquetas " + prop.getProperty("project.version") + "." + prop.getProperty("project.build"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, Thread.currentThread().getStackTrace()[1].getMethodName() + " - " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mnuMain = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuBal = new javax.swing.JMenuItem();
        mnuDet = new javax.swing.JMenuItem();
        mnuFps = new javax.swing.JMenuItem();
        mnuSya = new javax.swing.JMenuItem();
        mnuSya1 = new javax.swing.JMenuItem();
        mnuSesamo = new javax.swing.JMenuItem();
        mnuMungR = new javax.swing.JMenuItem();
        mnuMungP = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setMinimumSize(new java.awt.Dimension(500, 500));

        mnuMain.setText("Seccion");
        mnuMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMainActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Aceite");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuMain.add(jMenuItem1);

        mnuBal.setText("Balanceados");
        mnuBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBalActionPerformed(evt);
            }
        });
        mnuMain.add(mnuBal);

        mnuDet.setText("Detergente");
        mnuDet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuDetMouseClicked(evt);
            }
        });
        mnuDet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDetActionPerformed(evt);
            }
        });
        mnuMain.add(mnuDet);

        mnuFps.setText("Esencia");
        mnuFps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFpsActionPerformed(evt);
            }
        });
        mnuMain.add(mnuFps);

        mnuSya.setText("Semillas");
        mnuSya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSyaActionPerformed(evt);
            }
        });
        mnuMain.add(mnuSya);

        mnuSya1.setText("Semillas Mani Fundacion");
        mnuSya1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSya1ActionPerformed(evt);
            }
        });
        mnuMain.add(mnuSya1);

        mnuSesamo.setText("Sesamo");
        mnuSesamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSesamoMouseClicked(evt);
            }
        });
        mnuSesamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSesamoActionPerformed(evt);
            }
        });
        mnuMain.add(mnuSesamo);

        mnuMungR.setText("Mung Recepcion");
        mnuMungR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuMungRMouseClicked(evt);
            }
        });
        mnuMungR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMungRActionPerformed(evt);
            }
        });
        mnuMain.add(mnuMungR);

        mnuMungP.setText("Mung Produccion");
        mnuMungP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuMungPMouseClicked(evt);
            }
        });
        mnuMungP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMungPActionPerformed(evt);
            }
        });
        mnuMain.add(mnuMungP);

        jMenuItem2.setText("Algodon");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuMain.add(jMenuItem2);

        menuBar.add(mnuMain);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMainActionPerformed

    }//GEN-LAST:event_mnuMainActionPerformed

    private void mnuDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDetActionPerformed
        PanelDet panelDet = new PanelDet();
        addFrame(panelDet, "Detergente");
    }//GEN-LAST:event_mnuDetActionPerformed

    private void mnuDetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuDetMouseClicked
        PanelBal panelBal = new PanelBal();
        addFrame(panelBal, "Balanceados");
    }//GEN-LAST:event_mnuDetMouseClicked

    private void mnuFpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFpsActionPerformed
        PanelFps panelFps = new PanelFps();
        addFrame(panelFps, "Esencia");
    }//GEN-LAST:event_mnuFpsActionPerformed

    private void mnuSyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSyaActionPerformed
        PanelSemillas panelSya = new PanelSemillas();
        addFrame(panelSya, "Semillas");
    }//GEN-LAST:event_mnuSyaActionPerformed

    private void mnuBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBalActionPerformed
        PanelBal panelBal = new PanelBal();
        addFrame(panelBal, "Balanceados");
    }//GEN-LAST:event_mnuBalActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        PanelAceite panelAceite = new PanelAceite();
        addFrame(panelAceite, "Aceite");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuSesamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSesamoMouseClicked

    }//GEN-LAST:event_mnuSesamoMouseClicked

    private void mnuSesamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSesamoActionPerformed
        PanelSesamo panelSesamo = new PanelSesamo();
        addFrame(panelSesamo, "Sesamo");
    }//GEN-LAST:event_mnuSesamoActionPerformed

    private void mnuMungRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuMungRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuMungRMouseClicked

    private void mnuMungRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMungRActionPerformed
        PanelMungRecepcion panelMung = new PanelMungRecepcion();
        addFrame(panelMung, "Mung Recepcion");
    }//GEN-LAST:event_mnuMungRActionPerformed

    private void mnuMungPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuMungPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuMungPMouseClicked

    private void mnuMungPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMungPActionPerformed
        PanelMung panelMung = new PanelMung();
        addFrame(panelMung, "Mung");
    }//GEN-LAST:event_mnuMungPActionPerformed

    private void mnuSya1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSya1ActionPerformed
        PanelSemillaManiFundacion panel = new PanelSemillaManiFundacion();
        addFrame(panel, "Semilla Mani Fundacion");
    }//GEN-LAST:event_mnuSya1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        PanelAlgodon panel = new PanelAlgodon();
        addFrame(panel, "Algodon");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public void addFrame(JPanel panel, String title) {
        try {
            JInternalFrame[] children = desktopPane.getAllFrames();

//creating a new internal frame from the Panel passes as parameter
            JInternalFrame frame = new JInternalFrame(title, true, true, true, true);
            frame.add(panel, BorderLayout.CENTER);
            //frame.pack();
            for (JInternalFrame f : children) {
                if (f.getTitle().equals(frame.getTitle())) {
                    f.setSelected(true);
                    return;
                }
            }
            desktopPane.add(frame);
            frame.setVisible(true);
            frame.setMaximum(true);

//checking to see if the child form already exist
            /*
             }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMdi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuBal;
    private javax.swing.JMenuItem mnuDet;
    private javax.swing.JMenuItem mnuFps;
    private javax.swing.JMenu mnuMain;
    private javax.swing.JMenuItem mnuMungP;
    private javax.swing.JMenuItem mnuMungR;
    private javax.swing.JMenuItem mnuSesamo;
    private javax.swing.JMenuItem mnuSya;
    private javax.swing.JMenuItem mnuSya1;
    // End of variables declaration//GEN-END:variables

}
