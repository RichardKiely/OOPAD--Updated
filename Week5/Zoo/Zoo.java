package Week5.Zoo;

public class Zoo {
    public static void main(String[] args) {
        /* First Tester
        Animal animal1 = new Animal(2,'F',120);
        animal1.eat();
        animal1.sleep();
        animal1.eat();
        */
        /*Second tester
        Bird aBird = new Bird(2,'F',3);
        Fish aFish = new Fish(17,'M',6);

        aBird.fly();
        aBird.eat();
        aFish.swim();
        aFish.eat();
        */

        Animal sparrow1 =new Sparrow(2,'F',2);
        Fish afish = new Fish(3,'M',8);
        Sparrow sparrow2 = new Sparrow(3,'F',5);
       moveAnimals(afish);
        moveAnimals(sparrow1);

/*
        Chicken aChicken = new Chicken(2,'M',2);
        Sparrow aSparrow = new Sparrow(1,'F',1);

        Bird abrid = new Bird(2,'M',1);


        abrid.move();
        afish.move();

        aChicken.fly();
        aSparrow.fly();*/
    }
    public static void moveAnimals(Animal animal){
        animal.move();
    }
}
