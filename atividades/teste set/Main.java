public class Main{
	public static void main(String args[]){
		Objeto v1 = new Objeto();
		Objeto v2 = v1;
		
		Objeto v3 = new Objeto();
		Objeto v4 = new Objeto();
		
		v1.setValor(10);
		System.out.println(v1.getValor());
		System.out.println(v2.getValor());
		
		v3.setValor(20);
		System.out.println(v3.getValor());
		System.out.println(v4.getValor());
	}
}