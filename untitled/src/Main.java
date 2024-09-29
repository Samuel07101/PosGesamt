import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        NumberTester numberTester = new NumberTester("jjj");
        NumberTest oddTester = number -> {
            if(number % 2 == 0){
                return false;
            }
            return true;
        };

        NumberTest primeTester = number -> {
            if(number == 1 || number == 0){
                return true;
            }
            for(int i = 2;i < 10;i++){
                if(number%i == 0){
                    return false;
                }
            }
            return true;
        };

        NumberTest palindromTester = number -> {
            String temp = ""+number;
            char[] c = temp.toCharArray();
            char[] returnChar = c;

            int x = c.length;
            for(int i = 0;i <= c.length;i++){
               if(returnChar[i] != c[x]){
                   return false;
               }
            }
            return true;
        };

        numberTester.setOddEventTester(oddTester);
        numberTester.setPrimeTester(primeTester);
        numberTester.setPalindromTester(palindromTester);
    }
}