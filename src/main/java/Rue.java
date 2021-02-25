import java.util.TreeSet;

public class Rue {

    private int nbIngredients;
    private TreeSet<String> listeIngredients;

    public Rue(int nbIngredients, TreeSet<String> listeIngredients) {

        this.nbIngredients = nbIngredients;
        this.listeIngredients = listeIngredients;
    }

    public int getNbIngredients() {
        return nbIngredients;
    }

    public void setNbIngredients(int nbIngredients) {
        this.nbIngredients = nbIngredients;
    }

    public TreeSet<String> getListeIngredients() {
        return listeIngredients;
    }

    public void setListeIngredients(TreeSet<String> listeIngredients) {
        this.listeIngredients = listeIngredients;
    }

    @Override
    public String toString() {
        return "\nPizza{\n" +
                "   nbIngredients=" + nbIngredients +
                ",\n   listeIngredients=" + listeIngredients +
                '}';
    }
}
