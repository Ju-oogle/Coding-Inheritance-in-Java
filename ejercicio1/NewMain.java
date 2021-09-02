package ejercicio1;

import ejercicio1.entidades.Animal;
import ejercicio1.entidades.Perro;
import ejercicio1.entidades.Gato;
import ejercicio1.entidades.Caballo;

public class NewMain {

    public static void main(String[] args) {

        Animal perro = new Perro("Mamba", "Eukanuba", 3, "Labrador");
        perro.alimentarse();
        System.out.println("----");
        System.out.println("");
        Animal perro1 = new Perro("Nina", "DogChow", 4, "Puro Perro");
        perro1.alimentarse();
        System.out.println("----");
        System.out.println("");
        Animal gato = new Gato("Toribio", "Eukanuba", 9, "Russian Blue");
        gato.alimentarse();
        System.out.println("----");
        System.out.println("");
        Animal caballo = new Caballo("Nofo", "alfalfa", 6, "Pura sangre inglés");
        caballo.alimentarse();
    }

}
