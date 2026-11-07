package GradeCalculator;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter grades for subject 1");
        int subject1= sc.nextInt();

        System.out.println("Enter grades for subject 2");
        int subject2= sc.nextInt();

        System.out.println("Enter grades for subject 3");
        int subject3= sc.nextInt();

        int total= subject1 + subject2+ subject3;
        double Average= total/3;

        System.out.println("Total grades:" + total);
        System.out.println("Total Average:" + Average);

        if(Average>= 50){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

    }
}
