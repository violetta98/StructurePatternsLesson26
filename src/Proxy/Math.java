package Proxy;

/**
 * Created by Hillel9 on 21.08.2017.
 */
public class Math implements IMath {
    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double sub(double x, double y) {
        return x - y;
    }

    @Override
    public double div(double x, double y) {
        return x / y;
    }

    @Override
    public double mult(double x, double y) {
        return x * y;
    }
}
