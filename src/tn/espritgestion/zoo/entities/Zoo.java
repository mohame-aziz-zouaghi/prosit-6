package tn.espritgestion.zoo.entities;

public class Zoo {
    public Animal [] animals;
    public String name, city;
    static final int nbrCages = 25;
    int NbrAnimals;
    public Zoo() {

    }
    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }



    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.NbrAnimals > z2.NbrAnimals)
            return z1;
        return z2;
    }


    public void displayZoo() {
        System.out.println("| the Name: " + name + " | the City: " + city + " | nbrCages: " + nbrCages +" |");
    }
    public boolean addAnimal(Animal animal){
        if(!isZooFull()) {
            if (searchAnimal(animal) != -1)
                return false;
            animals[NbrAnimals] = animal;
            NbrAnimals++;
            return true;
        }
    return false;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < NbrAnimals; i++) {
            System.out.println(animals[i].name);
        }
    }

    public int searchAnimal(Animal animal){
        int p = -1 ;
        for (int i = 0; i < NbrAnimals; i++) {
            if(animal.name.equals(animals[i].name)){
                return i;
            }
        }
        return  p;
    }

    public boolean isZooFull() {
        return NbrAnimals == nbrCages;
    }


    public boolean removeAnimal(Animal animal){
        int p = searchAnimal(animal);
        if(p == -1)
            return false;
        for (int i = p; i < NbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[NbrAnimals] = null;
        NbrAnimals--;
        return true;
    }

    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages;
    }
}
