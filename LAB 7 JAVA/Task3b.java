import java.util.Scanner;

public class Lab3B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String h = input.next().toUpperCase();

        if (h.matches("[0-9A-F]")) {
            int value = Integer.parseInt(h, 16);
            String binary = Integer.toBinaryString(value);
            System.out.println("The binary value is " + binary);
        } else {
            System.out.println(h + " is an invalid input");
        }
    }
}
