package personnages;

public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
        this.honneur = 1;
    }
    
    public void donner(Commercant beneficiaire) {
        int don = getArgent() / 10;
        perdreArgent(don);
        beneficiaire.recevoir(don);
        parler("J'ai donné " + don + " sous à " + beneficiaire.getNom() + ".");
    }

    public void provoquer(Yakuza adversaire) {
        int force = honneur * 2;
        if (force >= adversaire.getReputation()) {
            int argentGagne = adversaire.perdre();
            gagnerArgent(argentGagne);
            honneur++;
            parler("J'ai gagné le duel contre " + adversaire.getNom() + " et mon honneur est maintenant de " + honneur + ".");
        } else {
            honneur--;
            int argentPerdu = getArgent();
            perdreArgent(argentPerdu);
            adversaire.gagner(argentPerdu);
            parler("J'ai perdu le duel contre " + adversaire.getNom() + " et mon honneur est maintenant de " + honneur + ".");
        }
    }

    public int getHonneur() {
        return honneur;
    }
}
