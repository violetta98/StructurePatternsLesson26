package Proxy;

/**
 * Created by Hillel9 on 21.08.2017.
 */
public class MathProxy implements IMath {

    private Math math;

    private void checkNull(MathProxy mathProxy) {
        if (mathProxy.math == null)
            mathProxy.math = new Math();
    }

    @Override
    public double add(double x, double y) {
        checkNull(this);
        return math.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        checkNull(this);
        return math.sub(x, y);
    }

    @Override
    public double div(double x, double y) {
        checkNull(this);
        return math.div(x, y);
    }

    @Override
    public double mult(double x, double y) {
        checkNull(this);
        return math.mult(x, y);
    }
}
