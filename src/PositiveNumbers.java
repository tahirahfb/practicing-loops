import java.util.Scanner;

public class PositiveNumbers {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       while (true){
           System.out.println("Enter a number:");
           double answer = Double.valueOf(input.nextLine());

           if (answer == 0){
               break;
           }

           if (answer < 0){
           System.out.println("Number must be positive!");
            continue;
           }

           System.out.println("Number is " + answer);
       }
   } 
}
