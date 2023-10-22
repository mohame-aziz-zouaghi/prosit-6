package tn.espritgestion.zoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    public Aquatic[] aquaticAnimals=new Aquatic[10];

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    private  String city;
    //Instruction 14
    static final int nbrCages=25;

    public Zoo() {
    }
    //Instruction 14
    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        //     this.nbrCages = nbrCages;
    }
    public void displayzoo(){
        System.out.println(
                "name : "+this.name+" , "+"city :"+this.city+" ,nbrCages= "+nbrCages

        );
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if(aquaticAnimals[i]==null) {
                aquaticAnimals[i]=aquatic;
                break;
            }
        }
    }

    public float maxPenguinSwimmingDepth() {
        float max=0;
        for (Aquatic aquaticAnimal   : aquaticAnimals) {
            if (aquaticAnimal != null && aquaticAnimal  instanceof Penguin) {
                if (max <((Penguin) aquaticAnimal).getSwimmingDepth()) {
                    max=((Penguin) aquaticAnimal).getSwimmingDepth();
                }
            }
        }

        return max;

    }
    public void displayNumberOfAquaticsByType() {
        int nbP=0;
        int nbD=0;
        for (Aquatic aquaticAnimal   : aquaticAnimals) {
            if (aquaticAnimal != null && aquaticAnimal  instanceof Penguin) {
                ++nbP;
            }
            else if (aquaticAnimal != null && aquaticAnimal  instanceof Dolphin) {
                ++nbD;
            }
        }
        System.out.println("number of dolphin is equal to "+nbD+"\nnumber of penguin is equal to "+nbP);


    }
    public boolean addAnimal(Animal animal){
        if(!isZooFull()) {
            if (searchAnimal(animal) == -1) {
                for (int i = 0; i < this.nbrCages; i++) {
                    if (this.animals[i] == null) {
                        this.animals[i] = animal;
                        return true;
                    }
                }
            }
        }
        return  false;
    }
    void displayAnimals(){
        for (int i = 0; i < this.nbrCages; i++) {
            if (this.animals[i] == null) {

                break;
            }
            else System.out.println(this.animals[i]);
        }
    }

    int searchAnimal(Animal animal){
        for (int i = 0; i <this.nbrCages ; i++) {
            if (animals[i]!=null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
    boolean removeAnimal(Animal animal) {
        int animalIndex = searchAnimal(animal);
        int len=animals.length;
        if (animalIndex != -1) {

            for (int i = animalIndex; i < len - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbrCages - 1] = null;
            len -= 1   ;
            return true;
        } else {

            return false;
        }
    }
    //Instruction 16
    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        int zoo1NbAnimals =0 ;
        int zoo2NbAnimals =0 ;

        for (Animal animal : z1.animals) {
            if (animal != null) {
                ++zoo1NbAnimals;
            }
        }
        for (Animal animal : z2.animals) {
            if (animal != null) {
                ++zoo2NbAnimals;
            }
        }
        if (zoo1NbAnimals > zoo2NbAnimals) {
            return  z1;
        }
        else if(zoo1NbAnimals< zoo2NbAnimals){
            return z2;
        }
        return null ;
    }
    //Instruction 15
    public boolean isZooFull(){
        int nbAnimals=0;
        for (Animal animal : animals) {
            if (animal != null) {
                ++nbAnimals;
            }
        }
        return this.nbrCages == nbAnimals;
    }
    @Override
    public String toString() {
        return "Zoo{" +

                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
