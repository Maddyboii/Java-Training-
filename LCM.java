import java.util.*;

public class LCM {
    public static int lcm(int a,int b){
        int big = Math.max(a,b);
        int small = Math.min(a,b);
        int k = big;
        while (big % small != 0){
            big = big + k;
        }
        return big;
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a[] = {12,45,13,10,18,14,15};
        int result = a[0];
        for(int i = 1;i<7;i++){
            result = lcm(result,a[i]);
        }
        System.out.println("The LCM of the array is :" +result);

    }
}
