package Week5.Zoo;

public class Fish extends Animal{
    public Fish(int age, char gender, int weightInPounds){
        super(age, gender, weightInPounds);
    }

    public void swim(){
        System.out.println("I am swimming.....");
    }

    @Override
    public void move() {
        System.out.println("I'm a fish and I move by swimming");
    }
}
