import java.util.*;
public class marksandscores {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students :");
        int d = s.nextInt();
        int marks[] = new int[d];
        String names[] = new String[d];
        for(int i = 0;i<d;i++){
            System.out.println("Enter the name and marks of student "+(i+1));
            names[i] = s.next();
            marks[i] = s.nextInt();

        }
        System.out.println("________________________");
        int c = 1;
        for(int i =0;i<d;i++){
            if (marks[i]>50){
                System.out.println(c+" "+names[i]+"  has scored  "+marks[i]+"marks");
                c++;
            }
        }
    }
}
