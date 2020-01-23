import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println();
        String str = in.nextLine();

        StringTokenizer st = new StringTokenizer(str," ");
        if(st.countTokens()!=num2){
            System.out.println("error");
        }else {
            String[] array = new String[st.countTokens()];
            int i = 0;
            while (st.hasMoreTokens()) {
                array[i++] = st.nextToken();
            }
            for (i = 0; i < num1; i++) {
                System.out.println(array[i]);
            }
        }
    }
}