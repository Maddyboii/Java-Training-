public class firstlast {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,7,8};
        int r = a.length - 1;
        int l = 0;
        while(r>l){
            System.out.println(a[l]*a[r]);
            r--;
            l++;

        }
    }
}
