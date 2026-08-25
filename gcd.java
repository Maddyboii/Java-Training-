public class gcd {
    public static int gcd(int a, int b){
        int big = Math.max(a,b);
        int min = Math.min(a,b);
        while(big%min != 0){
            int rem = big%min;
            big = min;
            min = rem;
        }
        return min;
    }
    
    public static void main(String[] args){
        int a[] = {4,8,14,12};
        int result = a[0];
        for(int i=1;i<a.length;i++){
            result = gcd(result,a[i]);
        }
        System.out.println("GCD of the array is: " + result);
    }
}