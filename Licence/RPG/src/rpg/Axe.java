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
public class Axe extends Weapon {
    private static final double DAMAGE = 10;
    static final double MONSTER_DAMAGE_RATIO = 0.8;
    static final double OBSTACLE_DAMAGE_RATIO = 1.2;
    
    public void attack_monster(Monster m){
        m.hit_me(damage * MONSTER_DAMAGE_RATIO);
    }
    
    public void attack_obstacle(Obstacle o){
        o.hit_me(damage * OBSTACLE_DAMAGE_RATIO);
    }
    
    public String ascii_art() {
        return
                " < | >  \n" +
                "   |    \n" + 
                "   |    \n" ;
    }
}
