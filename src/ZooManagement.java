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
        a1.age = 4;
        a1.name = "Chat";
        System.out.println(a1.age);
        Animal a2 = new Animal();
        a2.age = 5;
        a2.name = "Simba";

        Animal lion = new Animal("simba",22,"Lions",true);
        Zoo myZoo1= new Zoo("friga","ariana soghra ",20);




       Zoo myZoo = new Zoo();
       myZoo.name= "belvidaire";
       myZoo.city ="tunis";
       myZoo.nbCages= 10;
       ///myZoo1.displayZoo();
       ///myZoo.displayZoo();
       System.out.println(myZoo.toString());
    }
}
