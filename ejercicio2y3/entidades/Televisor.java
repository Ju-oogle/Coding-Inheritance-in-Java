package ejercicio2y3.entidades;

import ejercicio2y3.enumeraciones.Colores;
import ejercicio2y3.enumeraciones.ConsumoEnergetico;
import java.util.Scanner;

public class Televisor extends Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //resolución (en pulgadas) y sintonizador TDT (booleano)
    private int resolucion;
    private Boolean sintonizadorTDT;

    public Televisor() {
        super();
    }

    public Televisor(int resolucion, Boolean sintonizadorTDT, double precio, Colores color, double peso, ConsumoEnergetico consumoEnergetico) {
        super(precio, color, peso, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    /**
     * Método crearTelevisor(): este método llama a crearElectrodomestico() de
     * la clase padre, lo utilizamos para llenar los atributos heredados del
     * padre y después llenamos los atributos del televisor.
     */
    public void crearTelevisor() {
        char option;
        System.out.println("---- TELEVISOR ----");
        super.crearElectrodomestico();
        System.out.println("De cuántas pulgadas es el televisor?");
        this.resolucion = leer.nextInt();
        System.out.println("Tiene sintonizador TDT? Indique: S/N");
        option = leer.next().toUpperCase().charAt(0);

        //switch(option)
        do {
            if (option == 'S') {
                this.sintonizadorTDT = true;
            } else if (option == 'N') {
                this.sintonizadorTDT = false;
            } else {
                System.out.println("Ha ingresado una opción incorrecta. Presione 'S' para indicar SI o 'N para indicar NO'");
                option = leer.next().toUpperCase().charAt(0);
            }

        } while (option != 'S' || option != 'N');

    }

    /**
     * Método precioFinal(): este método será heredado y se le sumará la
     * siguiente funcionalidad. Si el televisor tiene una resolución mayor de 40
     * pulgadas, se incrementará el precio un 30% y si tiene un sintonizador TDT
     * incorporado, aumentará $500. Recuerda que las condiciones que hemos visto
     * en la clase Electrodomestico también deben afectar al precio.
     */
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            System.out.println("El precio del televisor con el concepto: Resolucion incluído es de: ");
            super.setPrecio(super.getPrecio() * 1.30);
        }

        if (this.sintonizadorTDT) {
            System.out.println("l precio del televisor con el concepto sintonizador TDT incluído es de: ");
            super.setPrecio(super.getPrecio() + 500);
        }
    }

    @Override
    public String toString() {
        String sintoniza = "NO cuenta con sintonizador";
        if (this.sintonizadorTDT) {
            sintoniza = "SI cuenta con sintonizador";
        }

        return "Televisor de " + resolucion + "' pulgadas. \n "
                + "Sintonizador TDT: " + sintoniza + "\n"
                + super.toString();
    }

}
