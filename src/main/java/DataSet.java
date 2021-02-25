import java.util.List;
import java.util.Map;

public class DataSet {
    int duration;
    int nbIntersection;
    int nbRue;
    int nbVoiture;
    int bonus;

    Map<String, Rue> listeRues;
    List<Voiture> listeVoitures;

    public DataSet() {
    }

    public DataSet(int duration, int nbIntersection, int nbRue, int nbVoiture, int bonus, Map<String, Rue> listeRue, List<Voiture> listeVoitures) {
        this.duration = duration;
        this.nbIntersection = nbIntersection;
        this.nbRue = nbRue;
        this.nbVoiture = nbVoiture;
        this.bonus = bonus;
        this.listeRues = listeRue;
        this.listeVoitures = listeVoitures;
    }


    @Override
    public String toString() {
        return "DataSet{\n" +
                "duration= " + duration +
                ",\nnbIntersection= " + nbIntersection +
                ",\nnbRue= " + nbRue +
                ",\nnbVoiture= " + nbVoiture +
                ",\nbonus= " + bonus +
                ",\nlisteRues= " + listeRues +
                ",\nlisteVoitures= " + listeVoitures +
                '}';
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNbIntersection() {
        return nbIntersection;
    }

    public void setNbIntersection(int nbIntersection) {
        this.nbIntersection = nbIntersection;
    }

    public int getNbRue() {
        return nbRue;
    }

    public void setNbRue(int nbRue) {
        this.nbRue = nbRue;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getNbVoiture() {
        return nbVoiture;
    }

    public void setNbVoiture(int nbVoiture) {
        this.nbVoiture = nbVoiture;
    }

    public Map<String, Rue> getListeRues() {
        return listeRues;
    }

    public void setListeRues(Map<String, Rue> listeRues) {
        this.listeRues = listeRues;
    }

    public List<Voiture> getListeVoitures() {
        return listeVoitures;
    }

    public void setListeVoitures(List<Voiture> listeVoitures) {
        this.listeVoitures = listeVoitures;
    }
}
