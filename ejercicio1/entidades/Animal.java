package ejercicio1.entidades;

import java.util.Scanner;

public class Animal {
//nombre, alimento, edad y raza

protected String nombre;
protected String alimento;
protected Integer edad;
protected String raza;
    
private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
//        System.out.println("Qué alimento consume su mascota? ");
//        alimento = leer.next();
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
     
    public void alimentarse(){
        System.out.println(nombre+" ("+raza+"), se está alimentando con "+alimento+ " buen provecho!");
    }

    @Override
    public String toString() {
        return "DATOS ANIMAL -> {" + "nombre: " + nombre + ", alimento: " 
                + alimento + ", edad: " + edad + ", raza: " + raza + '}';
    }

  
}
