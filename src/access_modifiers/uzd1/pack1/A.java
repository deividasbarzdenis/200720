package access_modifiers.uzd1.pack1;

import access_modifiers.uzd1.pack2.B;

public class A extends B{
    public static void aMethod(){
        System.out.println("A class method");
        B.z();
        B.w();

    }
}
