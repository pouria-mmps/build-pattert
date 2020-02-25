/**
 * @author alimardani.p (p.alimardani@chmail.ir)
 * @date 2/25/2020
 */
public class Test {
    public static void main(String[] args) {
        new Calzone.Builder()
                .addTopping(Topping.HAM)
                .addTopping(Topping.MUSHROOM)
                .hasSauceInside(Boolean.TRUE)
                .build();
        System.out.println("DONE");
    }
}
