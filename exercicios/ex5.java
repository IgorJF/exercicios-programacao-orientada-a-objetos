import java.util.ArrayList;
import java.util.List;

abstract class Veiculo{
    protected String marca;
    protected String modelo;
    protected int ano;
    
    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public abstract void exibirInformacoes();
}

class Carro extends Veiculo{
    private int potencia;
    
    public Carro(String marca, String modelo, int ano, int potencia){
        super(marca, modelo, ano);
        this.potencia = potencia;
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public int getPotencia(){
        return potencia;
    }
    
    @Override
    public void exibirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Potencia: " + potencia);
    }
}

class Moto extends Veiculo{
     public Moto(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }
    
    @Override
    public void exibirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

public class Main{
    public static void main(String[] args){
        List<Veiculo> Lista = new ArrayList<>();
        
        Veiculo v1 = new Carro("Toyota", "Trueno", 1986, 2000);
        Veiculo v2 = new Moto("Honda", "Titan", 2010);
        
        Lista.add(v1);
        Lista.add(v2);
        
        for(Veiculo v : Lista){
            v.exibirInformacoes();
            System.out.println("------------------------------");
        }
    }
}