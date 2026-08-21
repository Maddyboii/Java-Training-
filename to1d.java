public class to1d {
    public static void main(String[] args){
        int a[][] = {{1,2,3,4},{5,6,7,8},{3,4,6,8},{5,6,7,3}};
        int r = a.length;
        int c = a[0].length;
        int f = 0;
        int h[] = new int[r*c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                h[f] = a[i][j];
                f++;
            }
        }
        for(int i = 0;i<h.length;i++){
            System.out.print(h[i]+" ");
        }

    }
}
