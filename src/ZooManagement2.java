// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ZooManagement2 {

    public static void main(String[] args) {

        Animal lion = new Animal();
        lion.name = "simba";
        lion.family = "Cat";
        lion.age    =10;
        lion.isMammal=true;

        Zoo myZoo = new Zoo();
        myZoo.name="bilvidaire";
        myZoo.city="wost-lebled";
        myZoo.nbrCages=25;
        myZoo.animals= new Animal[25];

        Animal cat = new Animal("chara3", "t7ifaa", 4, true);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(cat));

        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(lion));
        Animal elephant = new Animal("metwahech", "sa3ida", 10, true);
        System.out.println(myZoo.addAnimal(elephant));
        System.out.println(myZoo.searchAnimal(elephant));
        myZoo.displayAnimals();
        System.out.println(myZoo.removeAnimal(cat));
        myZoo.displayAnimals();
    }
    }