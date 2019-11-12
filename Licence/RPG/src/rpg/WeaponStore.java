/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.Scanner;

/**
 *
 * @author Islam2
 */
public class WeaponStore extends Weapon {
    Weapon axe = new Axe();
    Weapon hammer = new Hammer();
    int number_weapon = 3;
    Number extra_damage = 42;
    private Weapon[] Articles = new Weapon[20];
    static Scanner input = new Scanner(System.in);

    public Weapon getAxe() {return axe;}
    public Weapon getHammer() {return hammer;}
    public int getNumber_weapon() {return number_weapon;}
    public Number getExtra_damage() {return extra_damage;}
    public Weapon[] getArticles() {return Articles;}
    
    public Weapon createNewWeapon(){
        String weaponName = null;
        double buyPrice=0, sellPrice=0;
        int damage =0;
        
        while (weaponName==null || buyPrice==0 || sellPrice==0){
            System.out.println(" Weapon Name: ");
                weaponName = input.nextLine();
            System.out.println(" Buying Price: ");
                buyPrice = input.nextDouble();    
            System.out.println(" Selling Price: ");
                sellPrice = input.nextDouble();
            System.out.println(" Damage: ");
                sellPrice = input.nextInt();    
            input.nextLine();
            System.out.println();
        }
        
        return new Weapon (weaponName, buyPrice, sellPrice, damage);
    }
    
    public void addToWeaponStore(){
        for (int i=0; i<Articles.length; i++){
            if(Articles[i]==null){
                Articles[i]=createNewWeapon();
                i=Articles.length;
            }
        }
    }
    
    public void printShop(){
        for (int i=0; i<Articles.length; i++){
            if (Articles[i]!=null){
                System.out.println(" Number: "+ (i+1)+" Name: "+Articles[i].getName()+" Stock: "+Articles[i].getStock() );
            }
        }
    }
    
    public void buyArticle(){
        int articleNumber=-1, stock=0;
        
        while (articleNumber<0 || Articles[articleNumber]==null){
            System.out.println(" Item's number to buy: ");
            articleNumber = input.nextInt() -1;
            input.nextLine();
        }
        System.out.println();
        
        while (stock<1){
            System.out.println(" Item number to buy: ");
            stock=input.nextInt();
        }
        
        Articles[articleNumber].setStock(Articles[articleNumber].getStock()+ stock);
    }
    
    public void sellArticle(){
        int articleNumber=-1, stock=0;
        
        while (articleNumber<0 || Articles[articleNumber]==null){
            System.out.println(" Item's number to sell: ");
            articleNumber = input.nextInt() -1;
        }
        
         System.out.println();
         
         while (stock<1 || Articles[articleNumber].getStock()<stock){
            System.out.println(" Item's number to sell: ");
            articleNumber = input.nextInt();
            
            //if the qtt selling is > stock
            if (stock>Articles[articleNumber].getStock()){
                System.out.println(" error: ");
                System.out.println(); 
            }
        }
         
        Articles[articleNumber].setStock(Articles[articleNumber].getStock()- stock);
        
    }
    
    public static int selection(){
        Scanner input = new Scanner(System.in);
        int result =0;
        while (result<1 || result>20) {
            System.out.println();
            System.out.println("**********MAGASIN**********");
            System.out.println("1 for add new article");
            System.out.println("2 for buy new article");
            System.out.println("3 for sell new article");
            System.out.println("4 for view article");
            System.out.println("5 views result");
            System.out.println("6 close the shop");
            System.out.println("Your selection:  ");
            result=input.nextInt();
            System.out.println();
        }
        return result;
    }
    
    static WeaponStore menu = new WeaponStore();
    
     public static void runMenu(){
        switch (WeaponStore.selection()){
            case 1:
                menu.addToWeaponStore();
                break;
            case 2:
                menu.buyArticle();
                break;
            case 3:
                menu.sellArticle();
                break;
            case 4:
                menu.printShop();
                break;
            case 5:
                System.exit(0);
                break;    
        }
    }
       
    
}
