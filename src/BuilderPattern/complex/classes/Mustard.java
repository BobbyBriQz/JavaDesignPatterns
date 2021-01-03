package BuilderPattern.complex.classes;

import BuilderPattern.complex.abstracts.Sauce;

public class Mustard extends Sauce {
    @Override
    public String name() {
        return "Mustard";
    }

    @Override
    public double calories() {
        return 70;
    }

    @Override
    public double price() {
        return 100;
    }
}
