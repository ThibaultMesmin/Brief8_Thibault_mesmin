package batiment;
import unités.Unités;

public class Batiment {
    private String nomBatiment;

    // Constructeur
    public Batiment(String nomBatiment) {
        this.nomBatiment = nomBatiment;
    }

    // Getter pour le nom du bâtiment
    public String getNom() {
        return nomBatiment;
    }

    // Setter pour le nom du bâtiment
    public void setNom(String nomBatiment) {
        this.nomBatiment = nomBatiment;
    }

    // Méthode pour faire entrer une unité dans le bâtiment
    public void entré(Unités unité) {
        System.out.println(unité.getNom() + " rentre dans " + nomBatiment);
    }
}
