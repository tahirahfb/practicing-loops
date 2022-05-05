import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input a whole number:");
        int number = Integer.valueOf(input.nextLine());

        for (int i = 1; i <= 10; i++)
        System.out.println(number + " x " + i + " = " + (number * i));
    }
}

