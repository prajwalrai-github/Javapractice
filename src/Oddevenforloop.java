public class Oddevenforloop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i%2==0){
                System.out.println(i+ " - This is even number");
                continue;
            }
            System.out.println(i+ " - This is odd number");

        }
    }
}
