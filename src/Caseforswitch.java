import java.util.Scanner;

public class Caseforswitch {
    public static void main(String[] args) {
        //Program to check the grade based on marks
        System.out.println("Enter your Mark: ");
        Scanner scr = new Scanner(System.in);
        int mark = scr.nextInt();

        //90 -> 90/10->9 -> A (90 -100) -> A
        //87 -> 87/10->8 -> A (80 -89) -> B
        //77 -> 77/10->7 -> A (70 -79) -> C
        mark = mark/10;
        switch (mark){
            case 9:
               System.out.println("Your grade is A");
               break;
            case 8:
                System.out.println("Your grade is B");
                break;
            case 7:
                System.out.println("Your grade is C");
                break;
            default:
                System.out.println("Your fall in grade D");
             scr.close();

        }




    }
}
