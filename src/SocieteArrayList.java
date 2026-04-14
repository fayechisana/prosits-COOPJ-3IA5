import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{
    List<Employe> employees = new ArrayList();


    @Override
    public void ajouter(Employe employe) {
        employees.add(employe);
    }

    @Override
    public boolean rechercher(String nom) {
        for(int i=0;i<employees.size();i++){
            if(employees.get(i).getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercher(Employe employe) {
        return employees.contains(employe);
    }

    @Override
    public void supprimer(Employe employe) {
        employees.remove(employe);
    }

    @Override
    public void display() {
        System.out.println(employees);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employees);
    }
    public void trierEmployeParNomDep(){
        Collections.sort(employees,new TrierParNomDep());
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employees,new TrierParNomDep()
                .thenComparing(new TrierParGrade()));
    }
}
