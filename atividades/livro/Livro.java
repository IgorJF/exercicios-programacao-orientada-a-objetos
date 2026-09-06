public class Livro{
	private String titulo;
	private String autor;
	private int numPaginas;
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public String getTitulo(){
		return titulo;
	}
	public void setAutor(String autor){
		this.autor = autor;
	}
	public String getAutor(){
		return autor;
	}
	public void setPaginas(int numPaginas){
		this.numPaginas = numPaginas;
	}
	public int getPaginas(){
		return numPaginas;
	}
	
	public void exibirDetalhes(){
		System.out.println("Titulo: " + titulo + "|Autor: " + autor + "|Paginas: " + numPaginas);
	}
}
