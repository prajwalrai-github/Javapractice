public class Reversestring {
    public static void main(String[] args) {
        String s = "Shruthi", str = "";
        char ch;
        for (int i = 0; i <s.length() ; i++) {
            ch=s.charAt(i);
            str=ch+str;

        }
        System.out.println(str);
    }
}
