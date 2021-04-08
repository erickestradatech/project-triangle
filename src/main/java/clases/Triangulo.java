package clases;

public class Triangulo {

    private double a;
    private double b;
    private double c;

    public double vf() {

        if (a + b > c && a + c > b && b + c > a) {

            return (a + b + c) / 2;

        } else {

            return 0;

        }

    }

    public String areaTriangulo() {

        if (vf() == 0) {

            return "El triángulo no existe";
        } else {

            double area = Math.sqrt(vf() * (vf() - a) * (vf() - b) * (vf() - c));

            return "El área del triángulo es: " + area;
        }

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

}
