import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writer {

    private int nbLivraisons;
    private List<Schedule> listeLivraisons;

    public Writer(int nbLivraisons, List<Schedule> listeLivraisons) {
        this.nbLivraisons = nbLivraisons;
        this.listeLivraisons = listeLivraisons;
    }

    public void write(String fileName) {
        try (FileWriter fileWriter = new FileWriter("sortants\\" + fileName); 
        		PrintWriter printWriter = new PrintWriter(fileWriter)
        		) {

            printWriter.println(nbLivraisons);
            System.out.println("Wrote:");
            for (Schedule livraison : listeLivraisons) {
                System.out.println(livraison.toString());
                printWriter.println(livraison.toString());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
