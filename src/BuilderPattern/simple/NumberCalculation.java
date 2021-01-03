package BuilderPattern.simple;

public class NumberCalculation {

    private double result;

    private NumberCalculation(){}

    public static class Builder{
        private double result;

        public Builder(){}

        public Builder addOne(){
            this.result += 1;
            return this;
        }
        public Builder multiplyByTwo(){
            this.result *= 2;
            return this;
        }
        public Builder addFour(){
            this.result += 4;
            return this;
        }

        public NumberCalculation build(){
            NumberCalculation calculations = new NumberCalculation();
            calculations.result = this.result;
            return calculations;
        }
    }

    @Override
    public String toString() {
        return "NumberCalculation{" +
                "result=" + result +
                '}';
    }
}
