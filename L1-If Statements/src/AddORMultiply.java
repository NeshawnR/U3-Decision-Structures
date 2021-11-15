import java.util.Scanner;

public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, mutiply and display the result
    If not, add them and display the results.
     */


    public static void main(String[] args) {
        add();
        Mutiply();

    }
        public static void add(){
            Scanner read = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double num1 = read.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = read.nextDouble();

            double totalAdd = num1 + num2;
            System.out.println("Your total is "+ totalAdd);
        }

    public static void Mutiply(){
        Scanner read = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = read.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = read.nextDouble();

        double totalMutiply = num1 * num2;
        System.out.println("Your total is "+ totalMutiply);
    }

}
