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
public class Monster extends Character {
    private double life = 100;
    private int damage;

    public Monster(String name, String state, double hp, int exp) {
        super(name, state, hp, exp);
    }
    
    public void hit_me(double damage){
        life -=damage;
    }
    
    public void MonsterDisplay(){
        
                super.IsAlive();
                System.out.println("----------------------------------------------------");
                System.out.println("\n");
                System.out.println("The Monster : \" " +  this.getName()  + " \" is " + this.getState());
                System.out.println("Exp : " + this.getExp());
                System.out.println("Hp : " + this.getHp());

                System.out.println("\n \n");
        
    }
    
}
