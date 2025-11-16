import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        int first = s.indexOf("h");
        int last = s.lastIndexOf("h");

        String middle = s.substring(first + 1, last).replace("h", "H");

        String result = s.substring(0, first + 1) + middle + s.substring(last);

        System.out.println(result);
    }
}
