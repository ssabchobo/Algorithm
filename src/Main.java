import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n+1];

        for(int i=0;i<=n;i++){
            if(i<3){
                arr[i]=i;
            }else{
                arr[i] = arr[i - 1] + arr[i - 2];
                arr[i] %= 10007;
            }
        }
        System.out.println(arr[n]);
    }
}