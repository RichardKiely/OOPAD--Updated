package Week5;

public class dogDoorTest {
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

}

}
