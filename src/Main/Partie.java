/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Partie gère le déroulement du jeu
 *
 * @author Florent
 * @author Warren
 */
public class Partie extends Observable {

    /**
     *
     */
    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<boolean[]> coups;

    /**
     * constructeur de Partie Initialise la collection de tableau de coups de
     * boolean
     */
    public Partie() {
        this.coups = new ArrayList<>();
    }

    /**
     * aCoopere
     *
     * @param numeroManche int commence à 0
     * @param numeroJoueur int commence à 0
     * @return un boolean du coup
     */
    public boolean aCoopere(int numeroManche, int numeroJoueur) {
        return coups.get(numeroManche)[numeroJoueur];
    }

    /**
     * cooperer ajoute un coup
     *
     * @param cooperationJ1 boolean
     * @param cooperationJ2 boolean
     */
    public void cooperer(boolean cooperationJ1, boolean cooperationJ2) {
        boolean[] coup = {cooperationJ1, cooperationJ2};
        coups.add(coup);
        setChanged();
        notifyObservers();
    }

    /**
     * Gain au coup noCoup du joueur noJoueur. Les coups commencent à 0, et
     * noJoueur = 0 ou 1
     *
     * @param noCoup int
     * @param noJoueur int
     * @return le gain d'un joueur noJoueur au coup noCoup
     */
    public int getGain(int noCoup, int noJoueur) {
        int result = 3;
        boolean[] coup = coups.get(noCoup);
        if (coup[0] && coup[1]) {
            result = 3;
        }
        if (!coup[0] && !coup[1]) {
            result = 1;
        }
        if (noJoueur == 0) {
            if (!coup[0] && coup[1]) {
                result = 5;
            }
            if (coup[0] && !coup[1]) {
                result = 0;
            }
        } else if (noJoueur == 1) {
            if (!coup[0] && coup[1]) {
                result = 0;
            }
            if (coup[0] && !coup[1]) {
                result = 5;
            }
        }
        return result;
    }

    /**
     * getScoreJoueur
     *
     * @param numeroJoueur int
     * @return le score total du joueur numeroJoueur
     */
    public int getScoreJoueur(int numeroJoueur) {
        int result = 0;
        for (boolean[] coup : coups) {
            if (coup[0] && coup[1]) {
                result += 3;
            }
            if (!coup[0] && !coup[1]) {
                result += 1;
            }
            if (numeroJoueur == 0) {
                if (!coup[0] && coup[1]) {
                    result += 5;
                }
            } else if (numeroJoueur == 1) {
                if (coup[0] && !coup[1]) {
                    result += 5;
                }
            }
        }
        return result;
    }

    /**
     * getNbrCoups
     *
     * @return le nombre de coups de la partie en cours
     */
    public int getNbrCoups() {
        return coups.size();
    }
}
