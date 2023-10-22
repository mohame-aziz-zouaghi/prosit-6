package tn.espritgestion.zoo.entities;

public class Dolphin extends Aquatic{
    private float dolphinSpeed;

    public Dolphin(String habitat, float dolphinSpeed) {
        super(habitat);
        this.dolphinSpeed = dolphinSpeed;
    }

    public float getDolphinSpeed() {
        return dolphinSpeed;
    }

    public void setDolphinSpeed(float dolphinSpeed) {
        this.dolphinSpeed = dolphinSpeed;
    }

    public Dolphin() {
        super();
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "dolphinSpeed=" + dolphinSpeed +
                ", habitat='" + getHabitat() + '\'' +
                "} " ;
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println("this dolphin is swimming");
    }
}