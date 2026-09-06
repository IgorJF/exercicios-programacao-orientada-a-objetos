import java.util.ArrayList;
import java.util.Collections;

public class Copa2026{
	private ArrayList<Selecao> selecoes;
	
	 public Copa2026() {
        selecoes = new ArrayList<>();
    }

    public void adicionarSelecao(Selecao selecao) throws NumeroDeTitulosInvalidoException{
		if (selecao.getTitulos() < 0) {
			throw new NumeroDeTitulosInvalidoException("O numero de titulos nao pode ser menor que zero.");
		}
		selecoes.add(selecao);
		Collections.sort(selecoes);
	}

    public Selecao pesquisarSelecao(String nome) {
        for(Selecao s : selecoes){
			if (s.getNome().equalsIgnoreCase(nome)) {
				return s;
			}
		}
		return null;		
    }

    public ArrayList<Selecao> listarSelecoes() {
        return selecoes;
    }

}