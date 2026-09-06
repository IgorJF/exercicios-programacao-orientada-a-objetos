import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList; 

class Mecanico implements Comparable<Mecanico>{
    private String nome;
    private double nota;
    
    public Mecanico(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }
    
    public String getNome(){
        return nome;
    }
    
    @Override
    public int compareTo(Mecanico m){
        return Double.compare(m.nota, this.nota);
    }
    
    @Override
    public String toString(){
        return nome + " - " + nota;
    }
}

class ComparadorNome implements Comparator<Mecanico>{
    @Override
    public int compare(Mecanico m1, Mecanico m2){
        return m1.getNome().compareToIgnoreCase(m2.getNome());
    }
}

public class Exercicio13MecanicosOrdenacao{
	public static void main(String[] args) {
		ArrayList<Mecanico> lista = new ArrayList<>();
		lista.add(new Mecanico("C", 4.2));
		lista.add(new Mecanico("A", 4));
		lista.add(new Mecanico("B", 4.8));
		lista.add(new Mecanico("E", 3.9));
		lista.add(new Mecanico("D", 4.6));
		
		for(Mecanico m : lista){
		    System.out.println(m);
		}
		
		System.out.println("-----------------------------");
		
		Collections.sort(lista);
		for(Mecanico m : lista){
		    System.out.println(m);
		}
		
		System.out.println("-----------------------------");
		
		Collections.sort(lista, new ComparadorNome());
		for(Mecanico m : lista){
		    System.out.println(m);
		}
	}
}
