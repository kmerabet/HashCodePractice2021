import java.util.ArrayList;
import java.util.List;

public class Algo1 {

    /*
    Livraison simple: on livre toutes les pizzas possibles en commençant par les équipes de 4
     */

    public Algo1() {
    }

    public List<Livraison> run(DataSet dataSet) {
        System.out.println("Pizzas au départ: " + dataSet.getNbPizzas());

        // On calcule le nombre d'équipes livrables en fonction du nombre de pizzas disponibles
        int nbTeam4Livrables = dataSet.getNbPizzas() / 4;
        if (nbTeam4Livrables > dataSet.getNbTeam4()) {
            nbTeam4Livrables = dataSet.getNbTeam4();
        }
        int pizzasRestantes = dataSet.getNbPizzas() - (nbTeam4Livrables * 4);
        System.out.println("Nb team de 4 livrables: " + nbTeam4Livrables);
        System.out.println("Pizzas restantes: " + pizzasRestantes);

        int nbTeam3Livrables = pizzasRestantes / 3;
        if (nbTeam3Livrables > dataSet.getNbTeam3()) {
            nbTeam3Livrables = dataSet.getNbTeam3();
        }
        pizzasRestantes = pizzasRestantes - (nbTeam3Livrables * 3);
        System.out.println("Nb team de 3 livrables: " + nbTeam3Livrables);
        System.out.println("Pizzas restantes: " + pizzasRestantes);

        int nbTeam2Livrables = pizzasRestantes / 2;
        if (nbTeam2Livrables > dataSet.getNbTeam2()) {
            nbTeam2Livrables = dataSet.getNbTeam2();
        }
        pizzasRestantes = pizzasRestantes - (nbTeam2Livrables * 2);
        System.out.println("Nb team de 2 livrables: " + nbTeam2Livrables);
        System.out.println("Pizzas restantes: " + pizzasRestantes);

        List<Livraison> livraisons = new ArrayList<>();
        int indexPizzas = 0;

        /*
            On crée la liste de livraisons à écrire. On assigne les pizzas dans l'ordre, il n'y a aucune opti des ingrédients.
            On commence par assigner les pizzas aux équipes de 4, puis 3, puis 2.
         */
        for (int i = 0; i < nbTeam4Livrables; i++) {
            int[] commande = new int[]{indexPizzas, indexPizzas + 1, indexPizzas + 2, indexPizzas + 3};
            Livraison livraison = new Livraison(4, commande);
            livraisons.add(livraison);
            indexPizzas += 4;
        }

        for (int i = 0; i < nbTeam3Livrables; i++) {
            int[] commande = new int[]{indexPizzas, indexPizzas + 1, indexPizzas + 2};
            Livraison livraison = new Livraison(3, commande);
            livraisons.add(livraison);
            indexPizzas += 3;
        }

        for (int i = 0; i < nbTeam2Livrables; i++) {
            int[] commande = new int[]{indexPizzas, indexPizzas + 1};
            Livraison livraison = new Livraison(2, commande);
            livraisons.add(livraison);
            indexPizzas += 2;
        }

        return livraisons;
    }
}
