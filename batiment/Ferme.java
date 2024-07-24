package batiment;

import unités.Unités;

public class Ferme extends Batiment {
    public Ferme() {
        super("la Ferme");
    }

    public void recolte(Unités unité) {
        System.out.println(unité.getNom() + " a récolté du blé à la ferme.");
    }
}
