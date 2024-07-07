import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scr.nextInt();
        if ((year%4==0 && year%100 != 0) || (year %400==0))
        {
            System.out.println("This is a Leap year");

        }else {
            System.out.println("This is not a leap year");
        }
    }
}
