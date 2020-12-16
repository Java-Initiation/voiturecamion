import models.Camion;
import models.Voiture;

public class Main {

    public static void main(String[] args) {

        Camion camion = new Camion(2000, 8000);
        Voiture voiture = new Voiture(1995, 7500);

        camion.accelerer();
        voiture.demarrer();

    }

}
