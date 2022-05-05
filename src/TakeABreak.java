import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Do you want to take a break?");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")){
            break;
            } 
        }
    }
}
