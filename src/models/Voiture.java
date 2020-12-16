package models;

public class Voiture extends Vehicule {

    public Voiture(int annee, double prix) {
        super(annee, prix);
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre");
    }

    @Override
    public void accelerer() {
        System.out.println("Le voiture accelere");
    }

}
