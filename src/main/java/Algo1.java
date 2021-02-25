import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Algo1 {

    public Algo1() {
    }

    public List<Schedule> run(DataSet dataSet) {
    	List<Schedule> schedules = new ArrayList<Schedule>();
    	
    	List<Voiture> voitures = dataSet.getListeVoitures();
    	Map<String, Rue> rues = dataSet.getListeRues();
    	
    	Set<Rue> ruesUtilisees = new HashSet<Rue>();
    	for (Voiture voiture : voitures) {
    		for (Rue rue : voiture.getRues()) {
    			ruesUtilisees.add(rue);
    		}
    	}

    	return schedules;
    }
}
