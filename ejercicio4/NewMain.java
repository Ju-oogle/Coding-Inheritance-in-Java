/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.entidades.Circulo;
import ejercicio4.entidades.Rectangulo;

public class NewMain {

    public static void main(String[] args) {

        System.out.println("--- Rectangulo ---");
        Rectangulo rect1 = new Rectangulo(10.0, 15.0);
        System.out.println("El área del rectangulo es " + rect1.calcularArea());
        System.out.println("El perímetro del rectangulo es " + rect1.calcularPerimetro());
        rect1.dibujar();
        System.out.println("");
        System.out.println("--- Círculo ---");
        Circulo circ1 = new Circulo(10.0, 15.0);
        System.out.println("El área del círculo es " + circ1.calcularArea());
        System.out.println("El perímetro del círculo es " + circ1.calcularPerimetro());
        circ1.dibujar();

    }

}
