package vinsetspiritueux.service;

import vinsetspiritueux.ctrl.Controller;
import vinsetspiritueux.models.Local;

/**
 * Classe représentant le service GestionVins de l'application MVC
 * "VinsEtSpiritueux" du module D400.
 *
 * @author <a href="mailto:paul.friedli@edufr.ch">Paul Friedli</a>
 * @since 08.12.2023
 * @version 1.1.0
 */
public class ServiceGestionVins {

    /**
     * La référence au contrôleur de l'application.
     */
    private Controller refCtrl;

    /**
     * Constructeur de la classe Service. Comme toujours, le travail N°1 consiste à
     * initialiser TOUS nos attributs :-).
     */
    public ServiceGestionVins() {
        this.refCtrl = null;
    }

    /**
     * Affiche la valeur du stock de bouteilles présentes dans les locaux fournis.
     * Pour les détails du format
     * d'affichage à respecter, référez-vous à la documentation reçue qui montre des
     * exemples précis.
     *
     * @param locaux les locaux dont on veut afficher la valeur du stock
     */
    public void afficherValeurStock(Local[] locaux) {
        System.out.println("=======================");
        System.out.println("Valeur totale du stock");
        System.out.println("=======================");

        double total = 0;

        for (int i = 0; i < locaux.length; i++) {
            System.out.println("Local : " + locaux[i] + " => " + locaux[i].valeurTotaleStock());
            total += locaux[i].valeurTotaleStock();
        }

        System.out.println("-----------------------");
        System.out.println("Total : " + total + " Frs");
        System.out.println("=======================");
    }

    /**
     * Affiche tous les détails disponibles pour les locaux fournis. Pour les
     * détails du format d'affichage à respecter,
     * référez-vous à la documentation reçue qui montre des exemples précis.
     *
     * @param locaux les locaux dont on veut afficher tous les détails
     */
    public void afficherTout(Local[] locaux) {
        System.out.println("=======================");

        for (int i = 0; i < locaux.length; i++) {
            System.out.println("Contenu du local : " + locaux[i]);
            for (int j = 0; j < locaux[i].getArmoires().length; j++) {
                System.out.println("  Armoire : " + locaux[i].getArmoires()[j]);
                for (int k = 0; k < locaux[i].getArmoires()[j].getBouteilles().length; k++) {
                    System.out.println("    " + locaux[i].getArmoires()[j].getBouteilles()[k] + " / "
                            + locaux[i].getArmoires()[j].getBouteilles()[k].getPrix());
                }
            }
        }

        System.out.println("=======================");
    }

    /**
     * Affiche des informations statistiques pour chacun des locaux fournis. Pour
     * les détails du format d'affichage à
     * respecter, référez-vous à la documentation reçue qui montre des exemples
     * précis.
     *
     * @param locaux les locaux pour lesquels on veut afficher tous les détails
     *               disponibles
     */
    public void afficherStatistiques(Local[] locaux) {
        for (int i = 0; i < locaux.length; i++) {
            System.out.println("Statistiques du local : " + locaux[i]);
            System.out.println(" => plus cher   : ")
        }
    }

    /**
     * Getter de la référence au contrôleur de l'application.
     *
     * @return la référence au contrôleur de l'application
     */
    public Controller getRefCtrl() {
        // VOTRE CODE ICI...
    }

    /**
     * Setter de la référence au contrôleur de l'application.
     *
     * @param ctrl la nouvelle référence au contrôleur de l'application
     */
    public void setRefCtrl(Controller ctrl) {
        // VOTRE CODE ICI...
    }

}
