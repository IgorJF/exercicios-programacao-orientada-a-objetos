public class Carro{
	private String marca;
	private String modelo;
	private String placa;
	
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
	public void setPlaca(String placa){
		this.placa = placa;
	}
	public String getPlaca(){
		return placa;
	}
	
	public Carro(String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
		this.placa = "Sem placa";
	}
	
	public Carro(String marca, String modelo, String placa){
		this(marca, modelo);
		this.placa = placa;
	}
	
	public void exibirDetalhes(){
		System.out.println("Marca: " + marca + "|Modelo: " + modelo + "|Placa: " + placa);
	}
}

