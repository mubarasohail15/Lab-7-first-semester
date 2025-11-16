import java.util.Scanner;

public class Lab2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        int unicode = (int) ch;
        System.out.println("The Unicode for the character " + ch + " is " + unicode);
    }
}
