/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecteurfichier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Islam2
 */
public class LecteurReverse extends LecteurFichier {
    
    private final String nom;
    
    public LecteurReverse(String nom) {
        super();
        this.nom = nom;
    }
    
    List<String> liste = new ArrayList<>();
    
    /**
     *
     */
    @Override
    public void afficher(){
        boolean test = super.Ouvrir(nom);
        if(test == true){
            super.LireFichier();
            for(int i = text.size()-1; i >= 0; i--){
                System.out.println(text.get(i));
            }
                
        }else {
            System.out.println(" Fichier vide ou inexistant ");
        }
    }
    
}
