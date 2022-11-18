package fr.jumanji.game.models;

import fr.jumanji.game.enums.Armes;
import fr.jumanji.game.enums.Attaques;

abstract public class Personnage {

    private String nom;
    private String qualite;
    private int pointDeDefense;
    private Armes arme;
    private Attaques attaque; 
    public static final String YELLOW = "\033[0;33m"; 
    public static final String RED = "\033[0;31m"; 
    public static final String GREEN = "\033[0;32m"; 
    public static final String RESET = "\033[0m";


    
    
    public Personnage() {
        
    }
    
    public Personnage (String nom, String qualite,int pointDeDefense) {
        
        this.nom=nom;
        this.qualite=qualite;
        this.pointDeDefense=pointDeDefense;
     
    }
    
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getQualite() {
        return qualite;
    }

    public void setQualite(String qualite) {
        this.qualite = qualite;
    }

    public int getPointDeDefense() {
        return pointDeDefense;
    }

    public void setPointDeDefense(int pointDeDefense) {
        this.pointDeDefense = pointDeDefense;
    }

    public Armes getArme() {
        return arme;
    }

    public void setArme(Armes arme) {
        this.arme = arme;
    }

    public Attaques getAttaque() {
        return attaque;
    }

    public void setAttaque(Attaques attaque) {
        this.attaque = attaque;
    }
    
    public void switchAttaque() {
        
        switch(this.attaque) {
        
        case TIRER:
            System.out.println(GREEN+"Je vais tireeer...PAN PAN\n"+RESET);
            break;
        
        case FRAPPER:
            System.out.println(YELLOW+"Ca va faire mal....BAM BAM\n"+RESET);
            break;
        
        case DONNER_COUP_DE_POING:
            System.out.println(YELLOW+"Le boloss arrive.....BOUM\n"+RESET);
            break;
        
        case KUNG_FU:
            System.out.println(YELLOW+"Hihaaaa...attaque Kung Fuu\n"+RESET);
            break;
            
        }
       
    }
    
 public void switchArme() {
        
        switch(this.arme) {
        
        case SABRE:
            System.out.println(YELLOW+"Joueur: Attention à mon Sabre! "+RESET);
            break;
        
        case DICTIONNAIRE:
            System.out.println(YELLOW+"Joueur: Attention à mon dictionnaire! "+RESET);
            break;
        
        case MAIN:
            System.out.println(YELLOW+"Joueur: Attention à mes mains!"+RESET);
            break;
        
        case FUSIL:
            System.out.println(GREEN+"Chasseur: Attention à mon fusil, un tir suffit! "+RESET);
            break;
            
        }
       
    }

    @Override
    public String toString() {
        return "Personnage nom: " + nom + ", qualite: " + qualite + ", point de défense: " + pointDeDefense   ;
    }
    
    
  
    
   
    
    
    
}
