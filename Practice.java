
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter a Number");
        Scanner N = new Scanner(System.in);
        int n = N.nextInt();
        N.close();

        for(int i = 1 ; i <= n ; i++){
            sum +=i;
        }
        System.out.println(sum);
        
    }

}

class Practice2{
    public static void main(String[] args) {
        int i = 0;
        
        int sum=1;

        System.out.println("Enter a Number");
        Scanner N = new Scanner(System.in);
        int n = N.nextInt();
        N.close();

        do {    
            i=n;
            n=sum;
            sum=i+n;
            System.out.println(sum);
        }while(sum<50);
    }
}