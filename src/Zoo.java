import java.sql.SQLOutput;

public class Zoo {
    Animal[] animals;
    String name,city;
    int nbCages;
    public Zoo(String name,String city , int nbCages){
        this.name=name;
        this.city=city;
        this.nbCages=nbCages;

    }
    public Zoo (){}
    public void displayZoo(){
        System.out.println("Le nom du zoo est : "+name);
        System.out.println("La ville est : " + city);
        System.out.println("Nombre des cages : "+nbCages);


    }
    @Override
    public String toString() {
        return "Le nom du zoo est : "+name+"\n"+"La ville est : "+city+"\n"+"Le nombre des cages est :"+nbCages ;
        //return String.format("Le nom du zoo est %s \n La ville est : %s \n Le nombre des cages est %d",name,city,nbCages);
    }
}
