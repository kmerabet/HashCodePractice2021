import java.util.List;

public class Schedule {

    private int idIntersection;
    private List<Rue> rues;
    
    private static final String SEPARATOR = "/n";

    public Schedule(int idIntersection, List<Rue> rues) {
        this.idIntersection = idIntersection;
        this.rues = rues;
    }

    public int getIDIntersections() {
        return idIntersection;
    }

	public List<Rue> getRues() {
		return rues;
	}
	
	@Override
	public String toString() {
		//On formate le tableau de pizzas
		StringBuilder formattedList = new StringBuilder();

		formattedList.append(idIntersection);
		formattedList.append(SEPARATOR);
		formattedList.append(rues.size());
		formattedList.append(SEPARATOR);
		
		for (Rue rue : rues) {
			formattedList.append(rue.getName() + " " + rue.getDureeFeuVert());
			formattedList.append(SEPARATOR);
		}
		
		//on retire le separateur en trop a la fin de la ligne
		formattedList.deleteCharAt(formattedList.lastIndexOf(SEPARATOR));
		
		return formattedList.toString();
	}
}
