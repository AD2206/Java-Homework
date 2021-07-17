import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.println("Please Enter Space Separated 3 numbers");

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        System.out.println("The value of a * b + c  = " + (a * b + c));
        System.out.println("The value of (c / a) * b = " + ((c / a) * b));
        System.out.println("The value of a + ((c / a) - 3)*c = " + (a + ((c / a) - 3) * c));
    }
}
