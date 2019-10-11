/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecteurfichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
/**
 *
 * @author Islam2
 */
    abstract class LecteurFichier implements IntefaceLecteur {
        protected ArrayList<String> text;
        private File fichier;
        private String nom;
        
        public LecteurFichier(){
            this.text = new ArrayList<>();   
            this.fichier = null;
        }
        
        @Override
        public boolean Ouvrir(String nom){
            fichier = new File(nom);
            if(fichier.isFile()){
                if(fichier.canRead()){
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public void LireFichier(){
            try {
                InputStream ips = new FileInputStream(fichier);
                InputStreamReader ipsr = new InputStreamReader(ips);
                BufferedReader br = new BufferedReader(ipsr);
                String ligne;
                while ((ligne = br.readLine())!= null){
                    text.add(ligne);
                }
                
            } catch (IOException e) {
            }
        }
        
        @Override
        public abstract void afficher();
        
        
    /*
        
    
            for (String text : Files.readAllLines(chemin)){
                System.out.println(text);
            }

        */
    
    
        
    }
