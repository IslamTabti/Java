/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author Islam2
 */
public class Obstacle {
    private double life = 100;
    public void hit_me (double damage){
        life -= damage;
    }

    public Obstacle(Double life) {
        this.life = life;
    }
    
    
}
