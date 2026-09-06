public class ContaBancaria{
	private int numConta;
	private String nome;
	private double saldo;
	static int contador = 0;
	
	public void setConta(int numConta){
		this.numConta = numConta;
	}
	public int getConta(){
		return numConta;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public double getSaldo(){
		return saldo;
	}
	
	public ContaBancaria(int numConta, String nome, double saldo){
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldo;
		contador++;
	}
	
	public double depositar(double valor){
		saldo = saldo + valor;
		return saldo;
	}
	public double saque(double valor){
		if(valor > saldo){
			return -1;
		}
		else{
			saldo = saldo - valor;
			return saldo;
		}
	}
}