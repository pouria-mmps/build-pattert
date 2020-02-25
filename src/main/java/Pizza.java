import java.util.EnumSet;
import java.util.Set;

/**
 * @author alimardani.p (p.alimardani@chmail.ir)
 * @date 2/25/2020
 */
public abstract class Pizza {
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    public Pizza(Builder<?> builder) {
        toppings = builder.toppings;
    }
}
