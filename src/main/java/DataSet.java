import java.util.List;

public class DataSet {
    int nbPizzas;
    int nbTeam2;
    int nbTeam3;
    int nbTeam4;

    List<Rue> listePizzas;

    public DataSet() {
    }

    public DataSet(int nbPizzas, int nbTeam2, int nbTeam3, int nbTeam4, List<Rue> listePizzas) {
        this.nbPizzas = nbPizzas;
        this.nbTeam2 = nbTeam2;
        this.nbTeam3 = nbTeam3;
        this.nbTeam4 = nbTeam4;
        this.listePizzas = listePizzas;
    }

    public int getNbPizzas() {
        return nbPizzas;
    }

    public int getNbTeam2() {
        return nbTeam2;
    }

    public int getNbTeam3() {
        return nbTeam3;
    }

    public int getNbTeam4() {
        return nbTeam4;
    }

    public List<Rue> getListePizzas() {
        return listePizzas;
    }

    @Override
    public String toString() {
        return "DataSet{\n" +
                "nbPizzas= " + nbPizzas +
                ",\nnbTeam2= " + nbTeam2 +
                ",\nnbTeam3= " + nbTeam3 +
                ",\nnbTeam4= " + nbTeam4 +
                ",\nlistePizzas= " + listePizzas.toString() +
                '}';
    }
}
