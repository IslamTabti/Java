/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import static rpg.WeaponStore.runMenu;

/**
 *
 * @author Islam2
 */
public class RPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Character Albert = new Character("Albert", "Alive", 100, 0);
    Character John = new Character("John", "Alive", 100, 0);
    Monster toto = new Monster("toto", "Alive", 100, 100);
    
    
    toto.MonsterDisplay();
    Albert.attack(John);
    Albert.CharacterDisplay();
    
    WeaponStore shop = new WeaponStore();
    
    shop.addToWeaponStore();
    shop.addToWeaponStore();
    shop.addToWeaponStore();
    
    shop.buyArticle();
    shop.printShop();
    
    shop.sellArticle();
    shop.printShop();
    
    while (true){
            runMenu();
        }
    
    }
    
}
