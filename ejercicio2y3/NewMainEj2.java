package ejercicio2y3;

import ejercicio2y3.entidades.Lavadora;
import ejercicio2y3.entidades.Televisor;


public class NewMainEj2 {

    public static void main(String[] args) {
        Lavadora wm = new Lavadora();
        Televisor tv = new Televisor();      
        
        wm.crearLavadora();
        wm.precioFinal();
        System.out.println(wm);
        tv.crearTelevisor();
        tv.precioFinal();
        System.out.println(tv);
    }

}
