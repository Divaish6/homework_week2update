package homework_week2_divyesh;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Prog4_InstanceStatic {
    int a = 70;
    String carName = "Lexus";
    static int b =80;
    static int number = 300;

    public static void main(String[] args) {
        Prog4_InstanceStatic obj = new Prog4_InstanceStatic();
        obj.Apple();
        Iphone();
    }
    public void Apple() {

        System.out.println(a);
        System.out.println(carName);
    }
        public static void Iphone(){
        System.out.println(b);
        System.out.println(number);
    }
}
