package Week5.Zoo;

public class Chicken extends Bird{
    public Chicken(int age, char gender,int weightInPounds){
        super(age, gender,weightInPounds);
    }

    public void fly(){
        System.out.println("I am a chicken and I can only flap my wings....");
    }
}
