package ressources;

public class TypesRessources {
    private int nombreBois;
    private int nombreFer;
    private int nombrePierre;
    private int nombreNourriture;
    
    public TypesRessources(int nombreBois, int nombreFer, int nombrePierre, int nombreNourriture) {
        this.nombreBois = nombreBois;
        this.nombreFer = nombreFer;
        this.nombrePierre = nombrePierre;
        this.nombreNourriture = nombreNourriture;
    }

    public int getNombreBois() {
        System.out.println(nombreBois + " bois ont été récoltés");
        return nombreBois;
    }

    public void setNombreBois(int nombreBois) {
        this.nombreBois = nombreBois;
    }

    public int getNombreFer() {
        System.out.println(nombreFer + " morceaux de fer ont été récoltés");
        return nombreFer;
    }

    public void setNombreFer(int nombreFer) {
        this.nombreFer = nombreFer;
    }

    public int getNombrePierre() {
        System.out.println(nombrePierre + " pierres ont été récoltés");
        return nombrePierre;
    }

    public void setNombrePierre(int nombrePierre) {
        this.nombrePierre = nombrePierre;
    }

    public int getNombreNourriture() {
        System.out.println(nombreNourriture + " poulets ont été attrapés");
        return nombreNourriture;
    }

    public void setNombreNourriture(int nombreNourriture) {
        this.nombreNourriture = nombreNourriture;
    }

}
