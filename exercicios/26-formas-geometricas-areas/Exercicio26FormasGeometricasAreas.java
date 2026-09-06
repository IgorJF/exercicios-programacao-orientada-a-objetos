import java.util.ArrayList;

interface FormaGeometrica{
    double calcularArea();
    default void imprimir() {
        String nomeDaForma = this.getClass().getSimpleName();
        System.out.println(nomeDaForma);
    }
}

class Quadrado implements FormaGeometrica{
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        return lado*lado;
    }
}

class Triangulo implements FormaGeometrica{
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
}

class Circulo implements FormaGeometrica{
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        return 3.14*raio*raio;
    }
}

class Retangulo implements FormaGeometrica{
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return base*altura;
    }
}

public class Exercicio26FormasGeometricasAreas{
    public static void main(String[] args){
        ArrayList<FormaGeometrica> lista = new ArrayList<>();
        lista.add(new Quadrado(6));
        lista.add(new Triangulo(7, 10));
        lista.add(new Circulo(4));
        lista.add(new Retangulo(5,9));
        
        for(FormaGeometrica f : lista){
            f.imprimir();
            System.out.println("Area: " + f.calcularArea());
        }
        
    }
}