package tn.espritgestion.zoo.entities;

import java.util.Objects;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }

    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;

        }
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal() {
    }


    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        setName(name);
        setAge(age);
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        return age == other.age && Objects.equals(name, other.name);
    }




}
