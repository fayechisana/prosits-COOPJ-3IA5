package tn.zoo.entities;

public class Dolphin extends Aquatic{
    float swimmingSpeed;
    public String toString(){
        return super.toString()+ " swimming Speed" +swimmingSpeed;
    }
    @Override
    public void swim(){
        System.out.println("This dolphin is swimming");
    }

}
