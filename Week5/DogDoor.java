package Week5;

public class DogDoor {

    private boolean open;

    public DogDoor() {
        this.open = false;
    }

    public void open(){
        this.open = true;
        System.out.println("Door is open");

    }
    public  void close(){
        this.open = false;
        System.out.println("Door is closed");

    }
    public boolean isOpen(){
        return open;
    }
}
