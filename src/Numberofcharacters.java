import java.util.HashMap;
import java.util.Map;

public class Numberofcharacters {
    public static void main(String[] args) {
        String str = "Prajwal";
        Map<Character,Integer> chrcount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            if (chrcount.containsKey(currentCharacter)){
                chrcount.put(currentCharacter,chrcount.get(currentCharacter)+1);
            }else {
                chrcount.put(currentCharacter,1);
            }

        }
        System.out.println(chrcount);
    }
}