package Decorator;

/**
 * Created by Hillel9 on 21.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Decorator decorator = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        decorator.doOperation();
        decorator.newOperation();
    }
}
