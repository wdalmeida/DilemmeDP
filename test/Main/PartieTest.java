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

    Partie laPartie;

    @Before
    public void testConstructeurPartie() {
        laPartie = new Partie();
        assertEquals(0, laPartie.getNbrCoupJoueur(1));
    }

    @Test
    public void testGetACoopererTrueTrue() {
        laPartie.cooperer(true, true);
        assertTrue(laPartie.getACooperer(1, 1));
        assertTrue(laPartie.getACooperer(1, 2));
        assertEquals(1, laPartie.getGain(1, 3));
        assertEquals(1, laPartie.getGain(1, 3));

    }

    @Test
    public void testGetACoopererTrueFalse() {
        laPartie.cooperer(true, false);
        assertTrue(laPartie.getACooperer(1, 1));
        assertFalse(laPartie.getACooperer(1, 2));
        assertEquals(1, laPartie.getGain(1, 0));
        assertEquals(1, laPartie.getGain(1, 5));
    }

    @Test
    public void testGetACoopererFalseTrue() {
        laPartie.cooperer(false, true);
        assertFalse(laPartie.getACooperer(1, 1));
        assertTrue(laPartie.getACooperer(1, 2));
        assertEquals(1, laPartie.getGain(1, 5));
        assertEquals(1, laPartie.getGain(1, 0));
    }

    @Test
    public void testGetACoopererFalseFalse() {
        laPartie.cooperer(false, false);
        assertFalse(laPartie.getACooperer(1, 1));
        assertFalse(laPartie.getACooperer(1, 2));
        assertEquals(1, laPartie.getGain(1, 1));
        assertEquals(1, laPartie.getGain(1, 2));

    }

    @Test
    public void testScoreNbJoueur() {
        laPartie.cooperer(true, true);
        laPartie.cooperer(true, false);
        laPartie.cooperer(false, true);
        laPartie.cooperer(false, false);
        laPartie.cooperer(false, true);


        assertEquals(3+5+0+1+0, laPartie.getScoreJoueur(1));
        assertEquals(3+0+5+1+5, laPartie.getScoreJoueur(2));
        assertEquals(5, laPartie.getNbrCoupJoueur(1));
    }

    public void testGetScore() {

    }

    public void testCoup() {

    }

    @Test
    public void testReinitialiser() {
        laPartie.reset();
        assertEquals(0, laPartie.getNbrCoupJoueur(1));
    }
}
