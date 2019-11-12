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
public class Character {
    private String name, state;
    private double hp;
    private Weapon weapon;
    private int weapondamage, exp;
    
    public Character (String name, String state, double hp, int exp){
        this.name = name;
        this.hp = hp;
        this.exp = exp;
        this.state = state;
    }

    public String getName() {return this.name;}
    public double getHp() {return this.hp;}
    public String getState() {return this.state;}
    public Weapon getWeapon() {return this.weapon;}
    public int getWeapondamage(){return this.weapondamage;}
    public int getExp() {return this.exp;}
    
    private void receivedamage (int damage){
        this.hp -= damage * this.exp;
    }
    
    public void attack(Character c){
        c.receivedamage(weapondamage);
            if(c.getHp() <= 0 )
            {
                this.exp +=1;
            }
    } 
    public boolean IsAlive(){
        if(this.getHp()<=0 ){
            state = "Dead";
            return false;
        }
        else{
            state = "Alive";
            return true;
        }
    }    
    
    public void CharacterDisplay(){
        
                IsAlive();
                System.out.println("----------------------------------------------------");
                System.out.println("\n");
                System.out.println("The player : \" " +  this.name  + " \" is " + this.state);
                System.out.println("Exp : " + this.exp);
                System.out.println("Hp : " + this.hp);

                System.out.println("\n \n");
        
    }
    
}
