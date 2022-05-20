import java.util.Scanner;

public class greatestVal{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("please enter the first number: ");
        num1 = scanner.nextInt();

        System.out.println("please enter the second number: ");
        num2 = scanner.nextInt();

        if(num1 > num2){

            System.out.println("The first number is greater than second number!");
        } else if (num1 == num2) {

            System.out.println("both numbers are equal!");
        } else {
            System.out.println("second number is greater than number 1!");
        }


    }
}