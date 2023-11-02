package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
        this.reputation = 0;
    }
    
    public void extorquer(Commercant victime) {
        int argentExtorque = victime.seFaireExtorquer();
        gagnerArgent(argentExtorque);
        reputation++;
        parler("J'ai extorqué " + argentExtorque + " sous du commerçant " + victime.getNom() + 
               ". Ma réputation est maintenant de " + reputation + ".");
    }

    public int perdre() {
        int argentPerdu = getArgent();
        perdreArgent(argentPerdu);
        reputation--;
        parler("J'ai perdu le duel et ma réputation est maintenant de " + reputation + ".");
        parler("J’ai perdu le duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
        return argentPerdu;
    }

    public void gagner(int gain) {
        gagnerArgent(gain);
        reputation++;
        parler("J'ai gagné le duel et ma réputation est maintenant de " + reputation + ".");
    }

    public String getClan() {
        return clan;
    }

    public int getReputation() {
        return reputation;
    }
}
