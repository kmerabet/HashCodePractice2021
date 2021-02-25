import java.util.List;

public class Voiture {
	
	private int id;
	private List<String> rues;
	private int dureeFeuVert = 0;
	
	public Voiture(int id, List<String> rues) {
		this.id = id;
		this.rues = rues;
	}

	public int getId() {
		return id;
	}

	public List<String> getRues() {
		return rues;
	}

	public int getDureeFeuVert() {
		return dureeFeuVert;
	}

	public void setDureeFeuVert(int dureeFeuVert) {
		this.dureeFeuVert = dureeFeuVert;
	}
	
	
}
