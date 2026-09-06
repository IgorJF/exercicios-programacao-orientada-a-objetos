import java.util.List;
import java.util.ArrayList;

interface Seguro{
    double calcularSeguro();
}

class Veiculo implements Seguro{
    protected String placa;
    protected int carga;
    
    public Veiculo(String placa, int carga){
        this.placa = placa;
        this.carga = carga;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public double calculoFrete(double distancia, double valor){
        return distancia * valor;
    }
    
    public double calcularSeguro(){
        return carga * 10;
    }
}

class Caminhao extends Veiculo{
    private int eixos;
    
    public Caminhao(String placa, int carga, int eixos){
        super(placa, carga);
        this.eixos = eixos;
    }
    
    @Override
    public double calculoFrete(double distancia, double valor){
        return distancia * valor + (eixos * 10);
    }
}

class Van extends Veiculo{
    private int volume;
    
    public Van(String placa, int carga, int volume){
        super(placa, carga);
        this.volume = volume;
    }
}

public class Exercicio16VeiculosFreteSeguro{
    public static void main(String[] args){
        List<Veiculo> lista = new ArrayList<>();
        Veiculo v1 = new Caminhao("DANIEL", 10000, 20);
        Veiculo v2 = new Caminhao("LEONARDO", 20000, 5);
        Veiculo v3 = new Van("PEDRO", 15000, 1000);
        Veiculo v4 = new Van("GUILHERME", 8000, 30);
        
        lista.add(v1);
        lista.add(v2);
        lista.add(v3);
        lista.add(v4);
        
        for(Veiculo v : lista){
            System.out.println("Placa: " + v.getPlaca());
            System.out.println("Custo Frte 100km: " + v.calculoFrete(100, 20));
            System.out.println("Seguro: " + v.calcularSeguro());
            System.out.println("-------------------------");
        }
        
        
    }
}