import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("Hello from CIS115!");
    System.out.println("");

   // ask user for their age 
   System.out.println("What is your age?") ;
   
   int age; 

   Scanner kb= new Scanner( System.in);
   
   age = kb.nextInt();

   //output the answer
   System.out.println( " You are " + age);

   //tell them their next year's age 
   int nextAge;
   
   nextAge = age + 1;
   
   System.out.println("Soon you will be " +
   nextAge);

  }
}