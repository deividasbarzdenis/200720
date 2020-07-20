package access_modifiers.uzd1.pack2;

public class D extends C{
    public static void dMethod(){
        System.out.println("D class method");
        C.cMethod();
    }
}
