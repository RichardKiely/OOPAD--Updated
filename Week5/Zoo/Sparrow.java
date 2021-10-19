package Week5.Zoo;

public class Sparrow extends Bird implements Flyable{

    public Sparrow(int age, char gender, int weightInPounds){
        super(age, gender, weightInPounds);
    }
    public void fly(){
        System.out.println("I am flying..........");
    }
}
