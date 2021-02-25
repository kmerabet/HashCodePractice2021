import java.io.File;

public class Main {
    public static void main(String[] args) {

        // ---------------- Test du reader --------------------
        System.out.println("---------------- Test du reader --------------------");
        File fichier = new File("entrants\\b.txt");
        Reader reader = new Reader(" ");
        DataSet dataSet = reader.read(fichier);

        System.out.println(dataSet.toString());
        /*System.out.println(dataSet.getDuration());
        System.out.println(dataSet.getNbIntersection());
        System.out.println(dataSet.getNbRue());
        System.out.println(dataSet.getListeVoitures());
        System.out.println(dataSet.getBonus());*/

        // ---------------- Test de l'algo 1 --------------------
        /*System.out.println("---------------- Test de l'algo 1 --------------------");
        Algo1 algo = new Algo1();
        List<Livraison> liste2 = algo.run(dataSet);

        Writer writer2 = new Writer(liste2.size(), liste2);
        writer2.write("submissionFileC.in");*/


        // ---------------- Test du writer --------------------
        /*System.out.println("---------------- Test du writer --------------------");
        int nbLivraisons = 3;
        Livraison liv1 = new Livraison(2, new int[]{0, 1});
        Livraison liv2 = new Livraison(3, new int[]{2, 3, 4});
        Livraison liv3 = new Livraison(4, new int[]{5, 6, 7, 8});
        List<Livraison> listeLivraisons = new ArrayList<>();
        listeLivraisons.add(liv1);
        listeLivraisons.add(liv2);
        listeLivraisons.add(liv3);

        Writer writer = new Writer(nbLivraisons, listeLivraisons);
        writer.write("submissionFile.in");*/

    }
}
