public class prime2 {
    public static int sod(int i){
        int f = 0;
        while(i>0){
        f = f + i%10;
        i = i/10;
        }
        return f;
    }
    public static boolean prime(int d){
        if (d == 1){
            return true;
        }
        for( int j = 2;j<d;j++){
            if (d%j == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        for (int i = 100;i<1000;i++){
            int s = sod(i);
            boolean g = prime(s);
            if (g && prime(i)){
                System.out.println(i);
            }
        }
    }
}
