import java.util.List;

public class Voiture {
	
	private int id;
	private List<String> rues;
	
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
}
