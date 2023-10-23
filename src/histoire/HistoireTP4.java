package histoire;

import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {
    public static void main(String[] args) {
        // Création d'un objet Humain nommé "Prof"
        Humain prof = new Humain("Prof", "kombucha", 54);

        // Prof se présente et indique combien d'argent il a
        prof.direBonjour();
        prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");

        // Prof achète une boisson et boit
        prof.acheter("boisson", 12);
        prof.boire();

        // Prof indique combien d'argent il lui reste et achète un jeu
        prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");
        prof.acheter("jeu", 2);

        // Prof indique qu'il ne peut pas se permettre un kimono
        prof.parler("Je n'ai plus que " + prof.getArgent() + " sous en poche. Je ne peux même pas m'offrir un kimono à 50 sous");
        
        // Création d'un objet Commercant nommé "Marco"
        Commercant marco = new Commercant("Marco", 20);

        // Marco se présente
        marco.direBonjour();

        // Marco se fait extorquer et perd tout son argent
        marco.seFaireExtorquer();

        // Marco reçoit de l'argent d'un donateur
        marco.recevoir(15);
        marco.parler("15 sous ! Je te remercie généreux donateur!");

        // Marco boit son thé
        marco.boire();
    }
}
