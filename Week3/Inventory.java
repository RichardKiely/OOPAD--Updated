package Week3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Inventory {

    private List guitars;
    private List instruments;
    private List mandolins;

    public Inventory() {

        guitars = new LinkedList();
        instruments = new LinkedList();
        mandolins = new LinkedList();
    }

  /*  public void addGuitar(String serialNumber, double price,GuitarSpec spec) {
        //Guitar guitar = new Guitar(serialNumber, price, model, type, builder, backwood , topwood);
        Guitar guitar = new Guitar(serialNumber, price,spec);
        guitars.add(guitar);



    }*/

    public void addInstrument(String serialNumber, double price,InstrumentSpec spec){
        Instrument newInstrument = new Instrument("V012345",1444.99);
        instruments.add(newInstrument);
    }

    public List search(MandolinSpec man){

        List matchingMandolins = new LinkedList();

        for (Iterator i = mandolins.iterator(); i.hasNext(); )
        {
            Mandolin mandolin = (Mandolin) i.next();
            MandolinSpec spec = mandolin.getSpec();

            if(mandolin.getSpec().matches(man))
                matchingMandolins.add(mandolin);

        }
        return matchingMandolins;
    }

    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();

        for (Iterator i = guitars.iterator(); i.hasNext(); )
        {
            Guitar guitar = (Guitar) i.next();
            GuitarSpec spec = guitar.getSpec();

            if(guitar.getSpec().matches(searchSpec))
                matchingGuitars.add(guitar);

        }
        return matchingGuitars;
    }


    public Instrument getInstrument(String serialNumber) {
        for (Iterator i = instruments.iterator(); ((Iterator) i).hasNext(); ) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }



}
