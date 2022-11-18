package fr.jumanji.game.main;



import java.util.Scanner;

import fr.jumanji.game.enums.Armes;
import fr.jumanji.game.enums.Attaques;
import fr.jumanji.game.models.Chasseur;
import fr.jumanji.game.models.Joueur;



public class Main {
    
    public static final String RESET = "\033[0m";
    public static final String YELLOW = "\033[0;33m";

   
    
    public static void regleDuJeu() {
        
        
        System.out.println("  _________   _______               _______    _         _________  _________\n"
                + "  \\__    _/  (  ___  )  |\\     /|  (  ___  )  ( (    /|  \\__    _/  \\__   __/\n"
                + "     )  (    | (   ) |  | )   ( |  | (   ) |  |  \\  ( |     )  (       ) (   \n"
                + "     |  |    | (___) |  | |   | |  | (___) |  |   \\ | |     |  |       | |   \n"
                + "     |  |    |  ___  |  ( (   ) )  |  ___  |  | (\\ \\) |     |  |       | |   \n"
                + "     |  |    | (   ) |   \\ \\_/ /   | (   ) |  | | \\   |     |  |       | |   \n"
                + "  |\\_)  )    | )   ( |    \\   /    | )   ( |  | )  \\  |  |\\_)  )    ___) (___\n"
                + "  (____/     |/     \\|     \\_/     |/     \\|  |/    )_)  (____/     \\_______/\n");
   

        
        System.out.println("---------------------------------------LES REGLES DU JEU------------------------------------------------------------\n");
        System.out.println("JAVANJI, un jeu pour tous ceux qui espèrent laisser derrière eux leur univers.\n");
        System.out.println("Vous allez devoir choisir un personnage");
        System.out.println("L'objectif est de trouver des clés, dès que vous trouvez 3 clés, vous avez gagné!");
        System.out.println("Aventurier, méfiez-vous... un chasseur rode dans les parages. Si vous tombez dessus, vous allez devoir le combattre!\n");
        System.out.println("Le Chasseur: qualite: endurance, point de défense: 7\n");
        System.out.println("Choisissez bien votre personnage en fonction de ses caractéristiques pour gagner le combat contre le chasseur\n");
        System.out.println("L'intello: qualite: logique, point de défense: 4");
        System.out.println("Le Boloss: qualite: force, point de défense: 6 ");
        System.out.println("La Bimbo: qualite: charme, point de défense: 8 \n");
        System.out.println("Une defaite contre le chasseur = -1 vie; vous commencez la partie avec 3 vies, quand il en reste 0: END OF THE GAME");
        System.out.println("---------------------------------------------------------------------------------------------------------------------\n");
    }
    
    public static void gameOver() {
        Scanner scan=new Scanner(System.in);

        
        
        System.out.println(" #####     #    #     # #######    ####### #     # ####### ######  \n"
                + "#     #   # #   ##   ## #          #     # #     # #       #     # \n"
                + "#        #   #  # # # # #          #     # #     # #       #     # \n"
                + "#  #### #     # #  #  # #####      #     # #     # #####   ######  \n"
                + "#     # ####### #     # #          #     #  #   #  #       #   #   \n"
                + "#     # #     # #     # #          #     #   # #   #       #    #  \n"
                + " #####  #     # #     # #######    #######    #    ####### #     # ");
        
        
        System.out.println("\nRejouer ?  1:oui || 2: non\n");
        int response = scan.nextInt();
       
        if(response==1) {
            start();
               
            
        } else {
            System.out.println("\nBisous !");
        }
        
        
        
    }
    
    public static void youWin() {
        
        Scanner scan=new Scanner(System.in);

        
        
        System.out.println(YELLOW+"                                 .''.       \n"
                + "       .''.      .        *''*    :_\\/_:     . \n"
                + "      :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\n"
                + "  .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=-\n"
                + " :_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.'\n"
                + " : /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  *\n"
                + "  '..'  ':::'     * /\\ *     .'/.\\'.   '\n"
                + "      *            *..*         :"+RESET);
        
        
        System.out.println("\nRejouer ?  1:oui || 2: non\n");
        int response = scan.nextInt();
       
        if(response==1) {
            start();
               
            
        } else {
            System.out.println("\nBisous !");
        }
        
        
    }
    
    public static void start() {
        
        Chasseur chasseur=new Chasseur("Chasseur","endurance",7);
        
        Joueur intello=new Joueur("Intello", "logique", 4, 3, 0);
        intello.setArme(Armes.DICTIONNAIRE);
        intello.setAttaque(Attaques.FRAPPER);
        
        Joueur boloss=new Joueur("Boloss", "force", 6, 3, 0);
        boloss.setArme(Armes.MAIN);
        boloss.setAttaque(Attaques.DONNER_COUP_DE_POING);
   
        Joueur bimbo=new Joueur("Bimbo", "charme", 8, 3, 0);
        bimbo.setArme(Armes.SABRE);
        bimbo.setAttaque(Attaques.KUNG_FU);
        
        
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Quel personnage souhaitez-vous choisir? 1 : Boloss || 2: Intello || 3: Bimbo");
        System.out.println("------------------------------------------------------------------------------------------");

        
        
        int choixPersonnage=scan.nextInt();
       
        
       if (choixPersonnage==1) {
      
            System.out.println("Vous avez choisi le boloss"); 
           // System.out.println("Marchons vers de nouvelles contrées.... où aller? : gauche: 1 || droite: 2  ");
               
            boloss.marche(boloss,chasseur);
            
            
            if(boloss.getCompteurVie()==0) {
                
                System.out.println("Vous avez perdu la perdue la partie... \n");
                gameOver();
            }
            if (boloss.getCompteurCle()==3) {
                
                System.out.println("Bravoooo!!! Vous avez gagné la partie!!");
                youWin();
               
            }
            
            
       }
       else if (choixPersonnage==2) {
           
           System.out.println("Vous avez choisi l'intello");
           
           intello.marche(intello,chasseur);
           
           
           if(intello.getCompteurVie()==0) {
               
               System.out.println("Vous avez perdu la perdue la partie... \n");
               gameOver();
           }
           if (intello.getCompteurCle()==3) {
               
               System.out.println("Bravoooo!!! Vous avez gagné la partie!!");
               youWin();
           }
          
            
       }
       else if (choixPersonnage==3) {
            System.out.println("Vous avez choisi la bimbo");
            
            bimbo.marche(bimbo,chasseur);
            
            
            if(bimbo.getCompteurVie()==0) {
                
                System.out.println("Vous avez perdu la perdue la partie...\n");
                gameOver();
            }
            if (bimbo.getCompteurCle()==3) {
                
                System.out.println("Bravoooo!!! Vous avez gagné la partie!!\n");
                youWin();
            }
            
       }
        
       
    }
    
    
    
   

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

      
        regleDuJeu();
        start();
      
        
        
    }

}
