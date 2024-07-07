import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //take the input from the user and assign the grade

        Scanner src = new Scanner(System.in);
        System.out.println("Enter the marks");
        int num1 = src.nextInt();
        if (num1>=90 && num1<=100)
        {
            System.out.println("Student passed with grade 'A' ");
        } else if (num1>=80 && num1<=89) {
            System.out.println("Student passed with grade 'B' ");

        }else if (num1>=70 && num1<=79)
        {
            System.out.println("Student passed with grade 'C' ");
        } else if (num1>=35 && num1<=69) {
            System.out.println("Student passed with grade 'D' ");
        } else if (num1>100) {
            System.out.println("Total marks is out of 100 cant add more than it");
        } else {
            System.out.println("Unfortunately you grade is 'F' ");
        }
        src.close();

    }
}