/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bataille;
import java.util.*;
/**
 *
 * @author licence
 */
public class Carte implements Iterable<Carte> {
    
    
    private static int valeur;
    private static couleur couleur;
    
    private  ArrayList<Carte> cartes ;
    
    public static couleur[] colorPaquet = new couleur[] {couleur.CARREAU,couleur.COEUR,couleur.PIQUE,couleur.TREFLE};
    public static int[] valuePaquet = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13};

    public Carte(ArrayList<Carte> cartes) {
        this.cartes = cartes;
    }
    
    public Carte(int nombre,couleur c) {
		Carte.valeur = nombre;
		Carte.couleur = c;
	}
    
            public void Paquet(){
                this.cartes = new ArrayList<>(52);
            }

    
    @Override
    public String toString() {
		return this.cartes.toString();	
	}
	
	public void AffichageListeCarte() {
            cartes.forEach((c) -> {
                c.toString();
        });
	}
        
        @Override
    public Iterator<Carte> iterator(){
        return cartes.iterator();
    }
	
	public void ajouterCarte(Carte c) {
		this.cartes.add(c);
	}
	
	public boolean estVide() {
		return this.cartes.isEmpty();
	}
	
	public Carte retirerCarte(int valeur) {
		return cartes.remove(valeur);
	}
	
	public Carte retirerCarte(Carte carte) {
		if(carte == null) {
			System.err.println("==================  LA CARTE SAISIE N'EXISTE PAS DANS LE PAQUET OU EST NULL  ==================");
			return null;
		}else {
			this.cartes.remove(carte);
			return carte;
		}	
	}
        public Carte getCarte(int index) {
		return cartes.get(index);
	}
	
	public void melanger() {
		Collections.shuffle(cartes, new Random(104));
	}

	public int getNombreCarte() {
		return this.cartes.size();
	}
	public boolean estContenu(Carte c) {
        return this.cartes.contains(c);
	}
    
    public enum couleur{
	PIQUE,
	CARREAU,
	COEUR,
	TREFLE;
        private int valeur;
	public boolean couleurSuperieur(couleur c2) {
		/*
		if(this.ordinal() > c2.ordinal()) {
			
			return true;
		}else {
			
			return false;
		}
		*/
		return this.ordinal() > c2.ordinal();
	}
        
   
    public couleur getCouleur() {
        return couleur;
    }

    
  	
}

    
    
}
