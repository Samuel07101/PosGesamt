import java.io.*;

public class NumberTester{
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromTester;

    private int numberOfTests;

    private int[] numbers;
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
                switch (Integer.parseInt(temp[0])){
                    case 1: oddTester.testNumber(testingNumber);break;
                    case 2: primeTester.testNumber(testingNumber);break;
                    case 3: palindromTester.testNumber(testingNumber);break;
                }

            }
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (
                IOException e) {
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


}
