import java.util.TreeSet;

public class Rue {

    private String nom;
    private int intersectionEntrant;
    private int intersectionSortant;
	private int tempsParcours;

    public Rue(String nom, int intersectionEntrant, int intersectionSortant, int tempsParcours) {
    	this.nom = nom;
        this.intersectionEntrant = intersectionEntrant;
        this.intersectionSortant = intersectionSortant;
        this.tempsParcours = tempsParcours;
    }

//    public int getNbIngredients() {
//        return 0;
//    }
//
//    public void setNbIngredients(int nbIngredients) {
//        //this.nbIngredients = nbIngredients;
//    }
//
//    public TreeSet<String> getListeIngredients() {
//		return null;
//    }
//
//    public void setListeIngredients(TreeSet<String> listeIngredients) {
//        //this.listeIngredients = listeIngredients;
//    }

    @Override
    public String toString() {
        return "\nRue{\n" +
                "   nom=" + nom +
                ",\n   intersectionEntrant=" + intersectionEntrant +
                ",\n   intersectionSortant=" + intersectionSortant +
                ",\n   tempsParcours=" + tempsParcours +
                '}';
    }

	public String getName() {
		return nom;
	}

	public int getIntersectionEntrant() {
		return intersectionEntrant;
	}

	public int getIntersectionSortant() {
		return intersectionSortant;
	}

	public int getTempsParcours() {
		return tempsParcours;
	}
}
