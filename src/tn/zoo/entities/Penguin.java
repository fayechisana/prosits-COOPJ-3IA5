package tn.zoo.entities;

public class Penguin extends Aquatic {
   public float swimmingDepth;
    public String toString(){
        return super.toString()+ " swimming Depth" +swimmingDepth;
    }
    public void swim(){
        System.out.println("This Penguin is swimming");
    }
}
