import java.util.Scanner;

public class Vowlesconsonant {
    public static void main(String[] args) {
        System.out.println("Enter Alphabet: ");
        Scanner scr = new Scanner(System.in);
        String ch = scr.next();
        if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")){
            System.out.println("This is vowel");
        } else if (ch.equals("A") || ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U") )
        {
            System.out.println("This is vowel");
        }
        else {
            System.out.println("This is consonant");
        }scr.close();

    }
}
