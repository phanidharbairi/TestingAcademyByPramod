package OOPs.Abstraction;

public class Lab006 {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan50k();
        c.loan25k(); // Only Child method and constructor  is visible and Father is hidden.
    }
}

abstract class Father {
    abstract void loan50k();

    void loan25k() {
        System.out.println("Paid 25k.");
    }
}

class Child extends Father {

    @Override
    void loan50k() {
        System.out.println("Child will pay the loan 50k");
    }
}