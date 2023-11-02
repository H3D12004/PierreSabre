package personnages;

public class Humain {
    private String nom;
    private String boissonFavorite;
    private int argent;

    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }

    public void direBonjour() {
        parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
    }

    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    public void gagnerArgent(int gain) {
        argent += gain;
        parler("J'ai gagné " + gain + " sous, j'ai maintenant " + argent + " sous en poche.");
    }

    public void perdreArgent(int perte) {
        if (perte > argent) {
            parler("Je n'ai pas assez d'argent pour perdre " + perte + " sous.");
        } else {
            argent -= perte;
            parler("J'ai perdu " + perte + " sous, il me reste " + argent + " sous.");
        }
    }

    public void acheter(String bien, int prix) {
        if (prix > argent) {
            parler("Je ne peux pas acheter " + bien + " car il coûte " + prix + " sous et je n'ai que " + argent + " sous.");
        } else {
            argent -= prix;
            parler("J'ai acheté un(e) " + bien + " pour " + prix + " sous, il me reste " + argent + " sous.");
        }
    }

    public void parler(String texte) {
        System.out.println("(" + nom + ") - " + texte);
    }

    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }
}
