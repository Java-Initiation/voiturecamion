package models;

public class Camion extends Vehicule {

    public Camion(int annee, double prix) {
        super(annee, prix);
    }

    @Override
    public void demarrer() {
         System.out.println("Le camion démarre");
    }

    @Override
    public void accelerer() {
        System.out.println("Le camion accelere");
    }
}
