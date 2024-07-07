import java.util.Scanner;

public class Vowlesconsonant {
    public static void main(String[] args) {
        System.out.println("Enter Alphabet: ");
        Scanner scr = new Scanner(System.in);
//        String ch = scr.next(); if we use string then mention .equal in place of ==
        char ch = scr.next().charAt(0);
        if (ch==('a') || ch==('e') || ch==('i') || ch==('o') || ch==('u')){
            System.out.println("This is vowel");
        } else if (ch==('A') || ch==('E') || ch==('I') || ch==('O') || ch==('U') )
        {
            System.out.println("This is vowel");
        }
        else {
            System.out.println("This is consonant");
        }scr.close();


    }
}
