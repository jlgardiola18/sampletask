package Chapter2;

public class LoopsLesson {
    public static void main(String[] args) {
        int w=0;
        while(w<9)
            System.out.println("w=" + w++);
        do
            System.out.println("do w" + w--);
        while(w>0);
    }


    
}
