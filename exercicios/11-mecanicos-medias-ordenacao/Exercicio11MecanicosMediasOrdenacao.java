import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList; 
import java.util.Scanner;

class Mecanico implements Comparable<Mecanico>{
    private String nome;
    private double[] notas;
    
    public Mecanico(String nome, int qtdNotas){
        this.nome = nome;
        this.notas = new double[qtdNotas];
    }
    
    public String getNome(){
        return nome;
    }
    
    public void registrarNotas(Scanner s){
        for(int i = 0; i < notas.length; i++){
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = Double.parseDouble(s.nextLine());
        }
    }
    
    public double calcularMedia(){
        double soma = 0;
        for(double n : notas){
            soma += n;
        }
        return soma/notas.length;
    }
    
    @Override
    public int compareTo(Mecanico m){
        return Double.compare(m.calcularMedia(), this.calcularMedia());
    }
    
    @Override
    public String toString(){
        return nome + " - " + calcularMedia();
    }
}

class ComparadorNome implements Comparator<Mecanico>{
    @Override
    public int compare(Mecanico m1, Mecanico m2){
        return m1.getNome().compareToIgnoreCase(m2.getNome());
    }
}

public class Exercicio11MecanicosMediasOrdenacao{
	public static void main(String[] args) {
		ArrayList<Mecanico> lista = new ArrayList<>();
		Scanner s = new Scanner(System.in);

        Mecanico m1 = new Mecanico("Carlos", 3);
        m1.registrarNotas(s);
        
        Mecanico m2 = new Mecanico("Carlos", 3);
        m2.registrarNotas(s);
        
        lista.add(m1);
        lista.add(m2);

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
