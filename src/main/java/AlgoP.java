import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AlgoP {
	public AlgoP() {
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
    	
    	Set<Integer> intersectionsUtilisees = new HashSet<>();
    	for (Rue rue : ruesUtilisees) {
    		intersectionsUtilisees.add(rue.getIntersectionEntrant());
    		intersectionsUtilisees.add(rue.getIntersectionSortant());
    		rue.setDureeFeuVert(1);
    	}
    	
    	for (Integer intersection : intersectionsUtilisees) {
	    		Set<Rue> sRue = new HashSet<>();
	    		for(Rue rueTest: ruesUtilisees) {
	    			if (rueTest.getIntersectionSortant() == intersection ) {
//	    					&& rueTest.getTempsParcours() < 3) {
	    				sRue.add(rueTest);
	        		}
	    		}
	    		List<Rue> test = new ArrayList();
	    		test.addAll(sRue);
	    		Schedule schedule = new Schedule(intersection, test);
	    		schedules.add(schedule);
    	}
    	
//    	int A  = schedules.size();
    	
    	
    	
    	return schedules;
    }
}
