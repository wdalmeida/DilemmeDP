/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author florent
 */
class Joueur {
    private int nbrCoups;
    private int score;
    
    public Joueur()
    {
        this.score = 0;
        this.nbrCoups =0;
    }
    public int getScore()
    {
        return this.score;
    }
    public void setScore(int nouveau)
    {        
        this.score+= nouveau;
    }
    public int getNbrCoup()
    {
        return this.nbrCoups;
    }
     public void setNbrCoup(int nouveau)
    {        
        this.nbrCoups+= nouveau;
    }
}
