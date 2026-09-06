class Funcionario{
    protected String nome;
    protected double salarioBase;
    
    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double calcularSalario(){
        return salarioBase;
    }
}

class Gerente extends Funcionario{
    private double bonus;
    
    public Gerente(String nome, double salarioBase, double bonus){
        super(nome, salarioBase);
        this.bonus = bonus;
    }
    
    //getter and setter bonus
    
    @Override
    public double calcularSalario(){
        return salarioBase + bonus;
    }
}

public class Exercicio12FolhaPagamentoBasica{
    public static void main(String[] args){
        Funcionario[] f = {new Funcionario("Thiago", 4000), new Gerente("Joao", 5000, 200)};
        double folha = 0;
        for(Funcionario s : f){
            System.out.println(s.getNome() + " - " + s.calcularSalario());
            folha += s.calcularSalario();
        }
        
        System.out.println("Folha: " + folha);
    }
}