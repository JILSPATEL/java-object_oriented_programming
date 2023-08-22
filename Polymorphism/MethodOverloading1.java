package OOPs.Polymorphism;

/*method overloading
    -same name
    -same class
    -different args
*/
public class MethodOverloading1 {
    
    void show(String b, int a) {
        System.out.println("String Int");
    }
    
    void show(int a) {
        System.out.println("Integer");
    }
    
    void show(StringBuffer a) {
        System.out.println("String Buffer");
    }
    
    void show(int a, float b) {
        System.out.println("Int Float");
    }
    
    void show(float a, int b) {
        System.out.println("Float Int");
    }
    
    void show(int... a) {
        System.out.println("variable argyument");
    }
    
    public static void main(String[] args) {
        MethodOverloading1 p1 = new MethodOverloading1();
        p1.show("abc", 10);
        p1.show(10);
        p1.show(new StringBuffer("abc"));
        p1.show(10, 10.5f);
        p1.show(10.5f, 10);
        p1.show(10, 20, 30, 40, 50);
    }
}
