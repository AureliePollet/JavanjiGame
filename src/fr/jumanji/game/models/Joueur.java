package fr.jumanji.game.models;

import java.util.Random;
import java.util.Scanner;

import fr.jumanji.game.interfaces.PassePartout;

public class Joueur extends Personnage  {
    
    private int compteurVie=3;
    private int compteurCle=0;  
    public static final String RESET = "\033[0m";


    public Joueur() {
       
    }

    public Joueur(String nom, String qualite, int pointDeDefense, int compteurVie, int compteurCle) {
        super(nom, qualite, pointDeDefense);
        this.compteurCle=compteurCle;
        this.compteurVie=compteurVie;
        
    }
    
    public void marche(Joueur joueur, Chasseur chasseur ) {
        
        
       Scanner scan=new Scanner(System.in);
       
        while(joueur.getCompteurVie()>0 && joueur.getCompteurCle()<3) {
        final int MAX = 2;
        Random rand = new Random();
       
            
        int choix = rand.nextInt(MAX) + 1;
    
       
        System.out.println("Pour aller à gauche, tapez 1 || Pour aller à droite, tapez 2");
        
        int choixFictif=scan.nextInt();
        
        /*
         * try { System.in.read(); } catch (Exception e) { }
         */
        
        
        if (choix==1) {
            System.out.println("Vous êtes tombé sur le chasseur");
            System.out.println("Sortez votre arme!!\n");
            joueur.switchArme();
            joueur.switchAttaque();
            chasseur.switchArme();
            chasseur.switchAttaque();
            
            
            if(joueur.getPointDeDefense()>7) {
                System.out.println("Vous avez gagné votre combat!\n");
            }
            else {
                System.out.println("Vous n'êtes pas assez fort....PERDUUUU");
                System.out.println("Vous avez perdu une vie!");
                joueur.compteurVie--;
                System.out.println("Il vous reste "+joueur.compteurVie+ " vies\n");
            }
        }
        
        else if(choix==2) {
            Lapin passePartout=new Lapin();
            passePartout.donneLaCle();
          
            
            compteurCle++;
            System.out.println("Vous avez "+joueur.compteurCle+ " clés\n");
        }
        
      
    
        }  
    }

    @Override
    public String toString() {
   
        return super.toString()+  " compteur vie: " + compteurVie + ", compteur cle=" + compteurCle ;
    }

    public int getCompteurVie() {
        return compteurVie;
    }

    public void setCompteurVie(int compteurVie) {
        this.compteurVie = compteurVie;
    }

    public int getCompteurCle() {
        return compteurCle;
    }

    public void setCompteurCle(int compteurCle) {
        this.compteurCle = compteurCle;
    }

  
    
    

   

  

  
    
    

}
