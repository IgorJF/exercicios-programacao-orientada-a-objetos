import java.util.ArrayList;

class Funcionario{
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public double calcularSalario(){
        return salario;
    }
    
    @Override
    public String toString(){
        return nome + " - " + calcularSalario();
    }
}

class Gerente extends Funcionario{
    private double bonus;
    
    public Gerente(String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus;
    }
    
    @Override
    public double calcularSalario(){
        return getSalario() + bonus;
    }
}

public class Exercicio05FolhaPagamentoHeranca{
    public static void main(String[] args){
        ArrayList<Funcionario> lista = new ArrayList<>();
        lista.add(new Funcionario("A", 1200));
        lista.add(new Gerente("B", 3000, 200));
        
        double soma = 0;
        
        for(Funcionario f : lista){
            System.out.println(f);
            soma = soma + f.calcularSalario();
        }
        
        System.out.println("Total: " + soma);
    }
}