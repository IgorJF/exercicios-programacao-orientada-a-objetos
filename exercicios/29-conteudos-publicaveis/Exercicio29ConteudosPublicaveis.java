import java.util.ArrayList;

interface Publicavel{
    public void publicar();
}

interface Compartilhavel{
    public void compartilhar();
}

class Artigo implements Publicavel{
    private String titulo;
    private String autor;
    
    public Artigo(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    @Override
    public void publicar(){
        System.out.println("Artigo - " + titulo + " - Publicado");
    }
}

class Video implements Compartilhavel{
    private String titulo;
    private int duracao;
    
    public Video(String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }
    
    @Override
    public void compartilhar(){
        System.out.println("Video - " + titulo + " - Compatilhado");
    }
}

class Podcast implements Publicavel, Compartilhavel{
    private String titulo;
    private String apresentador;
    
    public Podcast(String titulo, String apresentador){
        this.titulo = titulo;
        this.apresentador = apresentador;
    }
    
    @Override
    public void publicar(){
         System.out.println("Podcast - " + titulo + " - Publicado");
    }
    
    @Override
    public void compartilhar(){
        System.out.println("Podcast - " + titulo + " - Compatilhado");
    }
}

public class Exercicio29ConteudosPublicaveis{
	public static void main(String[] args) {
	    ArrayList<Publicavel> listaP = new ArrayList<>(); 
	    ArrayList<Compartilhavel> listaC = new ArrayList<>();
	    
	    listaP.add(new Artigo("A", "B"));
	    listaP.add(new Podcast("C", "D"));
	    listaC.add(new Video("J", 100));
	    listaC.add(new Podcast("K", "L"));
	    
	    for(Publicavel p : listaP){
	        p.publicar();
	    }
	    for(Compartilhavel c : listaC){
	        c.compartilhar();
	    }
	    //teve que ser um arraylist de cada tipo e um for each de cada tipo para conseguir
	    //exibir as informacoes especificas de cada
	    //o unico jeito de fazer apenas com um array e foreach seria com um arralista de Object usando instaceof
	}
}
