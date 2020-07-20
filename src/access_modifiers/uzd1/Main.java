package access_modifiers.uzd1;

import access_modifiers.uzd1.pack1.A;
import access_modifiers.uzd1.pack2.C;
import access_modifiers.uzd1.pack2.D;

public class Main {
    public static void main(String[] args) {
        A.aMethod();
        System.out.println("_______________________");
        C.cMethod();
        System.out.println("_______________________");
        D.dMethod();
        System.out.println("________________________");

    }
}
/*Sukurkite klasę A viename pakete ir klases B , C ir D kitame pakete. Klasėje B yra metodai x ,
y , w ir z . Metodą x turime galėti iškviesti tik toje pačioje klasėje. Metodą y turime galėti
iškviesti tame pačiame pakete esančiose klasėse. Metodą w turime galėti iškviesti klasę B
paveldeinčiose klasėse. Metodą z turime galėti iškviesti ir kituose paketuose esančiose klasėse.
Iškvieskite aprašytus metodus visur, kur juos galima iškviesti.*/