public class Prime {
    public static void main(String[] args){
        int d;
        boolean f;

        for(int i = 222;i <= 999;i++){
            f = true;
            int temp = i;
            while(temp != 0){
                d = temp%10;
                if (d != 7 && d != 5 && d != 3 && d != 2){
                    f = false;
                    break;
                }
                
                temp = temp/10;


            }
            if (f){
                System.out.println(i);
            }

        }
    }
}
