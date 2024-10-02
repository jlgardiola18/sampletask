package Chapter2;

public class OperatorsLesson {
    public static void main(String[] args){
        int p = 0;
        System.out.println(p++);    // 0 post-unary ops
        System.out.println(p);      //1
        System.out.println(--p);    // pre-unary ops
        System.out.println(p);
        System.out.println((10 + p * --p) + p++);
        // (10 + 0 * --1) + -1
        // 3 print foo, 5 print bar, 3 & 5 print foo bar
        System.out.println(8>>3);
        System.out.println(1<<3);
        /*  1   1   1   1
         *  8   4   2   1
         *  1   0   0   0
         *  0   0   0   1
         */ 

        int age = 19;
        String msg = (age>=21)? "you can now work":"not yet";
        System.out.println(msg);

        // long * int = long
        // double + float = double
        // short / short = int
        // short * float / double = double

        // int x = (int)1.0;
        // short y = (short)1921222; // stored as 20678
        // int z = (int)9l;
        // long t = 192301398193810323l;
        // System.out.println(y);

        // short x = 10;
        // short y = 3;
        // short z = (short)(x * y);
        // System.out.println(z);

        // long x = 5;
        // int y = 10;
        // // y = x*y;
        // y*=x;   // y = (type of y)(y*x)
        // x*=y;   // x = (type of x)(x*y)

        // long x = 5;
        // long y = (x=3);
        // System.out.println(x);  // outputs 3
        // System.out.println(y);  // also 3

        int c = 10;
        int d = (c=45); // c=45 d=45
        System.out.println(c+d);








    }
}
