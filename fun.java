class enjoy{
  int food_price;
  String movie_name;
  String place;
}


public class fun {
    public static void main(String[] args) {
        enjoy amaze = new enjoy(); // object created 
        /*
        syntax of creating an object:

        classname objectname = new classname();

        */
        amaze.food_price = 1000;
        amaze.movie_name = "dark knight rises";
        amaze.place = "cinema theatre";
        System.out.println(amaze.food_price);
        System.out.println(amaze.movie_name);
        System.out.println(amaze.place);
    }
}


