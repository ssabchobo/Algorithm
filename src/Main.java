import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int result = 1;
        for(int i=1;i<=number;i++){
            result *= i;
        }
        System.out.println(result);
    }
}