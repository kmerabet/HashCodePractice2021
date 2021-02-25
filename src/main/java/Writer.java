import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writer {

    private int nbIntersectionsConcernees;
    private List<Schedule> listeSChedule;

    public Writer(int nbIntersectionsConcernees, List<Schedule> listeSChedule) {
        this.nbIntersectionsConcernees = nbIntersectionsConcernees;
        this.listeSChedule = listeSChedule;
    }

    public void write(String fileName) {
        try (FileWriter fileWriter = new FileWriter("sortants\\" + fileName); 
        		PrintWriter printWriter = new PrintWriter(fileWriter)
        		) {

            printWriter.println(nbIntersectionsConcernees);
            System.out.println("Wrote:");
            for (Schedule livraison : listeSChedule) {
                System.out.println(livraison.toString());
                printWriter.println(livraison.toString());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
