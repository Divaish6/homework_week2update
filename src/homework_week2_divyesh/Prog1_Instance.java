package homework_week2_divyesh;
/**
 *  1.1 Declare two instance variables.
 *  1.2 Declare one instance method.
 *  1.3 Call both instance variables into the instance method inside the print statement.
 *  1.4 Declare the Main method.
 *  1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Prog1_Instance {
    int d = 20;
    String name = "DIVAISH";

    public static void main(String[] args) {
        Prog1_Instance obj = new Prog1_Instance();
        obj.Name();
    }

    public void Name() {
        System.out.println(d);
        System.out.println(name);
    }

}
