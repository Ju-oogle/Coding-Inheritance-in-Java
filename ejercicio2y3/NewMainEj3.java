package ejercicio2y3;

import ejercicio2y3.entidades.Electrodomestico;
import ejercicio2y3.entidades.Lavadora;
import ejercicio2y3.entidades.Televisor;
import ejercicio2y3.enumeraciones.Colores;
import ejercicio2y3.enumeraciones.ConsumoEnergetico;
import java.util.ArrayList;

public class NewMainEj3 {

    public static void main(String[] args) {
        double ventaTotal = 0, ventaTVs = 0, ventaWMs = 0;

        ArrayList<Electrodomestico> electrodomesticosList = new ArrayList<>();

        Lavadora wm1 = new Lavadora(8, 50000d, Colores.NEGRO, 50, ConsumoEnergetico.A);
        Lavadora wm2 = new Lavadora(6, 85000d, Colores.GRIS, 85, ConsumoEnergetico.B);
        Lavadora wm3 = new Lavadora(10, 95000d, Colores.BLANCO, 80, ConsumoEnergetico.D);

        Televisor tv1 = new Televisor(75, true, 250000d, Colores.NEGRO, 12d, ConsumoEnergetico.A);
        Televisor tv2 = new Televisor(32, false, 37000d, Colores.NEGRO, 8d, ConsumoEnergetico.B);
        Televisor tv3 = new Televisor(50, true, 150000d, Colores.GRIS, 12d, ConsumoEnergetico.A);

        electrodomesticosList.add(wm1);
        electrodomesticosList.add(wm2);
        electrodomesticosList.add(wm3);
        electrodomesticosList.add(tv1);
        electrodomesticosList.add(tv2);
        electrodomesticosList.add(tv3);

        for (Electrodomestico auxElectrodomestico : electrodomesticosList) {
            auxElectrodomestico.precioFinal();
            System.out.println(auxElectrodomestico);
            ventaTotal = auxElectrodomestico.getPrecio();

            if (auxElectrodomestico instanceof Lavadora) {
                ventaWMs = auxElectrodomestico.getPrecio();
            } else if (auxElectrodomestico instanceof Televisor) {
                ventaTVs = auxElectrodomestico.getPrecio();
            }
        }
        
        System.out.println("La venta de electrodomésticos asciende a un total de: $"+ ventaTotal);
        System.out.println("La venta de televisores fue por un total de: $"+ ventaTVs);
        System.out.println("La venta de lavadoras fue por un total de: $"+ ventaWMs);
    }
}
