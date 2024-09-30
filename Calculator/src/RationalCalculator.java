public class RationalCalculator extends AbstractCalculator{

    public RationalCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);

    }

    @Override
    public Number add(Number a, Number b) {
        return this.add.calc(a,b);

    }

    @Override
    public Number substract(Number a, Number b) {
        return this.subtract.calc(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return this.multiply.calc(a,b);
    }

    @Override
    public Number divdide(Number a, Number b) {
        return this.divide.calc(a,b);
    }
}
