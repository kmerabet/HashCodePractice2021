import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    private final String SEPARATOR;

    private List<Rue> listeRue = new ArrayList<>();
    private List<Voiture> listeVoitures = new ArrayList<>();
    private int duration;
    private int nbIntersection;
    private int nbRue;
    private int nbVoiture;
    private int bonus;

    public Reader(String separateur) {
        this.SEPARATOR = separateur;
    }

    public DataSet read(File fichier) {
        try (FileInputStream stream = new FileInputStream(fichier); Scanner scanner = new Scanner(stream)) {

            //Lecture première ligne
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineContent = line.split(SEPARATOR);
                duration = Integer.parseInt(lineContent[0]);
                nbIntersection = Integer.parseInt(lineContent[1]);
                nbRue = Integer.parseInt(lineContent[2]);
                nbVoiture = Integer.parseInt(lineContent[3]);
                bonus = Integer.parseInt(lineContent[4]);

                System.out.println("duration " + duration + "; nbIntersection: " + nbIntersection + "; nbRue: " + nbRue + "; nbVoiture:" + nbVoiture + "; bonus:" + bonus);
            }

            // Lecture des autres lignes
            for (int i = 0; i < nbRue; i++) {
                String line = scanner.nextLine();

                String[] lineContent = line.split(SEPARATOR);
                int intersectEntrante = Integer.parseInt(lineContent[0]);
                int intersectSortante = Integer.parseInt(lineContent[1]);
                String nomRue = lineContent[2];
                int tempsParcours = Integer.parseInt(lineContent[3]);
                Rue newRue = new Rue(nomRue, intersectEntrante, intersectSortante, tempsParcours);

                listeRue.add(newRue);
                //TreeSet<String> listeRue = new TreeSet<>(liste);
            }

            for (int i = 0; i < nbVoiture; i++) {
                String line = scanner.nextLine();

                String[] lineContent = line.split(SEPARATOR);
                int nbRuesAParcourir = Integer.parseInt(lineContent[0]);
                List<String> listeRuesAParcourir = new ArrayList<>();
                for (int j = 1; j < nbRuesAParcourir + 1; j++) {
                    listeRuesAParcourir.add(lineContent[j]);
                }
                Voiture newVoiture = new Voiture(i, listeRuesAParcourir);

                listeVoitures.add(newVoiture);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new DataSet(duration, nbIntersection, nbRue, nbVoiture, bonus, listeRue, listeVoitures);
    }

}
