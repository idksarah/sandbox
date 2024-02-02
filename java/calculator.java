//A simple calculator that takes 1 int for an operation, takes 2 doubles as input, and returns the solution.

import java.util.Scanner; //import the scanner class

/*
    errors with subtraction. e.g. 3.0 - 4.6= -1.5999999...
 */

public class Calculator {
        public static void main(String [] args) {
            Scanner scanner = new Scanner(System.in); // create scanner
            Scanner input = new Scanner(System.in); // create object of Scanner

            boolean run = true;
            while (run) {

                System.out.println("1 for addition, 2 for subtraction, 3 for multiplication, 4 for division.");
                System.out.println("5 for exponents, 6 for square root");
                int operation = scanner.nextInt();
                System.out.println("Enter 2 numbers separated by an enter.");
                System.out.println("If using a square root, input 0 as the second double");
                double doubleA = scanner.nextDouble();
                double doubleB = scanner.nextDouble();
                double answer = 0;

                if (operation == 1) {
                    answer = (doubleA + doubleB);

                } else if (operation == 2) {
                    answer = doubleA - doubleB;

                } else if (operation == 3) {
                    answer = doubleA * doubleB;

                } else if (operation == 4) {
                    if (doubleB != 0) {
                        answer = doubleA / doubleB;
                    }else{
                            System.out.println("Undefined; division by 0");
                        }
                } else if (operation == 5) {
                    answer = Math.pow(doubleA, doubleB);

                } else if (operation == 6) {
                    answer = Math.sqrt(doubleA);

                }

                System.out.println(answer);

                System.out.println("Press 0 to run again or 1 to exit");
                int runVariable = scanner.nextInt();
                if (runVariable == 1) {
                    run = false;
                }
            }
        }
    }