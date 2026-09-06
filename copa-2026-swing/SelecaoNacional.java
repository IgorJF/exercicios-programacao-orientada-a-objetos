import java.util.Collection;

public class SelecaoNacional implements Comparable<SelecaoNacional>{
	private String nome;
	private int qtdTitulo;
	private String tecnico;
	
	public SelecaoNacional(String nome, int qtdTitulo, String tecnico){
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
	public int compareTo(SelecaoNacional s) {
        return Integer.compare(s.getTitulos(), this.getTitulos());
    }	
}