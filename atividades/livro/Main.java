public class Main{
	public static void main(String args[]){
		Livro l1 = new Livro();
		l1.setTitulo("Livro");
		l1.setAutor("Igor");
		l1.setPaginas(800);
		
		Livro l2 = new Livro();
		l2.setTitulo("Livro3");
		l2.setAutor("Igor2");
		l2.setPaginas(600);
		
		l1.exibirDetalhes();
		l2.exibirDetalhes();
		
	}
}