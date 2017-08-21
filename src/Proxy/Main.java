package Proxy;

/**
 * Created by Hillel9 on 21.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        IMath proxy = new MathProxy();
        System.out.println("4 + 2 = " + proxy.add(4, 2));
        System.out.println("4 - 2 = " + proxy.sub(4, 2));
        System.out.println("4 * 2 = " + proxy.mult(4, 2));
        System.out.println("4 / 2 = " + proxy.div(4, 2));
    }

}
