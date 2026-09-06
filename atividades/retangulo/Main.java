public class Main{
	public static void main(String[] args){
		Retangulo r1 = new Retangulo(10,12);
		Retangulo r2 = new Retangulo();
		
		r2.setAltura(4);
		r2.setLargura(6);
		
		System.out.println("Area 1\n:" + r1.calcularArea());
		System.out.println("Area 2\n:" + r2.calcularArea());
	}
}