package BuilderPattern.complex.classes;

import BuilderPattern.complex.abstracts.Filling;

public class Beef extends Filling {
    @Override
    public String name() {
        return "Beef";
    }

    @Override
    public double calories() {
        return 350;
    }

    @Override
    public double price() {
        return 300.75;
    }
}
