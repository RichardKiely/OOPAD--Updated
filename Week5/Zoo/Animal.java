package Week5.Zoo;

public abstract class Animal {
    int age;
    char gender;
    int weightInPounds;

    public Animal(int age, char gender, int weightInPounds){
        this.age=age;
        this.gender = gender;
        this.weightInPounds=weightInPounds;
    }

    public void eat() {
        System.out.println("I am eating....");
    }

    public void sleep() {
        System.out.println("I am sleeping....");
    }

    public abstract void move();
}
