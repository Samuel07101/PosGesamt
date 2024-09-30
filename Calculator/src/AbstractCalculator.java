public abstract class AbstractCalculator {
    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;

    public AbstractCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public abstract Number add(Number a,Number b);
    public abstract Number substract(Number a,Number b);
    public abstract Number multiply(Number a,Number b);
    public abstract Number divdide(Number a,Number b);

}
