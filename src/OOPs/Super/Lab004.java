package OOPs.Super;

public class Lab004 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.t1();

    }
}

class Father {
    void home(){
        System.out.println("2 BHK");
    }
}

class Son extends Father {
    void t1(){
        super.home();
        System.out.println("Son has 3 BHK");
    }
}