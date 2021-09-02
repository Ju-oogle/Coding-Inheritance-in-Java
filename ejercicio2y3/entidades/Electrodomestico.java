package ejercicio2y3.entidades;

import ejercicio2y3.enumeraciones.Colores;
import ejercicio2y3.enumeraciones.ConsumoEnergetico;
import java.util.Scanner;

public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //precio, color, consumo energético (letras entre A y F) y peso.
    protected double precio;
    protected Colores color;  //enum
    protected double peso;
    protected ConsumoEnergetico consumoEnergetico; //enum

    //Constructor vacío
    public Electrodomestico() {

    }

    //Constructor completo
    public Electrodomestico(double precio, Colores color, double peso, ConsumoEnergetico consumoEnergetico) {
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
    }

    //Getters & Setters
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

    public ConsumoEnergetico getConsumo() {
        return consumoEnergetico;
    }

    public void setConsumo(ConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    /**
     * Método comprobarConsumoEnergetico(char letra): comprueba que la letra es
     * correcta, sino es correcta usara la letra F por defecto. Este método se
     * debe invocar al crear el objeto y no será visible.
     *
     * @param char letra
     */
    private void comprobarConsumoEnergetico(char letra) {

        switch (letra) {
            case 'A':
                this.consumoEnergetico = consumoEnergetico.A;
                break;
            case 'B':
                this.consumoEnergetico = consumoEnergetico.B;
                break;
            case 'C':
                this.consumoEnergetico = consumoEnergetico.C;
                break;
            case 'D':
                this.consumoEnergetico = consumoEnergetico.D;
                break;
            case 'E':
                this.consumoEnergetico = consumoEnergetico.E;
                break;
            case 'F':
                this.consumoEnergetico = consumoEnergetico.F;
                break;
            default:
                System.out.println("Ha ingresado una opción no válida se asignará el consumo por defecto -> (F). ");
                this.consumoEnergetico = consumoEnergetico.F;
        }

    }

    /**
     * Método comprobarColor(String color): comprueba que el color es correcto,
     * y si no lo es, usa el color blanco por defecto. Los colores disponibles
     * para los electrodomésticos son blanco, negro, rojo, azul y gris. No
     * importa si el nombre está en mayúsculas o en minúsculas. Este método se
     * invocará al crear el objeto y no será visible.
     *
     * @param String color
     */
    private void comprobarColor(String color) {
        switch (color) {
            case "BLANCO":
                this.color = Colores.BLANCO;
                break;
            case "NEGRO":
                this.color = Colores.NEGRO;
                break;
            case "ROJO":
                this.color = Colores.ROJO;
                break;
            case "GRIS":
                this.color = Colores.GRIS;
                break;
            case "AZUL":
                this.color = Colores.AZUL;
                break;
            default:
                System.out.println("Ingreso una opcion no valida se asignara el color por defecto");
                this.color = Colores.BLANCO;
        }

    }

    /**
     * Metodo crearElectrodomestico(): le pide la información al usuario y llena
     * el electrodoméstico, también llama los métodos para comprobar el color y
     * el consumo. Al precio se le da un valor base de $1000.
     */
    public void crearElectrodomestico() {
        this.precio = 1000;
        System.out.println("Ingrese el color del electrodoméstico: ");
        comprobarColor(leer.next().toUpperCase());
        System.out.println("Indique el tipo consumo energético: (Opciones disponibles: 'A','B','C','D' ó 'F' ");
        comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0));
        System.out.println("Qué peso debe tener?");
        this.peso = leer.nextDouble();
    }

    /**
     * Método precioFinal(): según el consumo energético y su tamaño, aumentará
     * el valor del precio.
     */
    public void precioFinal() {
        if (this.peso > 80) {
            this.precio += 1000;
        } else if (this.peso >= 50) {
            this.precio += 800;
        } else if (this.peso >= 20) {
            this.precio += 500;
        } else {
            this.precio += 100;
        }

        switch (this.consumoEnergetico) {
            case A:
                this.precio += 1000;
                break;
            case B:
                this.precio += 800;
                break;
            case C:
                this.precio += 600;
                break;
            case D:
                this.precio += 500;
                break;
            case E:
                this.precio += 300;
                break;
            case F:
                this.precio += 100;
                break;
        }
    }

    @Override
    public String toString() {
        return "CARACTERÍSTICAS -> Color: " + color + " Peso: " + peso + "kgs." + "\nConsumo de Energía: " + consumoEnergetico + "\nPrecio $ " + precio + ".00";
    }

}
