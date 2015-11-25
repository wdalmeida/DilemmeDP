/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

/**
 *
 * @author warren
 */
public class Joueur {

    private int id;
    private String login;
    private String pwd;

    public Joueur(int id, String login, String pwd) {
        this.id = id;
        this.login = login;
        this.pwd = pwd;
    }

    public Joueur(String login, String pwd) {
        this.login = login;
        this.pwd = pwd;
    }

    public Joueur() {
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Joueur other = (Joueur) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.pwd, other.pwd)) {
            return false;
        }
        return true;
    }

    public static Joueur getById(int i) throws SQLException {
        Joueur joueur = null;
        java.sql.Connection bdd = Database.getConnection();
        Statement statement = bdd.createStatement();
        String query = "SELECT * FROM joueur WHERE id=" + i;
        ResultSet rs = statement.executeQuery(query);
        if (rs.next()) {
            joueur = new Joueur(rs.getInt(1), rs.getString(2), rs.getString(3));
        }

        return joueur;
    }

    public static void update(int i, String login, String mdp) throws SQLException {
        java.sql.Connection bdd = Database.getConnection();
        Statement statement = bdd.createStatement();
        String query = "UPDATE joueur set login=? , pwd=?";
        PreparedStatement ordre = bdd.prepareStatement(query);
        ordre.setString(1, login);
        ordre.setString(2, mdp);
        ordre.executeUpdate();
        ordre.close();
        bdd.close();
    }

    public static void delete(int i) throws SQLException {
        java.sql.Connection bdd = Database.getConnection();
        Statement statement = bdd.createStatement();
        String query = "DELETE FROM joueur WHERE id=" + i;
        statement.executeUpdate(query);
        statement.close();
        bdd.close();
    }

}
