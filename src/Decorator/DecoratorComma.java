package Decorator;

/**
 * Created by Hillel9 on 21.08.2017.
 */
public class DecoratorComma extends Decorator {

    public DecoratorComma(InterfaceComponent component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.println(","); // add extra functionality
        component.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New comma operation!");
    }

}
