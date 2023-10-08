package tn.espritgestion.zoo.main;

import tn.espritgestion.zoo.entities.Animal;
import tn.espritgestion.zoo.entities.Zoo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ZooManagement2 {

    public static void main(String[] args) {

        Animal lion = new Animal();
        lion.name = "simba";
        lion.family = "Cat";
        lion.age    =10;
        lion.isMammal=true;

        Zoo Zoo1 = new Zoo();
        Zoo1.name="bilvidaire";
        Zoo1.city="wost-lebled";

        Zoo Zoo2 = new Zoo();
        Zoo2.name="marhbee";
        Zoo2.city="jerba";

        Animal cat = new Animal("chara3", "t7ifaa", 4, true);

        System.out.println(Zoo1.addAnimal(lion));
        System.out.println(Zoo2.addAnimal(cat));

        Zoo1.displayAnimals();
        System.out.println(Zoo1.searchAnimal(cat));
        Animal cat2 = new Animal("Canine", "lll", 2, true);
        System.out.println(Zoo1.searchAnimal(cat2));

        //   System.out.println(Zoo1.removeAnimal(cat));
        Zoo1.displayAnimals();


        System.out.println(Zoo1);

        Zoo1.addAnimal(lion);
        Zoo1.addAnimal(cat);
        Zoo1.addAnimal(cat2);
        Zoo1.displayAnimals();
        System.out.println(Zoo1.removeAnimal(lion));
        Zoo1.displayAnimals();

        System.out.println(Zoo.comparerZoo(Zoo1, Zoo2));
        System.out.println(Zoo1.isZooFull());

    }
    }