public class recurmul {
    public static void mul(int n) {
        if (n > 10) {
            return;
        }
        int a = 7;
        System.out.println(a+" x "+n+" = "+(a * n));
        mul(n + 1);
    }
    public static void main(String[] args) {
        mul(1);
    }
}
