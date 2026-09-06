public class Carro{
	private String marca;
	private String modelo;
	private int ano;
	private Roda[] rodas;
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	public String getMarca(){
		return marca;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public String getModelo(){
		return modelo;
	}
	public void setAno(int ano){
		this.ano = ano;
	}
	public int getAno(){
		return ano;
	}
	public void setRodas(Roda[] rodas){
		this.rodas = rodas;
	}
	public Roda[] getRodas(){
		return rodas;
	}
	
	public Carro(String marca, String modelo, int ano){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.rodas = new Roda[4];

		for (int i = 0; i < 4; i++) {
			rodas[i] = new Roda(); 
		}
	}
	
	public void exibirDados(){
		System.out.println("Marca: " + marca + "Modelo: " + modelo + "Ano: " + ano);
		for(int i = 0; i < rodas.length;i++){
			System.out.println("Roda " + i + "Aro: " + rodas[i].getAro() + "Tipo: " + rodas[i].getTipo());
		}
	}
}