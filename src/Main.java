import java.sql.SQLOutput;
import java.util.*;

public class Main{
    static int n,m;
    static int[] result = new int[9];
    static boolean[] visit = new boolean[9];
    static int[] arr;
    static HashSet<String> set = new HashSet<String>();
    static Iterator it = set.iterator();
    static String[] ans;
    static String str="";

    public static void loop(int level){
        if(level == m){
            for (int i = 0; i < m; i++) {
                str += result[i]+" ";
            }
            set.add(str);
            str = "";
            return;
        }
        for (int i = 0; i < n; i++) {
            result[level] = arr[i];
            if(visit[i])continue;
            visit[i] = true;
            loop(level+1);
            visit[i] = false;
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


        ans = set.toArray(new String[0]);
        Arrays.sort(ans);
        for(String s : ans){
            System.out.println(s);
        }
    }
}