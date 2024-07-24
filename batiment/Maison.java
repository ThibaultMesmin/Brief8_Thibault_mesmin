package batiment;

import unités.Unités;

public class Maison extends Batiment {
    public Maison() {
        super("une maison");
    }

    public void abris(Unités unité) {
        System.out.println(unité.getNom() + " se repose dans une maison.");
    }
}
