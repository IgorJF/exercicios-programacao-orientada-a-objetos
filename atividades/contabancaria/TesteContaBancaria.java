public class TesteContaBancaria{
	public static void main (String args[]){
		ContaBancaria[] contas = new ContaBancaria[4];
		contas[0] = new ContaBancaria(1,"V",1000);
		contas[1] = new ContaBancaria(2,"F",10);
		contas[2] = new ContaBancaria(3,"G",900);
		contas[3] = new ContaBancaria(4,"J",5);
		
		for(int i = 0;i < contas.length;i++){
			double saldo = contas[i].saque(10);
			if(saldo == -1){
				System.out.println("Saldo insuficiente");
			}
			System.out.println(saldo);
		}
		
		System.out.println(ContaBancaria.contador);
		
	}
}