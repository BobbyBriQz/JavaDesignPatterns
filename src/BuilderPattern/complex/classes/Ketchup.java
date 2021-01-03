package BuilderPattern.complex.classes;

import BuilderPattern.complex.abstracts.Sauce;

public class Ketchup extends Sauce {
    @Override
    public String name() {
        return "Ketchup";
    }

    @Override
    public double calories() {
        return 25;
    }

    @Override
    public double price() {
        return 80;
    }
}
