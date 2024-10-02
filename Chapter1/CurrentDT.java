package Chapter1;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class CurrentDT {    
  public static void main(String[] args) {    
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));  
  }    
}    