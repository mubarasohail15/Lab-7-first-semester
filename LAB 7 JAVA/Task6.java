import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        int space = line.indexOf(" ");
        String first = line.substring(0, space);
        String second = line.substring(space + 1);

        System.out.println(second + " " + first);
    }
}
