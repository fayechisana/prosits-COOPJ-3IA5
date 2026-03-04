package tn.zoo.entities;

public abstract class Aquatic extends Animal{
    protected String habitat;
    public String getHabitat(){
        return habitat;
    }
    public void setHabitat(String habitat){
        this.habitat=habitat;
    }
    public Aquatic(){}
    public Aquatic(int age,String name,String family,boolean isMammal,String habitat){
        super(name, age, family, isMammal);
        this.habitat=habitat;
    }
    public String toString(){
        return super.toString()+" Habitat : "+habitat;
    }
    public abstract void swim();
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj instanceof Aquatic){
            Aquatic a = (Aquatic) obj;
            return (this.name.equals(a.name)
                    && this.getAge()==a.getAge()
                    && this.habitat.equals(a.habitat) );
        }
       return false;
    }
}
