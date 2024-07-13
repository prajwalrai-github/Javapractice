import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        System.out.println("Enter the number to check whether its prime number or not: ");
        int prime = scr.nextInt();
        if ( prime%1==prime)
        {
            System.out.println("This is prime number");
        }else{
            System.out.println("This is not a prime number");
        }

    }
}
