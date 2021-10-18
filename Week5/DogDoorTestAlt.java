package Week5;

public class DogDoorTestAlt {
    public static void main(String[] args) {


        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside.....");
        remote.pressButton();
        System.out.println();

        System.out.println("Fido is outside.....");
        remote.pressButton();
        System.out.println();

        System.out.println("Fido comes back in.....");
        remote.pressButton();
        System.out.println();

        System.out.println("Fido is inside.....");
        remote.pressButton();
        System.out.println();


        System.out.println("Ted or Gina hears Fido barking.....");
        remote.pressButton();
        System.out.println();


        try{
            Thread.currentThread().sleep(10000);
        }catch (InterruptedException e){}
        System.out.println("\n but Fido is stuck outside!");
        System.out.println("\n Fido barks to get back inside!");
        System.out.println("\n So gina presses the button on the remote ");
        remote.pressButton();
        System.out.println("\n Fido is back inside");


    }

}
