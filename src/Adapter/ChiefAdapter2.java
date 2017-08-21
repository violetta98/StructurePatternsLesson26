package Adapter;

/**
 * Created by Hillel9 on 21.08.2017.
 */
public class ChiefAdapter2 implements Chief {

    MilkChief chief = new MilkChief();

    @Override
    public Object makeBreakfast() {
        return chief.getCheese();
    }

    @Override
    public Object makeLunch() {
        return chief.getMilk();
    }

    @Override
    public Object makeDinner() {
        return chief.getMilkPie();
    }
}
