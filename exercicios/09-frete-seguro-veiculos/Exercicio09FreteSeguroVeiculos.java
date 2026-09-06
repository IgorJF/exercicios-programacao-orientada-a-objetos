import java.util.ArrayList;

interface Seguradora{
    double calcularSeguro();
}

abstract class Veiculo implements Seguradora{
    private String placa;
    private int capacidade;
    private double valorFrete;
    
    public Veiculo(String placa, int capacidade, double valorFrete){
        this.placa = placa;
        this.capacidade = capacidade;
        this.valorFrete = valorFrete;
    }
    
    public double getValorFrete(){
        return valorFrete;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public double calcularFrete(double distancia){
        return valorFrete * distancia;
    }
    
    @Override
    public double calcularSeguro(){
        return this.capacidade * 10;
    }
    
    // @Override
    // public String toString(){
    //     return placa + " - " + calcularFrete(double distancia) + " - " + calcularSeguro();
    // }
}

class Caminhao extends Veiculo{
    private int numEixos;
    
    public Caminhao(String placa, int capacidade, double valorFrete, int numEixos){
        super(placa, capacidade, valorFrete);
        this.numEixos = numEixos;
    }
    
    @Override
    public double calcularFrete(double distancia){
        return getValorFrete() * distancia + (numEixos * 50);
    }
}

class Van extends Veiculo{
    private int volume;
    
    public Van(String placa, int capacidade, double valorFrete, int volume){
        super(placa, capacidade, valorFrete);
        this.volume = volume;
    }
}

public class Exercicio09FreteSeguroVeiculos{
    public static void main(String[] args){
        ArrayList<Veiculo> lista = new ArrayList<>();
        
        lista.add(new Caminhao("A", 1000, 3, 40));
        lista.add(new Van("B", 200, 5, 60));
        
        for(Veiculo v : lista){
            System.out.println(v.getPlaca() + " - " + v.calcularFrete(100) + " - " + v.calcularSeguro());
        }
    }
}