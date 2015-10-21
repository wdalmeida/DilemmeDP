/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Warren
 */
public class PartieTest {

    Partie partie;

    @Before
    public void testConstructeurPartie() {
        partie = new Partie();
        assertEquals(0, partie.getNbrCoups());
    }

    @Test
    public void testGetACoopererTrueTrue() {
        partie.cooperer(true, true);
        assertTrue(partie.aCoopere(0, 0));
        assertTrue(partie.aCoopere(0,1));
        assertEquals(3, partie.getGain(0, 0));
        assertEquals(3, partie.getGain(0, 1));

    }

    @Test
    public void testGetACoopererTrueFalse() {
        partie.cooperer(true, false);
        assertTrue(partie.aCoopere(0, 0));
        assertFalse(partie.aCoopere(0, 1));
        assertEquals(0, partie.getGain(0, 0));
        assertEquals(5, partie.getGain(0, 1));
    }

    @Test
    public void testGetACoopererFalseTrue() {
        partie.cooperer(false, true);
        assertFalse(partie.aCoopere(0, 0));
        assertTrue(partie.aCoopere(0, 1));
        assertEquals(5, partie.getGain(0,0));
        assertEquals(0, partie.getGain(0, 1));
    }

    @Test
    public void testGetACoopererFalseFalse() {
        partie.cooperer(false, false);
        assertFalse(partie.aCoopere(0, 0));
        assertFalse(partie.aCoopere(0,1));
        assertEquals(1, partie.getGain(0,0));
        assertEquals(1, partie.getGain(0,1));

    }

    @Test
    public void testScoreNbJoueur() {
        partie.cooperer(true, true);
        partie.cooperer(true, false);
        partie.cooperer(false, true);
        partie.cooperer(false, false);
        partie.cooperer(false, true); // Pour crée une différence dans le score


        assertEquals(3+0+5+1+5, partie.getScoreJoueur(0));
        assertEquals(3+5+0+1+0, partie.getScoreJoueur(1));
        assertEquals(5, partie.getNbrCoups());
    }

    public void testGetScore() {

    }

    public void testCoup() {

    }

   /* @Test
    public void testReinitialiser() {
        partie.reset();
        assertEquals(0, partie.getNbrCoups(1));
    }*/
}
