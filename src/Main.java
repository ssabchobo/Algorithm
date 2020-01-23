import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int a=1;
        int b=1;
        int c=1;

        for(int i = 1;;i++) {
            if (num1 == a && num2 == b && num3 == c) {
                System.out.println(i);
                break;
            }
            a++;
            b++;
            c++;

            if (a == 16) {
                a = 1;
            }
            if (b == 29) {
                b = 1;
            }
            if (c == 20) {
                c = 1;
            }
        }
    }
}