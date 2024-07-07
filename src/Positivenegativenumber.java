import java.util.Scanner;

public class Positivenegativenumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = scr.nextInt();
        if (num1<0){
            System.out.println(num1 + " This is a negative number");
        }else {
            System.out.println(num1 + " This is positive number");
        }
        scr.close();
    }
}
