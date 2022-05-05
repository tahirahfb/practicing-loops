import java.util.Scanner;

public class CountToEleven {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.println("Enter a whole number less than 11");
       int number = Integer.valueOf(input.nextLine());

       for (int i = number; i <= 11; i++){
           System.out.println(i);
       }
   } 
}
