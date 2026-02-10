public class Animal {
     String name,family;
     int age = 3;
     boolean isMammal;

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



}
