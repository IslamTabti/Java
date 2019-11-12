/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataille;
import java.util.*;

/**
 *
 * @author Islam
 */
public class Joueur {
    private String nom;
    private Carte paquet; 
    private static int score;
    
    public Joueur() {
    }
    
    public Joueur(String nom){
        this.nom = nom;
        Joueur.score = 0;
    }
    
    /*public void Jeu(){
        this.paquet = 
    }
    */
    
    public String getNom(){
        return nom;
    }

    public Carte getPaquet(){
        return paquet;
    }
	
	public Carte jouer() {
		Carte aJouer = choisirCarte();
		this.paquet.retirerCarte(aJouer);
		return aJouer;
	}
	
	public abstract Carte choisirCarte();
	
        public void recupereCarte(Carte c){
            c.toString();
        }

	public boolean Perdu(){
            if (this.paquet.estVide()) {
                return true;
            }else
                return false;
            
        }
        
        public int GetScore(){
            return Joueur.score;
        }
	
        public void Gagne(){
            Joueur.score++;
        }

	public int GetNbCartesJoueur(){
            return this.paquet.getNombreCarte();
        }
	
	public void gagnerCarte(Carte c) {
		this.paquet.ajouterCarte(c);
	}
	
    @Override
        public String toString(){
            return this.nom;
        }    
    
}
