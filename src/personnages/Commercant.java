package personnages;

public class Commercant extends Humain {

    public Commercant(String nom, int argent) {
        super(nom, "thé", argent);
    }

    public int seFaireExtorquer() {
        int toutArgent = getArgent();
        perdreArgent(toutArgent);
        parler("Le monde est vraiment trop injuste !");
        return toutArgent;
    }

    public void recevoir(int argent) {
        gagnerArgent(argent);
        parler("Merci infiniment pour votre générosité !");
    }
}
