package personnages;

public class Yakuza extends Humain {
    // Attributs supplémentaires
    private String clan;
    private int reputation;

    // Constructeur
    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
        this.reputation = 0; // La réputation est initialisée à 0 par défaut
    }

    // Méthodes
    public void extorquer(Commercant victime) {
        int argentExtorque = victime.seFaireExtorquer();
        gagnerArgent(argentExtorque);
        reputation += 1; // Augmente la réputation du Yakuza
        parler("J'ai extorqué " + argentExtorque + " sous du commerçant " + victime.getNom() + 
               ". Ma réputation est maintenant de " + reputation + ".");
    }

    // Accesseurs en lecture (getters) pour les nouveaux attributs
    public String getClan() {
        return clan;
    }

    public int getReputation() {
        return reputation;
    }
}
