package Adapter;

/**
 * Created by Hillel9 on 21.08.2017.
 */
public class ChiefAdapter1 extends MilkChief implements Chief {
    @Override
    public Object makeBreakfast() {
        return getCheese();
    }

    @Override
    public Object makeLunch() {
        return getMilk();
    }

    @Override
    public Object makeDinner() {
        return getMilkPie();
    }
}
