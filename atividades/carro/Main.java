public class Main{
	public static void main(String args[]){
		Carro c1 = new Carro("Toyota", "Supra MK4");
		Carro c2 = new Carro("Honda", "Civic", "ABC-123");
		
		c1.exibirDetalhes();
		c2.exibirDetalhes();
	}
}