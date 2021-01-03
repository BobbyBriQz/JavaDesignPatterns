package BuilderPattern.complex.classes;

import BuilderPattern.complex.abstracts.Filling;

public class SmokedSalmon extends Filling {

    @Override
    public String name() {
        return "Smoked Salmon";
    }

    @Override
    public double calories() {
        return 100;
    }

    @Override
    public double price() {
        return 150.80;
    }


}
