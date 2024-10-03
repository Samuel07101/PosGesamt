public class LambdaCalculator {
    CalculationOperation add;

    public LambdaCalculator(CalculationOperation add) {
        this.add = add;
    }

    public int calculate(int number1, int number2){
        return add.calculate(number1,number2);
    }

}
