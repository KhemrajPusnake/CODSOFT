
import java.util.Scanner;
public class studentgradecalculator
 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the marks of five subjects::\n");

        
        int sub_1 = in.nextInt();
        int sub_2 = in.nextInt();
        int sub_3 = in.nextInt();
        int sub_4 = in.nextInt();
        int sub_5 = in.nextInt();
        int sub_6 = in.nextInt();

        int total;
        int average;
        float percentage;
        char grade;

        total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5 + sub_6;
        average = (int)(total /6);
        percentage = (float)((total / 600.0) * 100);

        if (average >= 90)
            grade = 'A';
        else if (average >= 80 && average < 90)
            grade = 'B';
        else if (average >= 70 && average < 80)
            grade = 'C';
        else if (average >= 60 && average < 70)
            grade = 'D';
        else
            grade = 'E';

        System.out.println("\nThe Total marks   = " + total + "/600");
        System.out.println("The Average marks = " + average);
        System.out.println("The Percentage    = " + percentage + "%");
        System.out.println("The Grade         = '" + grade + "'");
    }
}