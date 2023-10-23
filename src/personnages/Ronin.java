package personnages;

public class Ronin extends Humain {
    // Attribut supplémentaire
    private int honneur;

    // Constructeur
    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
        this.honneur = 1; // L'honneur est initialisé à 1 par défaut
    }

    // Méthodes
    public void donner(Commercant beneficiaire) {
        int don = getArgent() / 10; // Calculer 10% de l'argent du Ronin
        perdreArgent(don); // Le Ronin perd l'argent donné
        beneficiaire.recevoir(don); // Le commerçant reçoit l'argent
        parler("J'ai donné " + don + " sous à " + beneficiaire.getNom() + ".");
    }

    // Accesseurs en lecture (getters) pour les nouveaux attributs
    public int getHonneur() {
        return honneur;
    }
}
