import java.util.*;

public class AlgoK {

    public AlgoK() {
    }

    public List<Schedule> run(DataSet dataSet) {
        List<Schedule> schedules = new ArrayList<Schedule>();

        List<Voiture> listeVoitures = dataSet.getListeVoitures();
        Map<String, Rue> mapRues = dataSet.getListeRues();
        Collection<Rue> listeRues = mapRues.values();

        Map<Integer, Intersection> listeIntersections = new HashMap();

        for (Rue rue : listeRues) {
            int nbInter = rue.getIntersectionSortant();
            if (listeIntersections.containsKey(nbInter)) {
                listeIntersections.get(nbInter).ruesEntrantes.add(rue);
            } else {
                Intersection inter = new Intersection(nbInter, new ArrayList<Rue>(), new ArrayList<Rue>());
                inter.ruesEntrantes.add(rue);
                listeIntersections.put(nbInter, inter);
            }
        }

        for (Intersection inter : listeIntersections.values()) {
            schedules.add(new Schedule(inter.getId(), inter.getRuesEntrantes()));
        }

        System.out.println(schedules);

        return schedules;
    }
}
