package entities;

public class CalculoArea {

    public double width;
    public double height;

    public double areaCalculo() {
        return width * height;

    }

    public double perimetroCalculo() {

        double p;
        p = 2 * (width + height);

        return p;

    }

    public double diagonalCalculo() {
        double d;
        d = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return d;

    }

    public String toString() {
        return  String.format("AREA: %.2f", areaCalculo())
                + "\n"
                + String.format("PERIMETRO: %.2f", perimetroCalculo())
                + "\n"
                + String.format("DIAGONAL: %.2f", diagonalCalculo());

    }

}
