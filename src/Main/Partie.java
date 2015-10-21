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
public class Partie {

    private ArrayList<boolean[]> coups;

    public Partie() {
        this.coups = new ArrayList<boolean[]>();
    }

    public boolean aCoopere(int manchetmp, int numero_joueur) {
        return coups.get(manchetmp)[numero_joueur];
    }

    public void cooperer(boolean j1, boolean j2) {
        boolean[] coup = {j1, j2};
        coups.add(coup);
    }

    /**
     * Gain au coup noCoup du joueur noJoueur. Les coups commencent à 0, et
     * noJoueur = 0 ou 1
     *
     * @param noCoup
     * @param noJoueur
     * @return
     */
    public int getGain(int noCoup, int noJoueur) {
        int result = 3;
        boolean[] coup = coups.get(noCoup);
        if (noJoueur == 0) {
            if (coup[0] && coup[1]) {
                result = 3;
            }
            if (!coup[0] && coup[1]) {
                result = 5;

            }
            if (coup[0] && !coup[1]) {
                result = 0;
            }
            if (!coup[0] && !coup[1]) {
                result = 1;
            }
        } else if (noJoueur == 1) {
            if (coup[0] && coup[1]) {
                result = 3;
            }
            if (!coup[0] && coup[1]) {
                result = 0;

            }
            if (coup[0] && !coup[1]) {
                result = 5;
            }
            if (!coup[0] && !coup[1]) {
                result = 1;
            }
        }
        return result;
    }

    public int getScoreJoueur(int numeroJoueur) {
        int result = 0;
        for (boolean[] coup : coups) {
            if (numeroJoueur == 0) {
                if (coup[0] && coup[1]) {
                    result += 3;
                }
                if (!coup[0] && coup[1]) {
                    result += 5;
                }
                if (!coup[0] && !coup[1]) {
                    result += 1;
                }
            } else if (numeroJoueur == 1) {
                if (coup[0] && coup[1]) {
                    result += 3;
                }
                if (coup[0] && !coup[1]) {
                    result += 5;
                }
                if (!coup[0] && !coup[1]) {
                    result += 1;
                }
            }
        }
        return result;
    }

    public int getNbrCoups() {
        return coups.size();
    }
}
