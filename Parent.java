class Parent {
    void name(int sno, String fname, String lname, String gender) {
        sno = 18;
        fname = "virat";
        lname = "kohli";
        gender = "m";
        System.out.println("Parent name method called");
        System.out.println("sno: " + sno + ", fname: " + fname + ", lname: " + lname + ", gender: " + gender);
    }
}

class Child extends Parent {
    void name(int sno, String fname) {
        sno = 33;
        fname = "hardik";
        System.out.println("Child name method called");
        System.out.println("sno: " + sno + " "+fname +"hardik");
    }

    public static void main(String args[]) { 
        Child c = new Child();
        c.name(7, "Dhoni");
    }
}