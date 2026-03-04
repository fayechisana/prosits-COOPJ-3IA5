package tn.zoo.mains;

import tn.zoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int nbCages;
//        String zooName;
//        do{
//            System.out.println("Merci de saisir un entier");
//             nbCages= sc.nextInt() ;
//        } while (nbCages<0);
//       do{
//           System.out.println("Merci de saisir le nom d'un zoo");
//           zooName = sc.next();
//       } while(zooName.isEmpty());
//
//
//        System.out.println(zooName+" comporte "+ nbCages +" cages");

        Animal a1 = new Animal();
        a1.setAge(-4);
       // a1.name = "Chat";
        System.out.println(a1.getAge());
        Animal a2 = new Animal();
//        a2.age = 22;
//        a2.name = "simba";
        a2.setFamily("Lions");
        //a2.isMammal=true;

        Animal lion = new Animal("chat",22,"Lions",true);
        Zoo myZoo1= new Zoo("friga","ariana soghra ");
        System.out.println(Zoo.NB_CAGES);




       Zoo myZoo = new Zoo();
//       myZoo.name= "belvidaire";
//       myZoo.city ="tunis";

       ///myZoo1.displayZoo();
       ///myZoo.displayZoo();
       System.out.println(myZoo.toString());
        System.out.println("--------------Prosit 3");
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(a1));
        System.out.println(myZoo.addAnimal(a2));
        //System.out.println("myZoo "+myZoo.nbAnimal);
//        System.out.println(myZoo.searchAnimal(a2));
//        System.out.println(myZoo.searchAnimal(lion));
//        System.out.println(a2.equals(lion));
        System.out.println(myZoo1.addAnimal(lion));
       // System.out.println("myzoo1 "+Zoo.nbAnimalTotal);
        System.out.println("---------------Prosit 4-----------");
       // Aquatic aquatic= new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Penguin penguin = new Penguin();
        penguin.setName("p1");
        penguin.setAge(2);
        penguin.setHabitat("bizert");

        penguin.swimmingDepth=20;
        Penguin penguin1 = new Penguin();
        penguin1.setName("p1");
        penguin1.setAge(3);
        penguin1.setHabitat("bizert");
        penguin1.swimmingDepth=20;
        Dolphin dolphin= new Dolphin();

        //aquatic.swim();
        dolphin.swim();
        penguin.swim();
       // myZoo1.addAquaticAnimal(aquatic);
        myZoo1.addAquaticAnimal(dolphin);
        myZoo1.addAquaticAnimal(penguin);
        myZoo1.addAquaticAnimal(penguin1);

        System.out.println(penguin1.equals(penguin1));

        System.out.println(myZoo.equals(myZoo1));
//        for(int i=0;i<myZoo1.nbAnimalAquatic;i++){
//            myZoo1.aquaticAnimals[i].swim();
//        }

        System.out.println( myZoo1.maxSwimmingDepth());
        myZoo1.displayNumberOfAquatiqsAnimal();

    }
}
