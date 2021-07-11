import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Double f;
        Double cel;
        Scanner in;

        in = new Scanner(System.in);
        System.out.print("Enter F: ");
        f = in.nextDouble();
        cel = (f - 32) * 5/9;
        System.out.println("Temp in C is: " + cel);
    }
}