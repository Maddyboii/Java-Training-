import java.util.Scanner;

class Rect {
    int a, c;

    Rect(int l, int b) {
        a = l;
        c = b;
    }

    public void display() {
        System.out.println("The area of the rectangle is: " + (a*c));
    }
}

public class Rectangle {
    public static void main(String[] args) {
        int l,b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the num of rectangles:");
        int n = scanner.nextInt();

        Rect[] r = new Rect[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the length of rectangle " + (i + 1));
            l = scanner.nextInt();

            System.out.println("Enter the breadth of rectangle " + (i + 1));
            b = scanner.nextInt();

            r[i] = new Rect(l, b);
        }

        System.out.println("Area of all rectangles");
        for (int i = 0; i < n; i++) {
            System.out.print("Rectangle " + (i + 1));
            r[i].display(); 
        }

        scanner.close();
    }
}