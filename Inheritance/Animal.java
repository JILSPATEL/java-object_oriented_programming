package OOPs.Inheritance;

//Single Level Inheritance
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class dog extends Animal {

    void name() {
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        dog d = new dog();
        d.name();
        d.eat();
    }
}
