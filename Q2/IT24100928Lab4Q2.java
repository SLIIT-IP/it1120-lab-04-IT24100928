import java.util.Scanner;

public class IT24100928Lab4Q2 {

       public static void main(String[] args) {
                 
            Scanner input=new Scanner(System.in);
            System.out.print("Please enter exam marks (out of 100) :");
            double exammark=input.nextDouble();
            
            if(exammark>100 || exammark<0)
            { 
                  System.out.println("Invalid input for exam marks. Terminating program");
                   System.exit(0);
             }
             
            
            System.out.print("Please enter lab submission marks (Out of 100) :");
            double labs=input.nextDouble();
           if(labs>100 || labs<0)
           {
                System.out.print("Invalid input for exam marks. Terminating program");
                System.exit(0);
            
           }
                            
            System.out.print("Please enter the percentage given for the exam: ");

            double markpercent=input.nextDouble();
            if(markpercent>100 || markpercent<0)
            {
            System.out.print("Invalid input for exam marks. Terminating program");
            System.exit(0);
            }

            
            System.out.print("Please enter the percentage given for the lab submission: ");

            double labpercent=input.nextDouble();
            if(labpercent>100 || labpercent<0)
            {
                System.out.print("Invalid input for exam marks. Terminating program");
                System.exit(0);
            }

          double errormsg=markpercent+labpercent;
          if(errormsg>100)
          {
               System.out.println("The percentages must add up to 100. Terminating program."); 
               System.exit(0);
          }
          double finalexam=exammark * markpercent/100;
          double finallab=labs * labpercent/100; 
          double finalmark=finalexam + finallab;
             
         System.out.println("");

         System.out.println("Final Exam Mark is : " + finalmark);
                   

            



   
  } 

}