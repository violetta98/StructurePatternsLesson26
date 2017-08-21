package Decorator;

/**
 * Created by Hillel9 on 21.08.2017.
 */
public class MainComponent implements InterfaceComponent {
    @Override
    public void doOperation() {
        System.out.println("World!");
    }
}
