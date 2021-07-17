import java.util.Scanner;

public class CompareandDecide {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double a, b;

        System.out.println("Enter 2 numbers");

        a = scanner.nextDouble();
        b = scanner.nextDouble();

        if (a < b){
            System.out.println("Multiplication of the two is = " + (a * b));
        }

        else{
            System.out.println("Subtraction of the two is = " + (b - a));
        }

    }

}
