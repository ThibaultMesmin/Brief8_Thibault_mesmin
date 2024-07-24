import java.util.Arrays;

import batiment.*;
import ressources.TypesRessources;
import unités.*;

public class Application {
    // Déclaration des différents types de bâtiments
    private Batiment atelier;
    private Batiment ferme;
    private Batiment maison;
    private Batiment caserne;
    private Batiment defense;

    // Constructeur pour initialiser les différents bâtiments
    public Application() {
        this.atelier = new Atelier();
        this.ferme = new Ferme();
        this.maison = new Maison();
        this.caserne = new Caserne();
        this.defense = new Defense();
    }

    // Méthode principale pour démarrer l'application
    public void start() {
        // Création des différentes unités
        Unités villageois = new Villageois();
        Unités soldat = new Soldat();
        Unités artisan = new Artisan();
        Chef chef = new Chef();
        TypesRessources typesRessources = new TypesRessources(34, 6, 23, 4);
        Eclaireur eclaireur = new Eclaireur();
        

        atelier.entré(artisan);
        ((Atelier) atelier).productionOutil(artisan);

        ferme.entré(villageois);
        ((Ferme) ferme).recolte(villageois);
        
        maison.entré(villageois);
        ((Maison) maison).abris(villageois);

        typesRessources.getNombreBois();
        typesRessources.getNombreFer();
        typesRessources.getNombrePierre();
        typesRessources.getNombreNourriture();

        caserne.entré(soldat);
        ((Caserne) caserne).militaire(soldat);

        defense.entré(soldat);
        ((Defense) defense).protection(Arrays.asList(soldat, chef));

        chef.motivex();
        chef.buff();
 
        eclaireur.reconnaissance(); 
        maison.entré(eclaireur);     
        eclaireur.repos();           
    }

    // Méthode principale pour lancer l'application
    public static void main(String[] args) {
        Application app = new Application();
        app.start();
    }
}
