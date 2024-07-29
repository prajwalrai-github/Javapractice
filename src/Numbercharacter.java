import java.util.HashMap;
import java.util.Map;

public class Numbercharacter {
    public static void main(String[] args) {
        String str = "Shruthi";
        Map<Character,Integer> chcount= new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (chcount.containsKey(ch)){
                chcount.put(ch, chcount.get(ch)+1);
            }else {
                chcount.put(ch,1);
            }

        }
        System.out.println(chcount);
    }
}
