import java.io.Console;

public class MainCalculator {

    CalculationOperation add;
    CalculationOperation subtract;
    CalculationOperation multiply;
    CalculationOperation divide;
    public void proccess(){
        boolean loop = true;
        Number numb;
        Number numb1;
        while(loop){
            boolean again = true;
            Console console = System.console();
            String input = console.readLine();
            int uiInput = Integer.parseInt(input);
            int function = 0;
            Main.printUI();

            switch (uiInput) {
                case 1:
                     numb = new Number();
                     numb1 =  new Number();

                     add = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() + y.getA());
                        return ret;
                    };
                     subtract = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() - y.getA());
                        return ret;
                    };
                     multiply = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() * y.getA());
                        return ret;
                    };
                     divide = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() / y.getA());
                        return ret;
                    };

                    RationalCalculator rationalC = new RationalCalculator(add,subtract,multiply,divide);

                    while(again) {
                        again = false;

                        System.out.println("Enter number a");
                        input = console.readLine();
                        numb.setA(Double.parseDouble(input));
                        System.out.println("Enter number B");
                        input = console.readLine();
                        numb1.setA(Double.parseDouble(input));

                        printFunctions();
                        input = console.readLine();
                        function = Integer.parseInt(input);
                        switch (function) {
                            case 1:
                                rationalC.add(numb, numb1);
                                break;
                            case 2:
                                rationalC.substract(numb, numb1);
                                break;
                            case 3:
                                rationalC.substract(numb, numb1);
                                break;
                            case 4:
                                rationalC.substract(numb, numb1);
                                break;
                            case 5:
                                again = true;
                                break;
                            default:
                                again = true;
                                System.out.println("Number not included");
                        }
                    }
                    break;
                case 2:
                     numb= new Number();
                     numb1 =  new Number();

                     add = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() + y.getA());
                        return ret;
                    };
                     subtract = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() - y.getA());
                        return ret;
                    };
                     multiply = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() * y.getA());
                        return ret;
                    };
                     divide = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() / y.getA());
                        return ret;
                    };


                    RationalCalculator vectorC = new RationalCalculator(add,subtract,multiply,divide);

                    while(again) {
                        again = false;

                        System.out.println("Enter number x");
                        input = console.readLine();
                        numb.setA(Double.parseDouble(input));
                        System.out.println("Enter number y");
                        input = console.readLine();
                        numb.setB(Double.parseDouble(input));
                        System.out.println("Enter number x");
                        input = console.readLine();
                        numb1.setA(Double.parseDouble(input));
                        System.out.println("Enter number y");
                        input = console.readLine();
                        numb1.setB(Double.parseDouble(input));


                        printFunctions();
                        input = console.readLine();
                        function = Integer.parseInt(input);
                        switch (function) {
                            case 1:
                                vectorC.add(numb, numb1);
                                break;
                            case 2:
                                vectorC.substract(numb, numb1);
                                break;
                            case 3:
                                vectorC.substract(numb, numb1);
                                break;
                            case 4:
                                vectorC.substract(numb, numb1);
                                break;
                            case 5:
                                again = true;
                                break;
                            default:
                                again = true;
                                System.out.println("Number not included");
                        }
                    }
                    break;
                case 3:
                     numb = new Number();
                     numb1 =  new Number();

                    add = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() + y.getA());
                        return ret;
                    };
                    subtract = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() - y.getA());
                        return ret;
                    };
                    multiply = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() * y.getA());
                        return ret;
                    };
                    divide = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() / y.getA());
                        return ret;
                    };
                    RationalCalculator complexC = new RationalCalculator(add, subtract, multiply, divide);


                    while(again) {
                        again = false;

                        System.out.println("Enter number a");
                        input = console.readLine();
                        numb.setA(Double.parseDouble(input));
                        System.out.println("Enter number B");
                        input = console.readLine();
                        numb1.setA(Double.parseDouble(input));



                        printFunctions();
                        input = console.readLine();
                        function = Integer.parseInt(input);
                        switch (function) {
                            case 1:
                                complexC.add(numb, numb1);
                                break;
                            case 2:
                                complexC.substract(numb, numb1);
                                break;
                            case 3:
                                complexC.substract(numb, numb1);
                                break;
                            case 4:
                                complexC.substract(numb, numb1);
                                break;
                            case 5:
                                again = true;
                                break;
                            default:
                                again = true;
                                System.out.println("Number not included");
                        }
                    }
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Error wrong input");
            }
        }
    }

    public void printFunctions(){
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - mulitply");

    }
}
