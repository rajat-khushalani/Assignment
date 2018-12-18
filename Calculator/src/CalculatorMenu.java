import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMenu {


        public static int userChoice(){
            System.out.println("Please Select Operation to Perform:");
            System.out.println("1-Addition");
            System.out.println("2-Subtraction");
            System.out.println("3-Division");
            System.out.println("4-Multiplication");
            System.out.println("5-Exit");
            Scanner sc=new Scanner(System.in);
            return sc.nextInt();
        }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        int userChoice=userChoice();

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



            switch (userChoice) {
                case 1:
                    System.out.println("Addition"+calc.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Substraction"+calc.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Division"+calc.divide(num1, num2));
                    break;
                case 4:
                    System.out.println("Multipication"+calc.multiply(num1, num2));
                    break;
                case 5:
                    System.out.println("Thank YOU");
                    break;
            }
            userChoice=userChoice();

        }


    }


}


