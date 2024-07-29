import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter below 3 numbers");
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        if (a == b && b == c){
            System.out.println("This is a equilateral triangle");
        } else if (a==b || b==c || c==a) {
            System.out.println("This is isosceles triangle");
        }else {
            System.out.println("It's a scalene triangle");
        }

        scr.close();
    }
}
