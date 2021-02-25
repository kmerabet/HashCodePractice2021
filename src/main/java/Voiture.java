import java.util.List;

public class Voiture {

	private int id;
	private List<Rue> rues;
	private int dureeFeuVert = 0;

	public Voiture(int id, List<Rue> rues) {
		this.id = id;
		this.rues = rues;
	}

	public List<Rue> getRues() {
		return rues;
	}

	public int getDureeFeuVert() {
		return dureeFeuVert;
	}

	public void setDureeFeuVert(int dureeFeuVert) {
		this.dureeFeuVert = dureeFeuVert;
	}

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\nVoiture{\n" +
                "   id=" + id +
                ",\n   Rues=" + rues +
                "\n}";
    }

}
