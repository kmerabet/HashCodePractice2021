public class Livraison {

    private final String SEPARATOR = " ";
    private int tailleEquipe;
    private int[] listePizzas;

    public Livraison(int tailleEquipe, int[] listePizzas) {
        this.tailleEquipe = tailleEquipe;
        this.listePizzas = listePizzas;
    }

    public int getTailleEquipe() {
        return tailleEquipe;
    }

    public int[] getListePizzas() {
        return listePizzas;
    }

    @Override
    public String toString() {
        //On formate le tableau de pizzas
        StringBuilder formattedList = new StringBuilder();
        for (int listePizza : listePizzas) {
            formattedList.append(listePizza);
            formattedList.append(SEPARATOR);
        }
        //on retire le separateur en trop à la fin de la ligne
        formattedList.deleteCharAt(formattedList.lastIndexOf(SEPARATOR));

        return tailleEquipe + SEPARATOR + formattedList.toString();
    }
}
