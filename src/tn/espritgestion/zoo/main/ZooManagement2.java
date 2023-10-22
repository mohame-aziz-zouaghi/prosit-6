package tn.espritgestion.zoo.main;

import tn.espritgestion.zoo.entities.*;

import java.util.Arrays;

public class ZooManagement2 {
    int nbrCages = 25;
    String zooName = "bilvidaire";

    public static void main(String[] args) {

        Terrestrial Terrestrial=new Terrestrial();
        Dolphin coucou=new Dolphin();
        Penguin pipi=new Penguin();
        Zoo zoo=new Zoo();

        Dolphin dolphin=new Dolphin("water", 1.355f);
        Penguin penguin=new Penguin("water", 244.5f);
        Penguin penguin2=new Penguin("water", 213.5f);


        System.out.println(dolphin);

        System.out.println(penguin);


        dolphin.swim();
        penguin.swim();
        zoo.addAquaticAnimal(penguin);
        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin2);
        System.out.println(Arrays.toString(zoo.aquaticAnimals));
        for (Aquatic animal : zoo.aquaticAnimals) {
            if (animal != null) {
                animal.swim();
            }
        }
        System.out.println(zoo.maxPenguinSwimmingDepth());
        zoo.displayNumberOfAquaticsByType();
        penguin.setAge(2);
        penguin2.setAge(1);
        penguin.setName("pipi1");
        penguin2.setName("pipi2");
        System.out.println(penguin+" "+penguin2+"\n");
        System.out.println( penguin.getAge()==penguin2.getAge());
        System.out.println( penguin.getName()==penguin2.getName());
        System.out.println( penguin.getHabitat()==penguin2.getHabitat());
        System.out.println(penguin.equals(penguin2));
    }

}