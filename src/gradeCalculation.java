import java.util.Scanner;

public class gradeCalculation {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter marks obtained in CS") ;

        char grade = '.';
        double marks = sc. nextDouble();

        if(marks>=90) {
            grade = 'A';
        }
        else if(marks>=70 && marks<=89) {
            grade = 'B';

        }
        else if(marks>=50 && marks<=69) {
            grade = 'C';
        }
        else if (marks<=50) {
            grade ='D' ;
        }

        else{
            System.out.println("Enter a valid mark");
            System.exit(-1);
        }

        System.out.println("Grade Obtained by the Student =  " + grade);

    }
}