import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        int userChoice=0;
        while (userChoice!=5) {
            NumberCalculator calc = new NumberCalculator();
            try {
                System.out.print("Please Enter The First Number: ");
                num1 = input.nextDouble();
                System.out.print("Please Enter The Second Number: ");
                num2 = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input Type");
            }
            System.out.println("Please Select Operation to Perform:");
            System.out.println("1-Addition");
            System.out.println("2-Subtraction");
            System.out.println("3-Division");
            System.out.println("4-Multiplication");
            userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println(calc.add(num1, num2));
                    break;
                case 2:
                    System.out.println(calc.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println(calc.divide(num1, num2));
                    break;
                case 4:
                    System.out.println(calc.multiply(num1, num2));
                    break;
            }

        }


    }


}


