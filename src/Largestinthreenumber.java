import java.util.Scanner;

public class Largestinthreenumber {
    public static void main(String[] args) {
        System.out.println("Enter three number to find which is greater: ");
        Scanner scr = new Scanner(System.in);
        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        int num3 = scr.nextInt();
        
        if (num1>num2 && num1>num3){
            System.out.println(num1 + " is greater");
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2 + " is greater");

        } else if (num3>num1 && num3>num2) {
            System.out.println(num3 + " is greater");

        }else{
            System.out.println("All numbers are equal");
        }

    }
}
