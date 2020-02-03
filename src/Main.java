import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;

public class Main{
    static int n,m;
    static int list[],check[];

    static void dfs(int cnt){
        if(cnt==m){
            for(int i=0;i<m;i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            if(check[i]==1){
                continue;
            }
            check[i]=1;
            list[cnt]=i;
            dfs(cnt+1);
            check[i]=0;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        list = new int[9];
        check = new int[9];
        dfs(0);
    }
}

