package tn.espritgestion.zoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal{
    private String habitat;

    public Aquatic() {

    }

    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public abstract void swim();


    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                "} " ;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(habitat);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aquatic other = (Aquatic) obj;
        return Objects.equals(habitat, other.habitat) &&
                Objects.equals(super.getAge(), other.getAge()) &&
                Objects.equals(super.getName(), other.getName());
    }

}