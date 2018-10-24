import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int input1, input2;
        
        System.out.print("Type the first number: ");
        input1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        input2 = Integer.parseInt(reader.nextLine());
        
        if (input1 > input2) {
           System.out.println("Greater number: " + input1);
        } else if (input2 > input1) {
           System.out.println("Greater number: " + input2);
        } else {
           System.out.println("The numbers are equal!");
        }

    }
}
