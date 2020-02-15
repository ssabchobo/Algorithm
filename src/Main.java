import java.util.*;

public class Main{

    public static int Sum(int a){
        int sum = 0;
        while(a>0){
            sum += a%10;
            a /=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int result=0;

        for (int i = 1; i < input; i++) {
            int sum = Sum(i);
            if(i+sum == input){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
