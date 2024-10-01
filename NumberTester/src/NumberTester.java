import java.io.*;
import java.net.Socket;

public class NumberTester{
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromTester;

    private int numberOfTests;

    private String path;

    public NumberTester(String path) {
        this.path = path;
    }

    public void numberTester(String fileName) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String line = bf.readLine();
            numberOfTests = Integer.parseInt(line);
            for (int i = 0; i <= numberOfTests; i++) {
                line = bf.readLine();
                String[] temp = line.split(" ");

                int testingNumber = Integer.parseInt(temp[1]);
                Boolean erg;
                switch (Integer.parseInt(temp[0])){
                    case 1:  erg  = oddTester.testNumber(testingNumber);
                    if(erg){
                        testFile("ODD");
                    }else{
                        testFile("EVEN");
                    }
                    break;
                    case 2:   erg  = primeTester.testNumber(testingNumber);
                    if(erg){
                        testFile("PRIME");
                    }else{
                        testFile("NO PRIME");
                    }
                    break;
                    case 3:   erg  = palindromTester.testNumber(testingNumber);
                        if(erg){
                            testFile("PALINDROME");
                        }else{
                            testFile("NO PALINDROME");
                        }
                    break;

                    default:testFile("ERROR");
                }

            }
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setOddEventTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromTester(NumberTest palindromTester) {
        this.palindromTester = palindromTester;
    }

    public void testFile(String erg){
        System.out.println(erg);
    }
}
