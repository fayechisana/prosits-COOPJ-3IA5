import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{

    public Set<Departement> departements = new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for(Departement d : departements){
            if(d.getNomDepartement().equals(nomDepartement))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void afficherDepartements() {
        for(Departement d : departements){
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementsParId() {
        TreeSet<Departement> sortedSet = new TreeSet<>(departements);
        //sortedSet.addAll(departements);
        return sortedSet;
    }

    @Override
    public TreeSet<Departement> trierDepartementsParNomEtNombreEmployes() {
        TreeSet<Departement> sortedSet = new TreeSet<>(
                new TrierSetParNomDep()
                        .thenComparing(new TrierSetParNumberEmpl())
        );
        sortedSet.addAll(departements);
        return sortedSet;
    }
}
