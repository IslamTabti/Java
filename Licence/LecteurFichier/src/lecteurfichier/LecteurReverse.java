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
public class LecteurReverse extends LecteurFichier implements InterfaceLecteur {
    
    private final String nom;
    
    public LecteurReverse(String nom) {
        super();
        this.nom = nom;
    }
        
    /**
     *
     */
    

    @Override
    public void afficher() {
    }
    
}
