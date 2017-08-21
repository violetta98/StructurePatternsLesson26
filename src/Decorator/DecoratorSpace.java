package Decorator;

/**
 * Created by Hillel9 on 21.08.2017.
 */
public class DecoratorSpace extends Decorator {

    public DecoratorSpace(InterfaceComponent component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.println(" "); // add extra functionality
        component.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New space operation!");
    }

}
