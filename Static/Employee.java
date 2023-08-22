package OOPs.Static;

/*
static use in inner class,variable,method,class variable
 */
class Employee {

    int empId;
    String name;
    static String company = "xyz";

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void display() {
        System.out.println(empId + " " + name + " " + company);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "jils");
        Employee e2 = new Employee(102, "john");
        e1.display();
        e2.display();
    }
}
