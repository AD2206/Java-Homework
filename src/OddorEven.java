import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter A Number");
        number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("It is an even number");
        }
        else {
            System.out.println("It is an odd number");
        }

    }

}
