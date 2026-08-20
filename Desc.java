public class Desc {
    public static void main(String[] args){
        int a = 54321;
        int l,p;
        boolean flag = true;
        while((a/10)!=0){
            l = a%10;
            p = (a/10)%10;
            if (p < l){
                flag = false;
                break;
            }
            a = a/10;

            }
        
        if (flag){
            System.out.println("The number is in descending order");
        }
        else {
            System.out.println("The number is not in descending order");
        }
        }
    }

