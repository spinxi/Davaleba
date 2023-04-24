public class Main {
    public static void main(String[] args) {
        Dog dog_obj = new Dog();
        Parrot parrot_obj = new Parrot();
        //DOG OBJ
        dog_obj.setName("Steve");
        dog_obj.setAge(5);
        dog_obj.setHabitat("Drinking");
        dog_obj.setType(AnimalType.MAMMAL);
        //FROM CHILD CLASS
        dog_obj.setisCalm("CALM");

        //PARROT
        parrot_obj.setName("CATCHY");
        parrot_obj.setAge(2);
        parrot_obj.setHabitat("Sleeping");
        parrot_obj.setType(AnimalType.BIRD);
        //FROM CHILD CLASS
        parrot_obj.setTalk("TALK");

        // PRINT INFO
        String dogInfo = dog_obj.getInfo();
        String parrotInfo = parrot_obj.getInfo();

        System.out.println(dog_obj.playwith() + "\n" + dogInfo + "\n\n" + parrot_obj.playwith() + ", " + parrot_obj.fly() +"\n" + parrotInfo);

    }
}
