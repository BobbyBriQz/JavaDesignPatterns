package BuilderPattern.complex.classes;

import BuilderPattern.complex.abstracts.Bread;

public class Bagel extends Bread {
    @Override
    public String name() {
        return "Bagel";
    }

    @Override
    public double calories() {
        return 150;
    }

    @Override
    public double price() {
        return 200;
    }
}
