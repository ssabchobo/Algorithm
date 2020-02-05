import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;

public class Main{
    static char arr[][];// 2차원 배열 생성

    public static void star(int x, int y, int z){ // 재귀호출
        int num = 0; // num초기화 (입력받은 값을 계속 3으로 나눠주기 위함)
        if(z==1){
            arr[x][y] = '*';
            return;
        }
        num = z/3; // 입력받은 값을 3으로 나눔

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (i == 1 && j == 1) {
                    continue; // 자신이 포함된 반복문의 끝으로 이동
                }
                star(x+(num*i),y+(num*j),num);
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new char[n][n];

        for(int i=0;i<arr.length;i++){
            Arrays.fill(arr[i],' '); // ' '으로 모든 배열 초기화
        }
        star(0,0,n); // 함수 호출
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]); // 출력
        }
    }
}