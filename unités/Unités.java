package unités;

public class Unités {
    public static Object eclaireur;
    public String nomUnité;

    // ---------------------------------

    public Unités (String nomUnité) {
        this.nomUnité = nomUnité;
    }

    // ---------------------------------

    public String getNom() {
        return nomUnité;
    }

    public void setNom(String nomUnité) {
        this.nomUnité = nomUnité;
    }
}
