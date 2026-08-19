class common {
    static String pm = "Narendra Modi";
    String state;
    String cm;
    String dis;
    int n;

    public void set_dim(String a, int k) {
        dis = a;
        n = k;
    }

    public void display() {
        System.out.println("PM: " + pm);
        System.out.println("CM: " + cm);
        System.out.println("State: " + state);
        System.out.println("District Name: " + dis);
        System.out.println("Population of District: " + n);
    }
}

class Andhra extends common {
    Andhra() {
        state = "Andhra";
        cm = "Chandra Babu Naidu";
    }
}

class Tamilnadu extends common {
    Tamilnadu() {
        state = "TamilNadu";
        cm = "Joseph Vijay";
    }
}

public class Stateclass2 {
    public static void main(String[] args) {
        Andhra a = new Andhra();
        Andhra b = new Andhra();
        Andhra c = new Andhra();
        Tamilnadu t = new Tamilnadu();
        Tamilnadu t1 = new Tamilnadu();

        a.set_dim("Nellore", 40000);
        b.set_dim("Vijayawada", 70000);
        c.set_dim("Amaravati", 80000);

        a.display();
        b.display();
        c.display();

        System.out.println("___________________");

        t.set_dim("Chennai", 800000);
        t1.set_dim("Cuddalore", 200000);

        t.display();
        t1.display();
    }
}