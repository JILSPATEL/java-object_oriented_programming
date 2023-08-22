package OOPs.Polymorphism;

/*
method overriding
    -same name
    -different class
    -same args
    -Inheritance(IS-A)
 */
class MethodOverriding1 {

    void show() {
        System.out.println("parent method");
    }
}

class test2 extends MethodOverriding1 {

    void show() {
        System.out.println("child method");
    }

    public static void main(String[] args) {
        MethodOverriding1 m1 = new MethodOverriding1();
        test2 t2 = new test2();
        t2.show();
        m1.show();
    }
}
