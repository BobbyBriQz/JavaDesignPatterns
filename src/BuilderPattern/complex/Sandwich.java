package BuilderPattern.complex;

import BuilderPattern.complex.abstracts.Bread;
import BuilderPattern.complex.abstracts.Filling;
import BuilderPattern.complex.abstracts.Sauce;
import BuilderPattern.complex.classes.*;

public class Sandwich {
    private Bread bread;
    private Filling filling;
    private Sauce sauce;

    private Sandwich(){}

    public static class Builder{
        private Bread bread;
        private Filling filling;
        private Sauce sauce;

        public Builder(){}

        public Builder addBagel(){
            this.bread = new Bagel();
            return this;
        }
        public Builder addBaguette(){
            this.bread = new Baguette();
            return this;
        }
        public Builder addBeef(){
            this.filling = new Beef();
            return this;
        }
        public Builder addSmokedSalmon(){
            this.filling = new SmokedSalmon();
            return this;
        }
        public Builder addKetchup(){
            this.sauce = new Ketchup();
            return this;
        }
        public Builder addMustard(){
            this.sauce = new Mustard();
            return this;
        }

        public Sandwich build(){
            Sandwich sandwich = new Sandwich();
            sandwich.bread = this.bread;
            sandwich.filling = this.filling;
            sandwich.sauce = this.sauce;

            return sandwich;
        }
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread=" + bread +
                ", filling=" + filling +
                ", sauce=" + sauce +
                '}';
    }
}
