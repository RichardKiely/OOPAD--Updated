package Week3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Inventory {

    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price,GuitarSpec spec) {
        //Guitar guitar = new Guitar(serialNumber, price, model, type, builder, backwood , topwood);
        Guitar guitar = new Guitar(serialNumber, price,spec);
        guitars.add(guitar);



    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); ((Iterator) i).hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchGuitar) {
        List matchingGuitars = new LinkedList();

        for (Iterator i = guitars.iterator(); i.hasNext(); )
        {
            Guitar guitar = (Guitar) i.next();
            GuitarSpec spec = guitar.getSpec();

           if(searchGuitar.getBuilder() != spec.getBuilder())
                    continue;

            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(spec.getModel().toLowerCase())))
                continue;

            if(searchGuitar.getType() != spec.getType())
                continue;

            if(searchGuitar.getBackWood() != spec.getBackWood())
                continue;
            if(searchGuitar.getTopWood() != spec.getTopWood())
                continue;

             matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
