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
public class Weapon {
    protected double damage;
    private String name;
    private double buyPrice, sellPrice;
    private int stock;
    
    public Weapon(String name, double buyPrice, double sellPrice, double damage){
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.stock = 1;
        this.damage = damage;
    }


    public String getName() { return name;}
    public void setName(String name) { this.name = name;}
    
    public double getBuyPrice() { return buyPrice;}
    public void setBuyPrice(double buyPrice) { this.buyPrice = buyPrice;}
    
    public double getSellPrice() {return sellPrice;}
    public void setSellPrice(double sellPrice) {this.sellPrice = sellPrice;}
    
    public int getStock() {return stock;}
    public void setStock(int stock) {this.stock = stock;}

    public double getDamage() {return damage;}
    public void setDamage(double damage) {this.damage = damage;}
    
    
    
    public Weapon (){
        
    }

}
