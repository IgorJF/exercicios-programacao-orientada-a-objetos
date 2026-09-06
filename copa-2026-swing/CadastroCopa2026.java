import java.util.ArrayList;
import java.util.Collections;

public class CadastroCopa2026{
	private ArrayList<SelecaoNacional> selecoes;
	
	 public CadastroCopa2026() {
        selecoes = new ArrayList<>();
    }

	public void adicionarSelecao(SelecaoNacional selecao) throws NumeroDeTitulosNegativoException{
		if (selecao.getTitulos() < 0) {
			throw new NumeroDeTitulosNegativoException("O numero de titulos nao pode ser menor que zero.");
		}
		selecoes.add(selecao);
		Collections.sort(selecoes);
	}

	public SelecaoNacional pesquisarSelecao(String nome) {
		for(SelecaoNacional s : selecoes){
			if (s.getNome().equalsIgnoreCase(nome)) {
				return s;
			}
		}
		return null;		
    }

	public ArrayList<SelecaoNacional> listarSelecoes() {
        return selecoes;
    }

}