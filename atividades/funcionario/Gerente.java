public class Gerente extends Funcionario{
	private double bonus;
	
	public void setBonus(double bonus){
		this.bonus = bonus;
	}
	public double getBonus(){
		return bonus;
	}
	
	public Gerente(String nome, double salario, double bonus) {
        super(nome, salario); //Apenas se a classe for herdada
        this.bonus = bonus;
    }

	public double exibirBonus(){
		return bonus;
	}
}