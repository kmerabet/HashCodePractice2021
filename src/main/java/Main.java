import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ---------------- Test du reader --------------------
        System.out.println("---------------- Test du reader --------------------");
        File fichier = new File("entrants\\f.txt");
        Reader reader = new Reader(" ");
        DataSet dataSet = reader.read(fichier);

        System.out.println(dataSet.toString());
        System.out.println(dataSet.getDuration());
        System.out.println(dataSet.getNbIntersection());
        System.out.println(dataSet.getNbRue());
        System.out.println(dataSet.getListeVoitures());
        System.out.println(dataSet.getBonus());

        // ---------------- Test de l'algo 1 --------------------
        System.out.println("---------------- Test de l'algo 1 --------------------");
        Algo1 algo = new Algo1();
        List<Schedule> liste2 = algo.run(dataSet);

        Writer writer2 = new Writer(liste2.size(), liste2);
        writer2.write("submissionFileF.txt");


        // ---------------- Test du writer --------------------
        System.out.println("---------------- Test du writer --------------------");
        int A = 4;
        Rue r1 = new Rue("rue-de-londres",2,0,1);
        Rue r2 = new Rue("rue-d-amsterdam",0,1,1);
        Rue r3 = new Rue("rue-d-athenes",3,1,1);
        List<Rue> rueListe = new ArrayList();
        rueListe.add(r1);
        rueListe.add(r2);
        rueListe.add(r3);
        
        Schedule s1 = new Schedule(1, rueListe);
        Schedule s2 = new Schedule(2, rueListe);
        Schedule s3 = new Schedule(3, rueListe);
        List<Schedule> listeSchedule = new ArrayList();
        listeSchedule.add(s1);
        listeSchedule.add(s2);
        listeSchedule.add(s3);
        Writer writer = new Writer(A, listeSchedule);
        writer.write("testFile.txt");
        

    }
}
