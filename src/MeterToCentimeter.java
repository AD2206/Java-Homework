import java.util.Scanner;

public class MeterToCentimeter {

    public static void main(String[] args){
        double valueinm;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Value in Meters");
        valueinm = scanner.nextDouble();
        System.out.println("Value in Centimeters is = " + valueinm * 100 + " cm");
    }
}
