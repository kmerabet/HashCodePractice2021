public class Rue {

    private String nom;
    private int intersectionEntrant;
    private int intersectionSortant;
	private int tempsParcours;
	private int DureeFeuVert = 0;

    public Rue(String nom, int intersectionEntrant, int intersectionSortant, int tempsParcours) {
    	this.nom = nom;
        this.intersectionEntrant = intersectionEntrant;
        this.intersectionSortant = intersectionSortant;
        this.tempsParcours = tempsParcours;
    }

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

	public int getDureeFeuVert() {
		return DureeFeuVert;
	}

	public void setDureeFeuVert(int dureeFeuVert) {
		DureeFeuVert = dureeFeuVert;
	}
}
