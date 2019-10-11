/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecteurfichier;

/**
 *
 * @author Islam2
 */
public class LecteurFichierTxt  extends LecteurFichier {
    private final String nom;
    public LecteurFichierTxt(String nom){
        super();
        this.nom = nom;
    }
    
    @Override
    public void afficher(){
        boolean test = super.Ouvrir(nom);
        if(test == true){
            super.LireFichier();
            for(int i = 0; i< text.size(); i++){
                System.out.println(text.get(i));
            }    
            
            }else {
                System.out.println("Fichier vide");
            }
    }
}
