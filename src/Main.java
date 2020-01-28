import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] price = new int[n+1];
        int[] D = new int[n+1];

        for(int i = 1; i<=n;i++){
            price[i] = in.nextInt();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(D[i]==0||D[i]>D[i-j]+price[j]) {
                    D[i] = price[j] + D[i - j];
                }
            }
        }
        System.out.println(D[n]);
    }
}