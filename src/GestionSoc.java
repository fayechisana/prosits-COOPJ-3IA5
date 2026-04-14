public class GestionSoc {
    public static void main(String[] args) {
        Employe e = new Employe(3,5,"mezri","aziz","informatique");
        Employe e2 = new Employe(1,5,"hjiri","wiem","gc");
        Employe e3 = new Employe(6,3,"wessleti","sabrine","finance");
        Employe e4 = new Employe(3,5,"mezri","aziz","informatique");
        SocieteArrayList sc = new SocieteArrayList();
        sc.ajouter(e);
        sc.ajouter(e2);
        sc.ajouter(e3);
       // System.out.println(sc.rechercher(e4));

        sc.trierEmployeParNomDep();
        sc.display();

    }
}
