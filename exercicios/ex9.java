import java.util.List;
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
    public String toString(){
        return "Nome: " + nome + " | Preco: " + preco;
    }
    
    @Override
    public int compareTo(Produto p){
        return Double.compare(this.preco, p.preco);
    }
}

public class Main{
    public static void main(String[] args){
        List<Produto> lista = new ArrayList<>();
        Produto p1 = new Produto("Mouse", 200);
        Produto p2 = new Produto("Teclado", 350);
        Produto p3 = new Produto("Fone", 75);
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        Collections.sort(lista);
        
        for(Produto p : lista){
            System.out.println(p.toString());
        }
    }
}