package javaprograme;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class TwoInstanceTwoStatic04 {
    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;
    public static void main(String[] args) {
        TwoInstanceTwoStatic04 obj = new TwoInstanceTwoStatic04();
        obj.myMethod();
        myMethod1();
    }
    public void myMethod(){
        //javaprograme.InstanceVariables obj = new javaprograme.InstanceVariables();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void myMethod1(){
        TwoInstanceTwoStatic04 obj1 = new TwoInstanceTwoStatic04();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(c);
        System.out.println(d);
    }
}

