import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;
        n = input.nextInt();
        int dp[] = new int[n+1];
        dp[0] = dp[1] = 0;

        for (i = 2; i <= n; i++) {
            dp[i] = dp[i-1]+1;
            if(i%2==0){
                dp[i]=Math.min(dp[i],dp[i/2]+1);
            }
            if(i%3==0){
                dp[i]=Math.min(dp[i],dp[i/3]+1);
            }
        }
        System.out.print(dp[n]);
    }
}
