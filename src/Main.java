import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n+1];
        if(n==0){
            arr[0] = 0;
        }
        else if(n==1) {
            arr[1] = 1;
        }
        else if(n==2){
            arr[2] = 3;
        }
        else if(n>=3){
            arr[1]=1;
            arr[2]=3;
            for (int i = 3; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    arr[j] = 2 * arr[j - 2] + arr[j - 1];
                    arr[j] %= 10007;
                }
            }
        }
        System.out.println(arr[n]);
    }
}