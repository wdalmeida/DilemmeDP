/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JButton;

/**
 *
 * @author Warren
 */
public class PanelPartieCoups extends javax.swing.JPanel {

    /**
     * Creates new form PanelPartieSynthese
     */
    public PanelPartieCoups() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButtonCD = new javax.swing.JButton();
        JButtonDD = new javax.swing.JButton();
        JButtonCC = new javax.swing.JButton();
        JButtonDC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0)), "Prochain coup"));

        JButtonCD.setText("C | D");
        JButtonCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCDActionPerformed(evt);
            }
        });

        JButtonDD.setText("D | D");
        JButtonDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonDDActionPerformed(evt);
            }
        });

        JButtonCC.setText("C | C");
        JButtonCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCCActionPerformed(evt);
            }
        });

        JButtonDC.setText("D | C");
        JButtonDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonDCActionPerformed(evt);
            }
        });

        jLabel1.setText("Coopere");

        jLabel2.setText("Fait Defaut");

        jLabel3.setText("Coopere");

        jLabel4.setText("Fait Defaut");

        jLabel5.setText("A | B");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(JButtonCC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JButtonCD))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(8, 8, 8)
                            .addComponent(JButtonDC)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JButtonDD)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonCD)
                    .addComponent(JButtonCC)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JButtonDC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JButtonDD)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCCActionPerformed
       // laPartie.cooperer(true, true);
    }//GEN-LAST:event_JButtonCCActionPerformed

    private void JButtonDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonDCActionPerformed
        // laPartie.cooperer(false, true);
    }//GEN-LAST:event_JButtonDCActionPerformed

    private void JButtonCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCDActionPerformed
        // laPartie.cooperer(true, false);
    }//GEN-LAST:event_JButtonCDActionPerformed

    private void JButtonDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonDDActionPerformed
        // laPartie.cooperer(false, false);
    }//GEN-LAST:event_JButtonDDActionPerformed

public JButton getBouton(String choix)
{
    JButton tmp = null;
        switch (choix) {
            case "CC":
                tmp = JButtonCC;
                break;
            case "CD":
                tmp= JButtonCD;
                break;
            case "DC":
                tmp = JButtonDC;
                break;
            case "DD":
                tmp = JButtonDD;
                break;
        }
    return tmp;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCC;
    private javax.swing.JButton JButtonCD;
    private javax.swing.JButton JButtonDC;
    private javax.swing.JButton JButtonDD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
