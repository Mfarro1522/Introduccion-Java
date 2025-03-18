package Ejercicio1_cuadrilatero;

public class cuadrilatero {

    private int lado1;
    private int lado2;

    public cuadrilatero (int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public cuadrilatero (int lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int area() {
        return lado1 * lado2;
    }

    public int perimetro() {
        return 2 * (lado1 + lado2);
    }

}
