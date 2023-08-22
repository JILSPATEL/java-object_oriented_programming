package OOPs.Encapsulation;

class Encapsulation1 {

    private int empid;

    public void setEmpid(int eid) {
        empid = eid;
    }

    public int getEmpid() {
        return empid;
    }
}

class Company {

    public static void main(String[] args) {
        Encapsulation1 e1 = new Encapsulation1();
        e1.setEmpid(101);
        System.out.println("Employee id is:"+e1.getEmpid());
    }
}
