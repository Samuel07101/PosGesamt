import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate(1,2);

        LambdaCalculator lambdaCalculator = new LambdaCalculator(((number1, number2) -> number1+number2));
        lambdaCalculator.calculate(1,2);

        List<String> list = new ArrayList<>();
        list.add("jj");
        list.add("C++");

        list.stream().filter(s ->  s.length() > 3);

        List<String> filterd = list.stream().filter(s -> s.length() > 3).toList();


    }
}