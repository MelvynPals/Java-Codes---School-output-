import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.time.LocalTime;
public class CurrentDateTime {    
  public static void main(String[] args) {    
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));   
   
   System.out.println(java.time.LocalTime.now());
   
   LocalTime time = java.time.LocalTime.now();   
  }    
}   