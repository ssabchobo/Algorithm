import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        int[] arr = new int[num1+1];
        int[] D = new int[num1+1];

        for(int i = 1; i<=num1;i++){
            arr[i] = in.nextInt();
        }

        for(int i=1;i<=num1;i++){
            for(int j=1;j<=i;j++){
                D[i] = Math.max(D[i],arr[j]+D[i-j]);
            }
        }
        System.out.println(D[num1]);
    }
}