import javax.sound.midi.Soundbank;
import java.io.Console;
import java.util.Scanner;

public class MainCalculator {

    CalculationOperation add;
    CalculationOperation subtract;
    CalculationOperation multiply;
    CalculationOperation divide;
    public void proccess(){
        boolean loop = true;
        Number numb;
        Number numb1;
        String what = "";
        while(loop){
            Number retNumber = new Number();
            boolean again = true;

            printUI();
            Scanner console = new Scanner(System.in);
            String input = console.nextLine();

            int uiInput = Integer.parseInt(input);
            int function = 0;


            switch (uiInput) {
                case 1:
                     numb = new Number();
                     numb1 =  new Number();
                     what = "add";
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

                        System.out.print("Enter number a ->");
                        input = console.nextLine();
                        numb.setA(Integer.parseInt(input));
                        System.out.println();
                        System.out.print("Enter number b ->");
                        input = console.nextLine();
                        numb1.setA(Integer.parseInt(input));
                        System.out.println();
                        printFunctions();
                        input = console.nextLine();
                        function = Integer.parseInt(input);
                        switch (function) {
                            case 1:
                                retNumber= rationalC.add(numb, numb1);
                                break;
                            case 2:
                                retNumber= rationalC.substract(numb, numb1);
                                break;
                            case 3:
                                retNumber= rationalC.multiply(numb, numb1);
                                break;
                            case 4:
                                retNumber= rationalC.divdide(numb, numb1);
                                break;
                            case 5:
                                again = true;
                                break;
                            default:
                                again = true;
                                System.out.println("Number not included");
                        }

                        if(!again) {
                            printNumb(retNumber, what);
                        }
                    }
                    break;
                case 2:
                    what = "vector";
                     numb= new Number();
                     numb1 =  new Number();

                     add = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() + y.getA());
                        ret.setB(x.getB() + x.getB());
                        return ret;
                    };
                     subtract = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() - y.getA());
                        ret.setB(x.getB() - y.getB());
                        return ret;
                    };
                     multiply = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() * y.getB());
                        ret.setB(x.getB() * x.getA());
                        return ret;
                    };
                     divide = (x, y) -> {
                        Number ret = new Number();
                        ret.setA(x.getA() / y.getB());
                        ret.setB(x.getB() / y.getA());
                        return ret;
                    };


                    VectorCalculator vectorC = new VectorCalculator(add,subtract,multiply,divide);

                    while(again) {
                        again = false;

                        System.out.println("Enter number x1 ->");
                        input = console.nextLine();
                        numb.setA(Double.parseDouble(input));
                        System.out.println();
                        System.out.print("Enter number y1 ->");
                        input = console.nextLine();
                        numb.setB(Double.parseDouble(input));
                        System.out.println();
                        System.out.print("Enter number x2 ->");
                        input = console.nextLine();
                        numb1.setA(Double.parseDouble(input));
                        System.out.println();
                        System.out.print("Enter number y2 ->");
                        input = console.nextLine();
                        numb1.setB(Double.parseDouble(input));
                        System.out.println();



                        printFunctions();
                        input = console.nextLine();
                        function = Integer.parseInt(input);

                        switch (function) {
                            case 1:
                                retNumber= vectorC.add(numb, numb1);
                                break;
                            case 2:
                                retNumber= vectorC.substract(numb, numb1);

                                break;
                            case 3:
                                retNumber= vectorC.multiply(numb, numb1);
                                break;
                            case 4:
                                retNumber= vectorC.divdide(numb, numb1);
                                break;
                            case 5:
                                again = true;
                                break;
                            default:
                                again = true;
                                System.out.println("Number not included");
                        }

                        if(!again) {
                            printNumb(retNumber, what);
                        }
                    }
                    break;
                case 3:
                    what = "complex";
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
                    ComplexCalculator complexC = new ComplexCalculator(add, subtract, multiply, divide);


                    while(again) {
                        again = false;

                        System.out.println("Enter number a ->");
                        input = console.nextLine();
                        numb.setA(Double.parseDouble(input));
                        System.out.println();
                        System.out.print("Enter number b ->");
                        input = console.nextLine();
                        numb1.setA(Double.parseDouble(input));
                        System.out.println();



                        printFunctions();
                        input = console.nextLine();
                        function = Integer.parseInt(input);
                        switch (function) {
                            case 1:
                                retNumber= complexC.add(numb, numb1);
                                break;
                            case 2:
                                retNumber= complexC.substract(numb, numb1);
                                break;
                            case 3:
                                retNumber= complexC.multiply(numb, numb1);
                                break;
                            case 4:
                                retNumber= complexC.divdide(numb, numb1);
                                break;
                            case 5:
                                again = true;
                                break;
                            default:
                                again = true;
                                System.out.println("Number not included");
                        }

                        if(!again) {
                            printNumb(retNumber, what);
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
        System.out.println("4 - divide");
        System.out.println("5 - type numbers again");

    }

    public void printNumb(Number number,String s){
        System.out.println("------------------");
        System.out.println("   Solution:");
        if(s.equals("add")){
            System.out.println(number.getA());
        } else if (s.equals("vector")) {
            System.out.println("a: "+number.getA());
            System.out.println("b: "+number.getB());
        }else if(s.equals("complex")){
            System.out.println(number.getA());
        }
        System.out.println("------------------");
    }

    public void printUI(){
        System.out.println("Choose Calculator");
        System.out.println("1 - Rational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Exit Programm");
    }
}
