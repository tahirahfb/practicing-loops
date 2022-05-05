import java.util.Scanner;

public class StopAtFive {
 public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
     while (true){
         System.out.println("Give a number:");
         double num = Double.valueOf(input.nextLine());

         if (num == 5){
             break;
         }
     }
 }   
}
