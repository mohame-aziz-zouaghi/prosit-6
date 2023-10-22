package tn.espritgestion.zoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth ;

    public Penguin() {

    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                ", habitat='" + super.getHabitat() + '\'' +
                "} "
                ;
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println(" this penguin is swimming");

    }
}
