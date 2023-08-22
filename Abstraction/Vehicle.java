package OOPs.Abstraction;

abstract class Vehicle {

    abstract void start();
}

class car extends Vehicle {

    void start() {
        System.out.println("this is car");
    }
}

class bike extends Vehicle {

    void start() {
        System.out.println("this is bike");
    }

    public static void main(String[] args) {
        car c = new car();
        bike b = new bike();
        c.start();
        b.start();
    }
}
