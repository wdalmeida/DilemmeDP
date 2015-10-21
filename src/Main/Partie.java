/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author Florent
 * @author Warren
 */
public class Partie extends Joueur {

    private ArrayList<String[]> manche;
    private int nbrcoups;
    private Joueur joueur1;
    private Joueur joueur2;

    public Partie() {
        this.joueur1 = new Joueur();
        this.joueur2 = new Joueur();
        this.manche = new ArrayList<String[]>();
    }

    public boolean getACooperer(int manchetmp, int numero_joueur) {
        String[] coup = this.manche.get(manchetmp);
        if (coup[numero_joueur].equals("Cooperer")) {
            return true;
        } else if (coup[numero_joueur].equals("FaitDefaut")) {
            return false;
        }
        return false;
    }

    public void cooperer(boolean joueur1, boolean joueur2) {
        String[] choix = new String[2];
        if (joueur1 && joueur2) {
            choix[0] = "Cooperer";
            choix[1] = "Cooperer";
            this.manche.add(choix);
        } else if (!joueur1 && joueur2) {
            choix[0] = "FaitDefaut";
            choix[1] = "Cooperer";
            this.manche.add(choix);
        } else if (joueur1 && !joueur2) {
            choix[0] = "Cooperer";
            choix[1] = "FaitDefaut";
            this.manche.add(choix);
        } else if (!joueur1 && !joueur2) {
            choix[0] = "FaitDefaut";
            choix[1] = "FaitDefaut";
            this.manche.add(choix);
        }
    }

    public int getScoreJoueur(int numero_Joueur) {
        if (numero_Joueur == 0) {
            return this.joueur1.getScore();
        } else if (numero_Joueur == 1) {
            return this.joueur2.getScore();
        }
        return -1;
    }

    public int getNbrCoupJoueur(int numero_Joueur) {
        if (numero_Joueur == 0) {
            return this.joueur1.getNbrCoup();
        } else if (numero_Joueur == 1) {
            return this.joueur2.getNbrCoup();
        }
        return -1;
    }

    public int[] getGain(int gainManche, int numero_Joueur) {
        String[] manchetmp = this.manche.get(gainManche);
        int[] tab = new int[2];
        if (manchetmp[numero_Joueur].equals("Cooperer") && manchetmp[numero_Joueur].equals("Cooperer")) {
            tab[0] = 1;
            tab[1] = 1;
            return tab;
        } else if (manchetmp[numero_Joueur].equals("Cooperer") && manchetmp[numero_Joueur].equals("FaitDefaut")) {
            tab[0] = 0;
            tab[1] = 5;
            return tab;
        } else if (manchetmp[numero_Joueur].equals("FaitDefaut") && manchetmp[numero_Joueur].equals("Cooperer")) {
            tab[0] = 5;
            tab[1] = 0;
            return tab;

        } else if (manchetmp[numero_Joueur].equals("FaitDefaut") && manchetmp[numero_Joueur].equals("FaitDefaut")) {
            tab[0] = 3;
            tab[1] = 3;
            return tab;
        }
        return null;
    }
}
