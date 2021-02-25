import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Reader {

    private final String SEPARATOR;
    private DataSet dataSet;

    private List<Rue> listePizzas = new ArrayList<>();
    private int nbPizzas;
    private int nbTeam2;
    private int nbTeam3;
    private int nbTeam4;

    public Reader(String separateur) {
        this.SEPARATOR = separateur;
    }

    public DataSet read(File fichier) {
        try (FileInputStream stream = new FileInputStream(fichier); Scanner scanner = new Scanner(stream)) {

            //Lecture première ligne
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineContent = line.split(SEPARATOR);
                nbPizzas = Integer.parseInt(lineContent[0]);
                nbTeam2 = Integer.parseInt(lineContent[1]);
                nbTeam3 = Integer.parseInt(lineContent[2]);
                nbTeam4 = Integer.parseInt(lineContent[3]);

                //System.out.println("Nb pizzas: " + nbPizzas + "; Nb duos: " + nbTeam2 + "; Nb trios: " + nbTeam3 + "; Nb quatuors:" + nbTeam4);
            }

            // Lecture des autres lignes
            while (scanner.hasNextLine()) {
                for (int i = 0; i < nbPizzas; i++) {
                    String line = scanner.nextLine();

                    //Recup du nb d'ingredients
                    int nbIngredients = Integer.parseInt(line.substring(0, line.indexOf(" ")));
                    //System.out.println("Nb ingrédients: " + nbIngredients + "; Liste ingredients: " + line.substring(line.indexOf(" ") + 1));

                    //Mise en forme dans un tableau ordonné
                    String[] lineContent = line.substring(line.indexOf(" ") + 1).split(SEPARATOR);
                    List<String> liste = new ArrayList<>(Arrays.asList(lineContent));
                    TreeSet<String> listeIngredients = new TreeSet<>(liste);

                    // Création des objets Pizza et ajout à la liste
                    Rue newPizza = new Rue(nbIngredients, listeIngredients);
                    listePizzas.add(newPizza);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new DataSet(nbPizzas, nbTeam2, nbTeam3, nbTeam4, listePizzas);
    }

}
