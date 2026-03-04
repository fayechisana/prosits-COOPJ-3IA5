package tn.zoo.entities;

 public class Animal {
     protected String name;
     protected String family;
      protected int age ;
    protected boolean isMammal;

public Animal(){}

    public Animal(String name,int age){
        this.name=name;
        this.age=age;

    }
    public Animal(String name,int age,String family,boolean isMammal ){
    this(name, age);
    this.family=family;
    this.isMammal=isMammal;
    }


    public Animal(int age){

        this.age=age;

    }
    public void afficher(){
        System.out.println("Age : "+age);
        System.out.println("Nom : "+name);
    }

    @Override
    public String toString(){
    return "le nom de l'animal est :"+ name +"\n"+"la famille de l'animal est :"+ family +"\n"+"l'animal est mammal? :"+ isMammal +"\n";
}
public int getAge(){
    return this.age;
}
public void setAge(int age){
    if(age>0){
        this.age=age;
    }
}

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getFamily() {
         return family;
     }

     public void setFamily(String family) {
         this.family = family;
     }

     public boolean isMammal() {
         return isMammal;
     }

     public void setMammal(boolean mammal) {
         isMammal = mammal;
     }
 }
