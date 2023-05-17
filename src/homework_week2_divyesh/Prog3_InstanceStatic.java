package homework_week2_divyesh;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Prog3_InstanceStatic {
    String name = "Macbook";
    static int number = 200;

    public static void main(String[] args) {
        Prog3_InstanceStatic obj = new Prog3_InstanceStatic();
       obj.cricket();
       Ball();
    }
    public void cricket () {

        System.out.println(name);
    }

        public static void Ball(){
        System.out.println(number);

    }

    }
