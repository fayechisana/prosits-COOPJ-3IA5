package tn.zoo.entities;

public class Terrestrial extends Animal{
    private int nbLegs ;
    public int getNbLegs(){
        return nbLegs;
    }
    public void setNbLegs(){
        this.nbLegs=nbLegs;
    }
    public Terrestrial(){

    }
    public Terrestrial(int age,String name,String family,boolean isMammal,int nbLegs){
        super(name, age, family, isMammal);
        this.nbLegs=nbLegs;
    }
    public String toString(){
        return super.toString()+" Nbr Legs : "+nbLegs;
    }
}
