package Decorator;

/**
 * Created by Hillel9 on 21.08.2017.
 */
public class Decorator implements InterfaceComponent {

    protected InterfaceComponent component;

    public Decorator(InterfaceComponent component) {
        this.component = component;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }

    public void newOperation() {
        System.out.println("Do nothing!");
    }

}
