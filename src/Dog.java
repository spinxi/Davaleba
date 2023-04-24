public class Dog extends Animal implements IPet{

    private String isCalm;

    public String getisCalm() {
        return isCalm;
    }

    public void setisCalm(String isCalm) {
        this.isCalm = isCalm;
    }

    @Override
    public String playwith() {
        return "Play with a DOG";
    }

    public String getInfo(){
        String dogInfo = "Name: " + getName() + ", Age: " + getAge() + ", It is: " + getisCalm();
        return dogInfo;
    }
}
