package fr.jumanji.game.models;

import fr.jumanji.game.interfaces.PassePartout;

public class Lapin implements PassePartout {

    @Override
    public void donneLaCle() {
        
    System.out.println("\n(\\_/)\n" + "( •,•)\n" + "(\")_(\")\n");
    System.out.println("Crunch Crunch voici la clé!\n");  
    }

}
