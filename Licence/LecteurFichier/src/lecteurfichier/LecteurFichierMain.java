/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecteurfichier;
 
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;

/**
 *
 * @author Islam2
 */
public class LecteurFichierMain {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {        
        
        Path chemin = Paths.get("C:\\Users\\Islam2\\Documents\\NetBeansProjects\\LecteurFichier\\src\\lecteurfichier\\Fichier.txt");
        String name = new File("C:\\Users\\Islam2\\Documents\\NetBeansProjects\\LecteurFichier\\src\\lecteurfichier\\Fichier.txt").getName();
        List<String> lignes = Files.readAllLines(chemin);
        
        System.out.println(" Nom du fichier : " + name + "\n" +
                           " Le fichier est Lisible : " + Files.isReadable(chemin) + "\n" +
                           " Modifiable : "  + Files.isWritable(chemin) + "\n" +
                           " Exécutable : " + Files.isExecutable(chemin));                                  
        
        LecteurFichierTxt lanceur1 = new LecteurFichierTxt("C:\\Users\\Islam2\\Documents\\Fichier.txt") {};
        lanceur1.afficher();
        
        LecteurFichierTxt lanceur2 = new LecteurFichierTxt("C:\\Users\\Islam2\\Documents\\Fichier.txt") {};
        lanceur2.afficherp();
               
        
         
        
        
        
    }    
}
