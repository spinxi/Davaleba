public class Parrot extends Animal implements IPet, IBird{
    private String talk;


    public String getTalk() {
        return talk;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }


    @Override
    public String playwith() {
        return "Play with a Parrot";
    }

    @Override
    public String fly() {
        return "It can FLY";
    }

    public String getInfo(){
        String parrotInfo = "Name: " + getName() + ", Age: " + getAge() + ", It Can: " + getTalk();
        return parrotInfo;
    }
}
