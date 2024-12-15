import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Double> grade = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input First Quater Grades: ");
        double firstQuarter = scan.nextDouble();
        
        System.out.println("Input Second Quater Grades: ");
        double secondQuarter = scan.nextDouble();
        
        System.out.println("Input Third Quater Grades: ");
        double thirdQuarter = scan.nextDouble();
        
        System.out.println("Input Forth Quater Grades: ");
        double forthQuarter = scan.nextDouble();
        
        
        grade.add(firstQuarter);
        grade.add(secondQuarter);
        grade.add(thirdQuarter);
        grade.add(forthQuarter);
        
        double sumOfAllQuarter = 0;
        double totalQuarter = 4;
        for(double total : grade){
            sumOfAllQuarter += total;
        }
       double GPA = sumOfAllQuarter / totalQuarter;
       System.out.printf("Your total GPA is: %.2f \n", GPA);
    }
}
