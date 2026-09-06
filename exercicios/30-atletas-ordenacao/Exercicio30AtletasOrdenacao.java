import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Atleta implements Comparable<Atleta>{//tem que implementar a interface Comparable
    private String nome;
    private int pontuacao;
    
    public Atleta(String nome, int pontuacao){
        this.nome = nome;
        this.pontuacao = pontuacao;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getPontuacao(){
        return pontuacao;
    }
    
    @Override
    public int compareTo(Atleta a){
        return this.nome.compareTo(a.nome);
    }
}

class ComparaPorPontuacao implements Comparator<Atleta>{
    @Override
    public int compare(Atleta a, Atleta b){
        return Integer.compare(a.getPontuacao(), b.getPontuacao());
    }
}

public class Exercicio30AtletasOrdenacao{
    public static void main(String[] args){
        ArrayList<Atleta> lista = new ArrayList<>();
        
        lista.add(new Atleta("H", 30));
        lista.add(new Atleta("B", 10));
        lista.add(new Atleta("J", 60));
        lista.add(new Atleta("E", 7));
        
        for(Atleta a : lista){
            System.out.println(a.getNome() + " - " + a.getPontuacao());
        }
        
        System.out.println("----------------");
        
        Collections.sort(lista);
        for(Atleta a : lista){
            System.out.println(a.getNome() + " - " + a.getPontuacao());
        }
        
        System.out.println("----------------");
        
        lista.sort(new ComparaPorPontuacao());
        for(Atleta a : lista){
            System.out.println(a.getNome() + " - " + a.getPontuacao());
        }
    }
}