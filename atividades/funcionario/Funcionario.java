public class Funcionario{
	private String nome;
	private double salario;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return salario;
	}
	
	public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

	
	public double exibirContracheque(){
		return salario;
	}
}