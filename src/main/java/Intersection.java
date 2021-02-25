import java.util.List;

public class Intersection {

    int id;
    public List<Rue> ruesEntrantes;
    public List<Rue> ruesSortantes;

    public Intersection(int id, List<Rue> ruesEntrantes, List<Rue> ruesSortantes) {
        this.id = id;
        this.ruesEntrantes = ruesEntrantes;
        this.ruesSortantes = ruesSortantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Rue> getRuesEntrantes() {
        return ruesEntrantes;
    }

    public void setRuesEntrantes(List<Rue> ruesEntrantes) {
        this.ruesEntrantes = ruesEntrantes;
    }

    public List<Rue> getRuesSortantes() {
        return ruesSortantes;
    }

    public void setRuesSortantes(List<Rue> ruesSortantes) {
        this.ruesSortantes = ruesSortantes;
    }
}
