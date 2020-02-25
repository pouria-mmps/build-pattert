/**
 * @author alimardani.p (p.alimardani@chmail.ir)
 * @date 2/25/2020
 */
public class Calzone extends Pizza {
    private final Boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        Boolean sauceInside;

        public Builder hasSauceInside(Boolean sauceInside) {
            this.sauceInside = sauceInside;
            return this.self();
        }

        Calzone build() {
            super.toppings.forEach(toop -> System.out.println(toop.name()));
            System.out.println(sauceInside);
            return new Calzone(this);
        }

        protected Builder self() {
            return this;
        }
    }

    public Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
