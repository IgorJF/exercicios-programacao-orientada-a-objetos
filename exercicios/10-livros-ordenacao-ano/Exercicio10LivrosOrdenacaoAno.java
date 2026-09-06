import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    @Override
    public String toString(){
        return "Titulo: " + titulo + " | Autor: " + autor + " | Ano de Publicacao: " + anoPublicacao;
    }
    
    @Override
    public int compareTo(Livro l){
        return Integer.compare(this.anoPublicacao, l.anoPublicacao);
    }
}

public class Exercicio10LivrosOrdenacaoAno{
    public static void main(String[] args){
        List<Livro> Lista = new ArrayList<>();
        Livro l1 = new Livro("Sangue", "Legal", 1911);
        Livro l2 = new Livro("Box", "Felita", 2010);
        Livro l3 = new Livro("Feliz", "Triste", 1994);
        
        Lista.add(l1);
        Lista.add(l2);
        Lista.add(l3);
        
        // for(Livro l : Lista){
        //     System.out.println(l.toString());
        // }
        
        Collections.sort(Lista);
        for(Livro l : Lista){
            System.out.println(l.toString());
        }
    }
}