package Chapter2;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        
        for(int x = 1 ; x <= 10 ; x++){
            for(int y = 1 ; y <= 10 ; y++){
                System.out.printf("%5d", x*y);
            }
                System.out.println("");
        }
        
        // int sum = 0;
        // System.out.println("Enter a Number");
        // Scanner N = new Scanner(System.in);
        // int n = N.nextInt();
        // N.close();

        int num1 = 0, num2 = 1;
        int sum = 0;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = scanner.nextInt();

        while(sum <= n){
            System.out.print(num1 + ", ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        
    }

}
