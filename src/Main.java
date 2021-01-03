import BuilderPattern.simple.NumberCalculation;
import BuilderPattern.complex.Sandwich;

public class Main {

    public static void main(String[] args) {
        testBuilderPattern();
    }

    private static void testBuilderPattern(){

        NumberCalculation numberCalculation = new NumberCalculation.Builder()
                .addOne()
                .addFour()
                .multiplyByTwo()
                .addFour()
                .build();

        System.out.println(numberCalculation);


        Sandwich sandwich = new Sandwich.Builder()
                .addBagel()
                .addBeef()
                .addMustard()
                .build();
        System.out.println(sandwich);
    }
}
