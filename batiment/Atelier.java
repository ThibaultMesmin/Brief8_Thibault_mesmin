package batiment;

import unités.Unités;

public class Atelier extends Batiment {
    public Atelier() {
        super("l'atelier");
    }

    public void productionOutil(Unités unité) {
        System.out.println(unité.getNom() + " a produit un objet.");
    }

    public void productionArme(Unités unité) {
        System.out.println(unité.getNom() + " a forgé un arme !");
    }

    public void amélioration(Unités unité) {
        System.out.println(unité.getNom() + " a améliorer un batiment au niveau 2 !");
    }
}
