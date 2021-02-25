import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ---------------- Test du reader --------------------
        System.out.println("---------------- Test du reader --------------------");
        File fichier = new File("entrants\\c_many_ingredients.in");
        Reader reader = new Reader(" ");
        DataSet dataSet = reader.read(fichier);

//        System.out.println(dataSet.toString());
        System.out.println(dataSet.getNbPizzas());
        System.out.println(dataSet.getNbTeam2());
        System.out.println(dataSet.getNbTeam3());
        System.out.println(dataSet.getNbTeam4());

        // ---------------- Test de l'algo 1 --------------------
        System.out.println("---------------- Test de l'algo 1 --------------------");
        Algo1 algo = new Algo1();
        List<Livraison> liste2 = algo.run(dataSet);

        Writer writer2 = new Writer(liste2.size(), liste2);
        writer2.write("submissionFileC.in");


        // ---------------- Test du writer --------------------
        System.out.println("---------------- Test du writer --------------------");
        int nbLivraisons = 3;
        Livraison liv1 = new Livraison(2, new int[]{0, 1});
        Livraison liv2 = new Livraison(3, new int[]{2, 3, 4});
        Livraison liv3 = new Livraison(4, new int[]{5, 6, 7, 8});
        List<Livraison> listeLivraisons = new ArrayList<>();
        listeLivraisons.add(liv1);
        listeLivraisons.add(liv2);
        listeLivraisons.add(liv3);

        Writer writer = new Writer(nbLivraisons, listeLivraisons);
        writer.write("submissionFile.in");

    }
}
