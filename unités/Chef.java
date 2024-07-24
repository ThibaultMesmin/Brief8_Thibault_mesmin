package unités;

public class Chef extends Unités{
    public Chef() {
        super("le chef");
    }

    public void motivex() {
        System.out.println(getNom() + " a ajouté 1 point de motivation aux soldats.");
    }

    public void buff() {
        System.out.println(getNom() + " a ajouté 1 point de rapidé aux artisans.");
    }
}
