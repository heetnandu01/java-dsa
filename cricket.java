class players{
    int age;
    String name;
    String team;
}




public class cricket {
    public static void main(String[] args) {
        players obj1 = new players(); // object is created 
        obj1.age = 20;
        obj1.name = "heet";
        obj1.team = "csk";
        System.out.println(obj1.age);
        System.out.println(obj1.name);
        System.out.println(obj1.team);
    }
}
