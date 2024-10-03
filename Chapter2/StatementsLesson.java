package Chapter2;

public class StatementsLesson {
    // static boolean getScore(){
    //     return true;
    // }
    public static void main(String[] args) {
        
        int grades = 75;
        if(grades<=75)
            System.out.println("FAILED!");
        else
            System.out.println("PASSED!");

        int counter = 0;
        char option = 'b';
        switch(option){
            case 'a': System.out.println("Option a is selected");
            counter++;
            break;
            case 'b': System.out.println("Option b is selected");break;
            case 'c': System.out.println("Option c is selected");
            default: System.out.println("invalid option");
        }


        }

}