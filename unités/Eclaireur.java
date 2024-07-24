package unités;

public class Eclaireur extends Unités {
    public Eclaireur() {
        super("l'éclaireur");
    }

    public void reconnaissance() {
        System.out.println(getNom() + " part en reconnaissance.");
    }

    public void repos() {
        System.out.println(getNom() + " se repose dans la maison.");
    }
}
