import java.util.List;

public class DataSet {
    int duration;
    int nbIntersection;
    int nbRue;
    int nbVoiture;
    int bonus;

    public DataSet() {
    }

    public DataSet(int duration, int nbIntersection, int nbRue, int nbVoiture, int bonus) {
        this.duration = duration;
        this.nbIntersection = nbIntersection;
        this.nbRue = nbRue;
        this.nbVoiture = nbVoiture;
        this.bonus = bonus;
    }

   
    @Override
    public String toString() {
        return "DataSet{\n" +
                "duration= " + duration +
                ",\nbIntersection= " + nbIntersection +
                ",\nbRue= " + nbRue +
                ",\nbVoiture= " + nbVoiture +
                ",\bonus= " + bonus +
                '}';
    }

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getNbIntersection() {
		return nbIntersection;
	}

	public void setNbIntersection(int nbIntersection) {
		this.nbIntersection = nbIntersection;
	}

	public int getNbRue() {
		return nbRue;
	}

	public void setNbRue(int nbRue) {
		this.nbRue = nbRue;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
