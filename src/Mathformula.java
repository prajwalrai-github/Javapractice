import java.util.Scanner;

public class Mathformula {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number of x");
        double x = scr.nextDouble();
        System.out.println("Enter the number of y");
        double y = scr.nextDouble();
        System.out.println("Enter the number of z");
        double z = scr.nextDouble();



        double result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println("Answer is: " + result);
        scr.close();
    }

}
