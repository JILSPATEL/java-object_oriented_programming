package OOPs.Inheritance;

//Hierarchical Inheritance
class Inheritance3 {

    void parent() {
        System.out.println("Parent Class");
    }
}

class child1 extends Inheritance2 {

    void child11() {
        System.out.println("Child Class one");
    }
}

class child2 extends Inheritance2 {

    void child21() {
        System.out.println("Child Class two");
    }

    public static void main(String[] args) {
        child1 c1 = new child1();
        child2 c2 = new child2();
        System.out.println("-----------------------------------");
        c1.parent();
        c1.child11();
        System.out.println("-----------------------------------");
        c2.parent();
        c2.child21();
    }
}
