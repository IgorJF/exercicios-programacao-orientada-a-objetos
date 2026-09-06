import java.util.ArrayList;
import java.util.Collections;

class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public int compareTo(Produto p){
        return Double.compare(this.preco, p.preco);
    }
    
    @Override
    public String toString(){
        return nome + " - " + preco;
    }
}

public class Main{
    public static void main(String[] args){
        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(new Produto("A", 300));
        lista.add(new Produto("B", 140));
        lista.add(new Produto("C", 200));
        
        for(Produto p : lista){
            System.out.println(p);
        }
        
        System.out.println("------------------");
        
        Collections.sort(lista);
        
        for(Produto p : lista){
            System.out.println(p);
        }
    }
}