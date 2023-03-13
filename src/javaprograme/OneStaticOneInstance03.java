package javaprograme;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class OneStaticOneInstance03 {
    int a =10;
    static int b = 20;
    public static void main(String[] args) {
        OneStaticOneInstance03 obj = new OneStaticOneInstance03();
        obj.myMethod();
        myMethod1();
    }
    public void myMethod() {
        System.out.println(a);
    }
    public static void myMethod1(){
            System.out.println(b);
    }

}
