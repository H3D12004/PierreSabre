package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
    public static void main(String[] args) {
        Humain prof = new Humain("Prof", "kombucha", 54);

        prof.direBonjour();
        prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");

        prof.acheter("boisson", 12);
        prof.boire();

        prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");
        prof.acheter("jeu", 2);

        prof.parler("Je n'ai plus que " + prof.getArgent() + " sous en poche. Je ne peux même pas m'offrir un kimono à 50 sous");
        
        Commercant marco = new Commercant("Marco", 20);

        marco.direBonjour();

        marco.seFaireExtorquer();

        marco.recevoir(15);
        marco.parler("15 sous ! Je te remercie généreux donateur!");

        marco.boire();
        
        marco = new Commercant("Marco", 15);

        
        
        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");

        yakuLeNoir.direBonjour();

        yakuLeNoir.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");

        yakuLeNoir.parler("Marco, si tu tiens à la vie donne moi ta bourse !");
        yakuLeNoir.extorquer(marco);

        yakuLeNoir.parler("J’ai piqué les 15 sous de Marco, ce qui me fait " + yakuLeNoir.getArgent() + " sous dans ma poche. Hi ! Hi !");
    
        
        
        marco = new Commercant("Marco", 0);

        Ronin roro = new Ronin("Roro", "shochu", 60);

        roro.direBonjour();

        roro.donner(marco);
        
        
        Yakuza y = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");

        
        Ronin r = new Ronin("Roro", "shochu", 60);

        
        r.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
        r.provoquer(y);

    }
}
