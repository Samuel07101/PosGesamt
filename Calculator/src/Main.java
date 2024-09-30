import java.io.Console;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      MainCalculator main = new MainCalculator();
    }

    public static void printUI(){
        System.out.println("Choose Calculator");
        System.out.println("1 - Relational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Exit Programm");
    }

    public static void printOptions(){
        System.out.println("1 - Plus");
        System.out.println("2 - Substract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("5 - Enter Numbers again");
    }

    }
}