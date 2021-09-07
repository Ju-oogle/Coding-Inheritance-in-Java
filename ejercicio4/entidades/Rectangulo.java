package ejercicio4.entidades;

import ejercicio4.interfaces.calculoForma;

public class Rectangulo extends FormaGeometrica implements calculoForma{
    
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public Double calcularArea() {
        double area;
        area = base * altura;
        return area;
    }

    @Override
    public Double calcularPerimetro() {
        double perimetro;
        perimetro = (base + altura) * 2; //this.base + this.altura tb puede ir
        return perimetro;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando el rectangulo!");
    }
    
    
}
