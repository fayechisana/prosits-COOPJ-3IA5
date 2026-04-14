public interface IGestion<T> {
     void ajouter(T t);
     boolean rechercher(String nom);
     boolean rechercher(T t);
     void supprimer(T t);
     void display();
     void trierEmployeParId(); //Comparable
     void trierEmployeParNomDépartementEtGrade();

}
