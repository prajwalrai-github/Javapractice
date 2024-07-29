import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // count the number of characters
//        Scanner scr = new Scanner(System.in);
//        System.out.println("Enter the word: ");
//        String s = scr.next();
//            System.out.println(s.length());


        // Count the number of occurrence in word


        //removing space in the string

        String scr1 = "hello java Learning";

//        long cnt = scr1.chars().filter(s->s=='a').count();
//        System.out.println("Total number of alphabet: "+ cnt);

        String scr2=scr1.replace(" ","");
        System.out.println(scr2);

//        Finding Common Elements in Arrays
//
//        int[] abc= {1,2,3,4,5};
//        int[] abc1= {2,5,6,7,8};

        //rever the string
        String str = "Prajwal", nstr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            nstr = ch+nstr;

        }
        System.out.println(nstr);


    }
}
