/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Florent
 * @author Warren
 */
public class IHMDilemme extends javax.swing.JFrame {

    private final Partie laPartie;
    private JLabel nbCoups;
    private JLabel scoreA;
    private JLabel scoreB;

    /**
     * Creates new form IHMDilemme
     */
    public IHMDilemme() {
        // Initialisation de la partie
        laPartie = new Partie();
        //Modele
        initComponents();
        // insertion du titre
        setTitle("Jeu du Dilemme du Prisonnier");
        // Composant
        initComposant();
        //Centrer sur l'ecran
        setLocationRelativeTo(null);
        //permettre le redimensionnement
        setResizable(true);
        // Fermeture lors du clic sur la croix
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // rendre la fenetre visible
        setVisible(true);
        // ajuster le contenu
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPartieCoups1 = new Vue.PanelPartieCoups();
        panelPartieSynthese1 = new Vue.PanelPartieSynthese(laPartie);
        panelPartieTableau1 = new Vue.PanelPartieTableau(laPartie);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPartieCoups1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPartieSynthese1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelPartieTableau1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPartieTableau1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPartieCoups1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(panelPartieSynthese1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  /**
     */
    private void initComposant() {
        // Initialisation
        JButton boutonCC = (JButton) panelPartieCoups1.getBouton("CC");
        JButton boutonCD = (JButton) panelPartieCoups1.getBouton("CD");
        JButton boutonDC = (JButton) panelPartieCoups1.getBouton("DC");
        JButton boutonDD = (JButton) panelPartieCoups1.getBouton("DD");

        boutonCC.addActionListener((ActionEvent e) -> {
            laPartie.cooperer(true, true);
        });
        boutonCD.addActionListener((ActionEvent e) -> {
            laPartie.cooperer(true, false);
        });
        boutonDC.addActionListener((ActionEvent e) -> {
            laPartie.cooperer(false, true);
        });
        boutonDD.addActionListener((ActionEvent e) -> {
            laPartie.cooperer(false, false);
        });
    }

    public void refresh() {
        nbCoups.setText("" + laPartie.getNbrCoups());
        scoreA.setText("" + laPartie.getScoreJoueur(0));
        scoreB.setText("" + laPartie.getScoreJoueur(1));
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IHMDilemme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        IHMDilemme ihmDilemme = new IHMDilemme();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vue.PanelPartieCoups panelPartieCoups1;
    private Vue.PanelPartieSynthese panelPartieSynthese1;
    private Vue.PanelPartieTableau panelPartieTableau1;
    // End of variables declaration//GEN-END:variables
}
