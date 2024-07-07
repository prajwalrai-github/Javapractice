import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Charactercount {
    public static void main(String[] args) {
//        System.out.println("enter your name: ");
//        Scanner scr = new Scanner(System.in);
//        String ch = scr.next();
//
//        int a = 0;
//        for (int i = 0; i< ch.length();i++){
//            a++;
//        }
//        System.out.println("Count is " +a);



//        using streams counting the number of alphabets in name
          String pr = "Prajwal";
        long abc = pr.chars().filter(s->s=='a').count();
        System.out.println(abc);
//
//
        ArrayList<String> ab = new ArrayList<String>();
        ab.add("Prajwal");
        long charcount = ab.stream().filter(s->s.contains("P")).count();
        System.out.println("Count of character P is: "+ charcount);
//
//        // Count the number of characters
        long abc1 = pr.chars().count();
        System.out.println("Total characters : "+abc1);












    }
}
