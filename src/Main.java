import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long num = in.nextInt();
        long count=0;

        while(true){
            if(num%5==0){
                System.out.println(num/5+count);
                break;
            }
            else if(num<=0){
                System.out.println("-1");
                break;
            }
            num = num-3;
            count++;
        }

    }
}