package Adapter;

/**
 * Created by Hillel9 on 21.08.2017.
 */
public class Client {

    public static void eat(Object dish) {
        System.out.println(dish);
    }

    public static void main(String[] args) {
        System.out.println("It's inheritance!");
        Chief chief = new ChiefAdapter1(); // inheritance
        Object dish = chief.makeBreakfast();
        eat(dish);
        dish = chief.makeLunch();
        eat(dish);
        dish = chief.makeDinner();
        eat(dish);

        System.out.println("\nIt's composition!");
        chief = new ChiefAdapter2(); // composition
        dish = chief.makeBreakfast();
        eat(dish);
        dish = chief.makeLunch();
        eat(dish);
        dish = chief.makeDinner();
        eat(dish);

    }
}
