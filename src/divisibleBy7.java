import java.util.Scanner;

public class divisibleBy7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a, b;

        System.out.println("Enter Space Separated 2 Numbers");

        a = scanner.nextInt();
        b = scanner.nextInt();

        if(a % 7 == 0 && b % 7 == 0){

            System.out.println("Both are divisible by 7");
        }

        else{

            System.out.println("Both are not divisible by 7");
        }

    }

}
