import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Algo1 {

    public Algo1() {
    }

    public List<Schedule> run(DataSet dataSet) {
    	List<Schedule> schedules = new ArrayList<Schedule>();
    	
    	List<Voiture> voitures = dataSet.getListeVoitures();
    	
    	Set<Rue> ruesUtilisees = new HashSet<Rue>();
    	for (Voiture voiture : voitures) {
    		for (Rue rue : voiture.getRues()) {
    			ruesUtilisees.add(rue);
    		}
    	}
    	
    	Set<Integer> intersectionsUtilisees = new HashSet<>();
    	for (Rue rue : ruesUtilisees) {
    		intersectionsUtilisees.add(rue.getIntersectionEntrant());
    		intersectionsUtilisees.add(rue.getIntersectionSortant());
    		rue.setDureeFeuVert(1);
    	}
    	
    	for (Integer intersection : intersectionsUtilisees) {
    		Set<Rue> rues = new HashSet<Rue>();
    		for (Rue rue : ruesUtilisees) {
    			// rue.getIntersectionEntrant() == intersection || 
        		if (rue.getIntersectionSortant() == intersection) {
        			rues.add(rue);
        		}
        	}
    		
    		List<Rue> rue3EnLISTE = new ArrayList<Rue>();
    		for (Rue rue : rues) {
    			rue3EnLISTE.add(rue);
    		}
    		Schedule schedule = new Schedule(intersection, rue3EnLISTE);
    		schedules.add(schedule);
    	}
    	
    	return schedules;
    }
}
