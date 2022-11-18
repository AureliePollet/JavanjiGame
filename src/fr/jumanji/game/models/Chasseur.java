package fr.jumanji.game.models;

import fr.jumanji.game.enums.Armes;
import fr.jumanji.game.enums.Attaques;

public class Chasseur extends Personnage {
    

public Chasseur(){
    
}

public Chasseur(String nom, String qualite, int pointDeDefense) {
    super(nom, qualite, pointDeDefense);
    this.setArme(Armes.FUSIL);
    this.setAttaque(Attaques.TIRER);
}



}
