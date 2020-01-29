import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //n입력
        int m = in.nextInt(); //m입력

        int[] arr = new int[n]; //n만큼 정수카드 입력
        //배열 초기화
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int result = 0; //3장의 카드값 결과
        int max=0; //max값

        for(int i=0;i<n-2;i++) {
            for (int j = i + 1; j < n-1; j++) {
                for (int k = j + 1; k < n; k++) {
                    result = arr[i] + arr[j] + arr[k];
                    if (result <= m && result > max) {
                        max = result;
                    }
                }
            }
        }
        System.out.println(max);
    }
}