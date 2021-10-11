package Week3;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec( Builder.FENDER, "Stratocastor",
                Type.ELECTRIC,12, Wood.ALDER, Wood.ALDER);


        List matchingGuitars = inventory.search(whatLookingFor);

        if(!matchingGuitars.isEmpty())
        {
            System.out.println("You might like these: ");

            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); )
            {
                Guitar guitar = (Guitar)i.next();
                System.out.println("We have a " +
                        guitar.getSpec().getBuilder() + " " + guitar.getSpec().getModel() + " " +
                        guitar.getSpec().getType() + " guitar:\n   " +
                        guitar.getSpec().getBackWood() + " back amd sides, \n  " +
                        guitar.getSpec().getTopWood() + " top. \n You can have it for €" + guitar.getPrice() + "\n");
            }
        }
        else
            System.out.println("Sorry we have nothing for you");
    }

    public static void initialiseInventory(Inventory inventory){

        //define some objects to guitar Spec

        GuitarSpec spec1 = new GuitarSpec( Builder.FENDER ,
                "Stratocastor",
                Type.ELECTRIC,
                12,
                Wood.ALDER,
                Wood.ALDER);

        GuitarSpec spec2 = new GuitarSpec( Builder.GIBSON ,
                "Stratocastor",
                Type.ACOUSTIC,
                12,
                Wood.ALDER,
                Wood.ALDER);

        GuitarSpec spec3 = new GuitarSpec( Builder.GIBSON ,
                "Stratocastor",
                Type.ELECTRIC,
                6,
                Wood.ALDER,
                Wood.ALDER);

        //add guitars to the inventory
        inventory.addGuitar("V00001",
                1499.99,spec1);

        inventory.addGuitar("V00002",
                1699.99,spec2);

    }
}
