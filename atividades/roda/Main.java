public class Main{
	public static void main(String[] args){
		
		Carro c1 = new Carro("Ford", "Fiesta", 2016);
		
		for (int i = 0; i < 4; i++) {
			c1.getRodas()[i].setAro(17);
			c1.getRodas()[i].setTipo("Cromada");
		}
		
		
		
		c1.exibirDados();
	}
}