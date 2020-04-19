import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        input = in.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(i-1)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}