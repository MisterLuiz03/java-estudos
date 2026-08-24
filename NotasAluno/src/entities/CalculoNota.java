package entities;

public class CalculoNota {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal(){
            return nota1 + nota2 + nota3;
    }
    
    public double notaRestante(){
        if (notaFinal() < 60.0) {
            return 60.0 - notaFinal();
        }
        return 0.0;
    }


}
