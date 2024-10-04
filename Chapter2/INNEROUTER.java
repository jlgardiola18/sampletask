
public class INNEROUTER {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        outerloop:
        for (int i=1; i <= 10; i++) {
            for (int j=1; j <= 10; j++) {
                if (i * j > 6) {
                    System.out.println("Breaking");
                    break outerloop;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Done");
    }
}