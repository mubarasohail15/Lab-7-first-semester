import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.next();

        String rev = new StringBuilder(s).reverse().toString();

        if (s.equals(rev))
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}
