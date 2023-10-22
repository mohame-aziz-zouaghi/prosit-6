package tn.espritgestion.zoo.entities;

public class Terrestrial extends Animal{
    private int nbrLegs;

    public Terrestrial() {
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{" +
                "nbrLegs=" + nbrLegs +
                "} " + super.toString();
    }
}
