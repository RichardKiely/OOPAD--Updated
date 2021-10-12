package Week3;

public class GuitarSpec extends InstrumentSpec {

    private int numStrings;


    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }
    public boolean matches(GuitarSpec otherSpec){
        if(!super.matches(otherSpec))
                return false;

        if(numStrings != otherSpec.numStrings)
                return false;

        return true;
    }

}
