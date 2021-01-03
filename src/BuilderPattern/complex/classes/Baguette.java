package BuilderPattern.complex.classes;

import BuilderPattern.complex.abstracts.Bread;

public class Baguette extends Bread {
    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public double calories() {
        return 205.5;
    }

    @Override
    public double price() {
        return 180;
    }
}
