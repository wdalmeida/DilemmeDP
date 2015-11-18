/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.SQLException;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author warren
 */
public class JoueurTest {

    public JoueurTest() {
    }

    /**
     * Test of getId method, of class Joueur.
     */
    @Test
    public void testGetId() {
        Joueur instance = new Joueur(0,"w","w");
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Joueur.
     */
    /* @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Joueur instance = new Joueur(0, "w", "w");
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPwd method, of class Joueur.
     */
    @Test
    public void testGetPwd() {
        System.out.println("getPwd");
        Joueur instance = new Joueur(0, "w", "w");
        String expResult = "";
        String result = instance.getPwd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Joueur.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Joueur instance = new Joueur(0, "w", "w");
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Joueur.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Joueur instance = new Joueur(0, "w", "w");
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPwd method, of class Joueur.
     */
    @Test
    public void testSetPwd() {
        System.out.println("setPwd");
        String pwd = "";
        Joueur instance = new Joueur(0, "w", "w");
        instance.setPwd(pwd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Joueur.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Joueur instance = new Joueur();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Joueur.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Joueur instance = new Joueur(0, "w", "w");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetById() throws SQLException {
        Joueur result = Joueur.getById(1);
        Joueur expected = new Joueur(1, "titi", "gros minet");
        assertEquals(expected, result);
    }
    /*
    @Test
     public void testUpdate() {
        Joueur joueurBdd = new Joueur();
        Joueur joueur = new Joueur(1, "warren", "dalm");
        joueurBdd.update(1, "warren", "dalm");
        assertEquals(joueurBdd.getById(1), joueur);
    }
     */
    @Test
    public void testDelete() throws SQLException {
        Joueur.delete(1);
        Joueur result = Joueur.getById(1);
        assertNull(result);
    }

}
