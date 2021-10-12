package Week3;

import java.util.List;

public class Instrument {
    private String serialNumber;
    private double price;

    public Instrument(String serialNumber, double price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }
}
