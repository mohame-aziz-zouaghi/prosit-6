public class Zoo {
    Animal [] animals;
    String name, city;
    static final int nbrCages = 25;
    int NbrAnimals;
    public Zoo() {

    }
    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }



    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.NbrAnimals > z2.NbrAnimals)
            return z1;
        return z2;
    }


    void displayZoo() {
        System.out.println("| the Name: " + name + " | the City: " + city + " | nbrCages: " + nbrCages +" |");
    }
    boolean addAnimal(Animal animal){
        if(searchAnimal(animal) != -1)
            return false;
        if(nbrCages == NbrAnimals)
            return false;
        animals[NbrAnimals]= animal;
        NbrAnimals++;
        return true;
    }

    void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < NbrAnimals; i++) {
            System.out.println(animals[i].name);
        }
    }

    int searchAnimal(Animal animal){
        int p = -1 ;
        for (int i = 0; i < NbrAnimals; i++) {
            if(animal.name.equals(animals[i].name)){
                return i;
            }
        }
        return  p;
    }

    boolean isZooFull() {
        return NbrAnimals == nbrCages;
    }


    boolean removeAnimal(Animal animal){
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
