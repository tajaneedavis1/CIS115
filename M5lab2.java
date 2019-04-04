package m5lab2;

/**
 *
 * @author davist8783
 */
import java.util.Scanner;

public class M5lab2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         showMenu();
         int menu = getInt();
         
         
}
 public static void showMenu (){
         System.out.println("1. Greetings");
         System.out.println("2. Double");
         System.out.println("3. Take 10%");
         System.out.println("4. Gross Pay");
         
                  
}
  public static int getInt() {
         int num;
         
 
         //get number here 
          Scanner kb= new Scanner( System.in);
          num = kb.nextInt();
         return num; 
     }
}
