public class Retangulo{
	private double altura;
	private double largura;
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	public double getAltura(){
		return altura;
	}
	public void setLargura(double largura){
		this.largura = largura;
	}
	public double getLargura(){
		return largura;
	}
	
	public double calcularArea(){
		return altura*largura;
	}
	
	public Retangulo(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}
	
	public Retangulo(){}

}