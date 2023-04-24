// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dog dog_obj = new Dog();
        Parrot parrot_obj = new Parrot();
        //DOG OBJ
        dog_obj.setName("Steve");
        dog_obj.setAge(5);
        dog_obj.setHabitat("Drinking");
        dog_obj.setType(AnimalType.MAMMAL);

        dog_obj.setisCalm("CALM");

        //PARROT
        parrot_obj.setName("CATCHY");
        parrot_obj.setAge(2);
        parrot_obj.setHabitat("Sleeping");
        parrot_obj.setType(AnimalType.BIRD);

        parrot_obj.setTalk("TALK");

        // PRINT INFO
        String dogInfo = dog_obj.getInfo();
        String parrotInfo = parrot_obj.getInfo();

        System.out.println(dog_obj.playwith() + "\n" + dogInfo + "\n\n" + parrot_obj.playwith() + "\n" + parrotInfo);

    }
}
