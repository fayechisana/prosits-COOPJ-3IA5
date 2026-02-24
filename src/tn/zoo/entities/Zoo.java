package tn.zoo.entities;

import tn.zoo.entities.Animal;

public class Zoo {
    Animal[] animals;
    String name,city;
    public static final int NB_CAGES=25;
    int nbAnimal;
    static int nbAnimalTotal;

    public Zoo(String name,String city ){
        this.name=name;
        this.city=city;

        this.animals=new Animal[NB_CAGES];

    }
    public Zoo (){
        this.animals=new Animal[NB_CAGES];
    }
    public void displayZoo(){
        System.out.println("Le nom du zoo est : "+name);
        System.out.println("La ville est : " + city);
        System.out.println("Nombre des cages : "+NB_CAGES);}
    public boolean addAnimal(Animal animal) {
        if (nbAnimal < NB_CAGES && searchAnimal(animal)==-1) {
            animals[nbAnimal] = animal;
            nbAnimal++;
            nbAnimalTotal++;
            return true;
        }
            return false;


    }
    @Override
    public String toString() {
        String s = "Le nom du zoo est : "+name+"\n"+"La ville est : "+city+"\n"+"Le nombre des cages est :"+NB_CAGES+"\n" ;
        String a ="";
        for(int i=0;i<nbAnimal;i++){
            a+=animals[i];
        }
        return s+a;
        //return String.format("Le nom du zoo est %s \n La ville est : %s \n Le nombre des cages est %d",name,city,nbCages);
    }
    public int searchAnimal(Animal animal){
        for (int i=0;i<nbAnimal;i++){
            if (animals[i].equals(animal.name)){
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal){
        int indice = searchAnimal(animal);
        if(indice!=-1){
            for(int i=indice;i<nbAnimal-1;i++){
                animals[i]=animals[i+1];
            }
            animals[nbAnimal-1]=null;
            nbAnimal--;
            nbAnimalTotal--;
            return true;
        }
        return false;
    }
}
