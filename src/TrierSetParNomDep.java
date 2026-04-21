import java.util.Comparator;

public class TrierSetParNomDep implements Comparator<Departement> {
    @Override
    public int compare(Departement o1, Departement o2) {
        return o1.getNomDepartement().compareTo(o2.getNomDepartement());
    }
}
