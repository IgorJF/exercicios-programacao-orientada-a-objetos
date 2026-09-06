import java.util.Collection;

public class Selecao implements Comparable<Selecao>{
	private String nome;
	private int qtdTitulo;
	private String tecnico;
	
	public Selecao(String nome, int qtdTitulo, String tecnico){
		this.nome = nome;
		this.qtdTitulo = qtdTitulo;
		this.tecnico = tecnico;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	
	public void setTitulos(int qtdTitulo){
		this.qtdTitulo = qtdTitulo;
	}
	public int getTitulos(){
		return qtdTitulo;
	}
	
	public void setTecnico(String tecnico){
		this.tecnico = tecnico;
	}
	public String getTecnico(){
		return tecnico;
	}
	
	@Override
    public int compareTo(Selecao s) {
        return Integer.compare(s.getTitulos(), this.getTitulos());
    }	
}