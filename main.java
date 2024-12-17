 class Student {
    int rollno;
    String name;
}

public class main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.rollno = 24;
        obj1.name = "rohan";
        System.out.println(obj1.rollno);
        System.out.println(obj1.name);


        Student obj2 = new Student();
        obj2.rollno = 31;
        obj2.name = "drexel";
        System.out.println(obj2.rollno);
        System.out.println(obj2.name);
    }
}
    
