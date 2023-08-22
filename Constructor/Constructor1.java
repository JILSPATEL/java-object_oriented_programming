package OOPs.Constructor;

class Constructor1 {

    String name;
    int emp_id;

    Constructor1(String name, int emp_id) //Parameterized Constructor
    {
        this.name = name;
        this.emp_id = emp_id;
    }

    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1("max", 115);
        Constructor1 c11 = new Constructor1("john", 185);
        System.out.println(c1.name + " " + c1.emp_id);
        System.out.println(c11.name + " " + c11.emp_id);
    }
}
