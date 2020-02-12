import java.util.*;

public class Main{
    static int n,m;
    static int[] result = new int[9];
    static boolean[] visit = new boolean[9];

    public static void loop(int level){
        if(level == m ){
            for (int i = 0; i < m; i++) {
                System.out.print(result[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            result[level] = i+1;
            if(visit[i+1])continue;
            visit[i+1] = true;
            loop(level+1);
            visit[i+1] = false;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        loop(0);
    }
}