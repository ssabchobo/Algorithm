import java.util.*;

public class Main{
    static int n,m;
    static int[] result = new int[9];
    static int[] arr;

    public static void loop(int level){
        if(level == m){
            for (int i = 0; i < m; i++) {
                System.out.print(result[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            result[level] = arr[i];
            loop(level+1);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        loop(0);
    }
}