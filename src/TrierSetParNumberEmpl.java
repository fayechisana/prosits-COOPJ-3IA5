import java.util.Comparator;

public class TrierSetParNumberEmpl implements Comparator<Departement> {
    @Override
    public int compare(Departement o1, Departement o2) {
        return o1.getNombreEmployes() - o2.getNombreEmployes();
    }
}
