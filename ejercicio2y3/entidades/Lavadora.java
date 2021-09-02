package ejercicio2y3.entidades;

import ejercicio2y3.enumeraciones.Colores;
import ejercicio2y3.enumeraciones.ConsumoEnergetico;
import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    
    private Integer carga;

    public Lavadora() {
        super();
    }

    public Lavadora(Integer carga, double precio, Colores color, double peso, ConsumoEnergetico consumoEnergetico) {
        super(precio, color, peso, consumoEnergetico);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
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
     * Método crearLavadora (): este método llama a crearElectrodomestico() 
     * de la clase padre, lo utilizamos para llenar los atributos heredados 
     * del padre y después llenamos el atributo propio de la lavadora.
     */
    public void crearLavadora(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("---- LAVADORA ----");
        super.crearElectrodomestico();
        System.out.println("De qué capacidad max de carga lo quiere?");
        this.carga = leer.nextInt();
    }
    
    /**
     * Método precioFinal(): este método será heredado y se le sumará la
     * siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentará 
     * el precio en $500, si la carga es menor o igual, no se incrementará el
     * precio. Este método debe llamar al método padre y añadir el código 
     * necesario. Recuerda que las condiciones que hemos visto en la clase 
     * Electrodoméstico también deben afectar al precio.
     */
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.carga>30){
            System.out.println("Diferencia de precio por lavadora de mayor capacidad.");
            super.setPrecio(super.getPrecio()+500);
        }
    }

    @Override
    public String toString() {
        return "Lavadora con capacidad MÁX de carga: " + carga + "kgs. \n"+
                super.toString();
    }
    
    
    
}
