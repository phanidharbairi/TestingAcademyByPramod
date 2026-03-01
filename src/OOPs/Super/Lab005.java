package OOPs.Super;

public class Lab005 {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}

class Car extends Vehicle{
    private int maxSpeed = 280;

    Car(){
        super(100);
    }

    @Override
    void display() {
        System.out.println("Override - parent");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
    }
}


class Vehicle{
    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("This is a default constructor");
    }

    Vehicle(int a) {
        System.out.println("Parameterized constructor");
    }

    void message(){
        System.out.println("No message, No argument");
    }

    void display(){
        System.out.println("Parent Constructor");
    }
}