package homework_week2_divyesh;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class Prog2_Static {
    static  int d = 10;
    static int number = 20;

    public static void main(String[] args) {
        Book();
    }
    public  static void Book() {
        System.out.println(d);
        System.out.println(number);
    }
}
