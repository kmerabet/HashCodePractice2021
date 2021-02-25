import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ---------------- Test du reader --------------------
        System.out.println("---------------- Test du reader --------------------");
        File fichier = new File("entrants\\b.txt");
        Reader reader = new Reader(" ");
        DataSet dataSet = reader.read(fichier);

//        System.out.println(dataSet.toString());
//        System.out.println(dataSet.getNbPizzas());
//        System.out.println(dataSet.getNbTeam2());
//        System.out.println(dataSet.getNbTeam3());
//        System.out.println(dataSet.getNbTeam4());

        // ---------------- Test de l'algo 1 --------------------
        System.out.println("---------------- Test de l'algo 1 --------------------");
        Algo1 algo = new Algo1();
        List<Schedule> liste2 = algo.run(dataSet);

        Writer writer2 = new Writer(liste2.size(), liste2);
        writer2.write("submissionFileC.in");


        // ---------------- Test du writer --------------------
        System.out.println("---------------- Test du writer --------------------");
        int nbLivraisons = 3;
        Schedule liv1 = new Schedule(2, new int[]{0, 1});
        Schedule liv2 = new Schedule(3, new int[]{2, 3, 4});
        Schedule liv3 = new Schedule(4, new int[]{5, 6, 7, 8});
        List<Schedule> listeLivraisons = new ArrayList<>();
        listeLivraisons.add(liv1);
        listeLivraisons.add(liv2);
        listeLivraisons.add(liv3);

        Writer writer = new Writer(nbLivraisons, listeLivraisons);
        writer.write("submissionFile.in");

    }
}
