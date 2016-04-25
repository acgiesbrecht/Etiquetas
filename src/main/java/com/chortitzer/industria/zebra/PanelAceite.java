/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chortitzer.industria.zebra;

import com.chortitzer.industria.zebra.util.Utils;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Industria
 */
public class PanelAceite extends javax.swing.JPanel {

    /**
     * Creates new form PanelFps
     */
    public PanelAceite() {
        initComponents();
        Calendar calendar = Calendar.getInstance();
        dtpFecha.setDate(calendar.getTime());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancel = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dtpFecha = new org.jdesktop.swingx.JXDatePicker();
        txtCantidad = new org.jdesktop.swingx.JXTextField();

        btnCancel.setText("CANCELAR");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(204, 255, 204));
        btnPrint.setText("IMPRIMIR");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel9.setText("Cantidad:");

        jLabel10.setText("Fecha:");

        txtCantidad.setText("10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dtpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(364, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        Utils.rawPrint(getZpl());
        System.out.println(getZpl());
    }//GEN-LAST:event_btnPrintActionPerformed

    private String getZpl() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dfLote = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();
        c.setTime(dtpFecha.getDate());
        c.add(Calendar.MONTH, 6);

        return "^XA"
                + "^PW799"
                + //"^FT64,256^XGE:CCLOGO20.GRF,1,1^FS" +
                //"^FO27,25^GB746,1100,1^FS" +
                "^FT15,45^A0N,20,21^FB220,1,0,L^FH\\^FDLote: " + dfLote.format(dtpFecha.getDate()) + "^FS"
                + "^FT15,90^A0N,20,21^FB220,1,0,L^FH\\^FDFab.: " + df.format(dtpFecha.getDate()) + "^FS"
                + "^FT15,135^A0N,20,21^FB220,1,0,L^FH\\^FDVenc.:" + df.format(c.getTime()) + "^FS"
                + "^FT295,45^A0N,20,21^FB220,1,0,L^FH\\^FDLote: " + dfLote.format(dtpFecha.getDate()) + "^FS"
                + "^FT295,90^A0N,20,21^FB220,1,0,L^FH\\^FDFab.: " + df.format(dtpFecha.getDate()) + "^FS"
                + "^FT295,135^A0N,20,21^FB220,1,0,L^FH\\^FDVenc.:" + df.format(c.getTime()) + "^FS"
                + "^FT590,45^A0N,20,21^FB220,1,0,L^FH\\^FDLote: " + dfLote.format(dtpFecha.getDate()) + "^FS"
                + "^FT590,90^A0N,20,21^FB220,1,0,L^FH\\^FDFab.: " + df.format(dtpFecha.getDate()) + "^FS"
                + "^FT590,135^A0N,20,21^FB220,1,0,L^FH\\^FDVenc.:" + df.format(c.getTime()) + "^FS"
                + "^PQ" + String.valueOf(Math.round(Integer.valueOf(txtCantidad.getText()) / 3)) + ",1,0,Y^XZ";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnPrint;
    private org.jdesktop.swingx.JXDatePicker dtpFecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private org.jdesktop.swingx.JXTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}