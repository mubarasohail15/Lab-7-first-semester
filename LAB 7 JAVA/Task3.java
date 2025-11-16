import java.util.Scanner;

public class Lab3A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int num = input.nextInt();

        if (num < 0 || num > 15) {
            System.out.println(num + " is an invalid input");
        } else {
            String hex = Integer.toHexString(num).toUpperCase();
            System.out.println("The hex value is " + hex);
        }
    }
}
