package access_modifiers.uzd1.pack2;

public class B {

    private static void x(){
        System.out.println("Method X");
    }
     static void y(){
        System.out.println("Method Y");
    }
    protected static void w(){
        System.out.println("Method W");
    }
    public static void z(){
        System.out.println("Method Z");
        x();
    }
}
/* Klasėje B yra metodai x ,y , w ir z . Metodą z turime galėti iškviesti ir kituose paketuose esančiose
 klasėse. Iškvieskite aprašytus metodus visur, kur juos galima iškviesti.*/