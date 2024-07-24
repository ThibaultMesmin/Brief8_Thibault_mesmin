package batiment;

import unités.Unités;

public class Caserne extends Batiment {
    public Caserne() {
        super("la Caserne");
    }

    public void militaire(Unités unité) {
        System.out.println(unité.getNom() + " a été formé !");
    }
}
