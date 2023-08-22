package OOPs.Inheritance;

//Multilevel Inheritance

class Inheritance2 {
    void parent(){
        System.out.println("Parent Class");
    }
}
class child extends Inheritance2{
    void child1(){
        System.out.println("Child Class");
    }
}
class grandChild extends child{
    void gChild(){
        System.out.println("Grand Child");
    }
    public static void main(String[] args) {
        grandChild i1=new grandChild();
        i1.parent();
        i1.child1();
        i1.gChild();
    }
}
