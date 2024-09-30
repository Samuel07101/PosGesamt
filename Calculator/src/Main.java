import java.io.Console;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      MainCalculator main = new MainCalculator();
      main.proccess();
    }

    public static void printUI(){
        System.out.println("Choose Calculator");
        System.out.println("1 - Relational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Exit Programm");
    }

}