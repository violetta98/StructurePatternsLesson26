package Decorator;

/**
 * Created by Hillel9 on 21.08.2017.
 */
public class DecoratorHello extends Decorator {

    public DecoratorHello(InterfaceComponent component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.println("Hello"); // add extra functionality
        component.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New hello operation!");
    }

}
