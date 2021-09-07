package ejercicio4.entidades;

import ejercicio4.interfaces.calculoForma;

public class Circulo extends FormaGeometrica implements calculoForma{
 
    private Double radio;
    private Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public Double calcularArea() {
        Double area;
        area = calculoForma.PI * Math.pow(radio, 2);
        return area;           
    }

    @Override
    public Double calcularPerimetro() {
        double perimetro;
        perimetro = calculoForma.PI * diametro; // o PI directamente porque esta importado
        return perimetro;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando el circulo! ");
    }
    
    
}
