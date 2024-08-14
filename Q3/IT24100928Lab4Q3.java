import java.util.Scanner;

public class IT24100928Lab4Q3 {

     public static void main(String[] args) {

         Scanner input=new Scanner(System.in);
         System.out.print("Enter a number: "); 
         int num=input.nextInt();
         String status;

         status = (num==0)? "The number is: Zero" : (num>=1)? "The number is Positive" : "The number is Negative";
         
         System.out.println(status);

  }


}