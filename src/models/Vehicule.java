package models;

public abstract class Vehicule {

    private static int ct;
    private int matricule;
    private int annee;
    private double prix;
    protected boolean roule;

    public Vehicule(int annee, double prix) {
        this.matricule = ct++;
        this.annee = annee;
        this.prix = prix;
    }

    public abstract void demarrer();

    public abstract void accelerer();

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "matricule=" + matricule +
                ", annee=" + annee +
                ", prix=" + prix +
                '}';
    }

}
