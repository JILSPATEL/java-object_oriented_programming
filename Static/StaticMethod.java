package OOPs.Static;

/*
-static methods belongs to class
-static method can call using class name
-static method can access which is in same class
 */
class StaticMethod {

    static void display() {
        System.out.println("call by object");
    }

    static void display1() {
        System.out.println("Call by class from same class");
    }

    public static void main(String[] args) {
        StaticMethod m1 = new StaticMethod();
        m1.display();
        Test.show();
        StaticMethod.display1();
    }
}

class Test {

    static void show() {
        System.out.println("Call by class from different class");
    }
}
