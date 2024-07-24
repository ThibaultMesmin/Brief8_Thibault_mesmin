package batiment;

import unités.Unités;
import java.util.List;

public class Defense extends Batiment {

    public Defense() {
        super("le mur de Défense");
    }

    // Accepte une liste d'unités
    public void protection(List<Unités> unités) {
        for (Unités unité : unités) {
            System.out.println("Une attaque a été déjouée par " + unité.getNom());
        }
    }
}
