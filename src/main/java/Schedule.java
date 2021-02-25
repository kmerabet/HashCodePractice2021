public class Schedule {

    private int nbIntersections;
    private int nbRuesConcernees;

    public Schedule(int nbIntersections, int nbRuesConcernees) {
        this.nbIntersections = nbIntersections;
        this.nbRuesConcernees = nbRuesConcernees;
    }

    public int getNbIntersections() {
        return nbIntersections;
    }

    public int getNbRuesConcernees() {
        return nbRuesConcernees;
    }

    @Override
    public String toString() {
        //On formate le tableau de pizzas
        StringBuilder formattedList = new StringBuilder();
		/*for (int listePizza : listePizzas) {
			formattedList.append(listePizza);
			formattedList.append(SEPARATOR);
		}
		//on retire le separateur en trop à la fin de la ligne
		formattedList.deleteCharAt(formattedList.lastIndexOf(SEPARATOR));
		
		return tailleEquipe + SEPARATOR + formattedList.toString();*/

        return null;
    }
}
