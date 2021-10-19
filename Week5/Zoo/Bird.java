package Week5.Zoo;

public class Bird extends Animal{
    public Bird(int age, char gender, int weightInPounds){
        super(age, gender, weightInPounds);
    }

    public void fly(){
        System.out.println("I am flying.....");
    }

    @Override
    public void move() {
        System.out.println("I am a bird and I move by flapping my wings");
    }
}
