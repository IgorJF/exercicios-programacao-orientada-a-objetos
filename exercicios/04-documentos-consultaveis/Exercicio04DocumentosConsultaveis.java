interface Consultavel{
    void abrir();
    void buscar(String palavra);
    int paginas();
}

abstract class Documento{
    private String titulo;
    private String palavraChave;
    private int numPaginas;
    
    public Documento(String titulo, String palavraChave, int numPaginas){
        this.titulo = titulo;
        this.palavraChave = palavraChave;
        this.numPaginas = numPaginas;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    
    public void setPalavra(String palavraChave){
        this.palavraChave = palavraChave;
    }
    public String getPalavra(){
        return palavraChave;
    }
    
    public void setPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }
    public int getPaginas(){
        return numPaginas;
    }
}

class Livro extends Documento implements Consultavel{
    public Livro(String titulo, String palavraChave, int numPaginas){
        super(titulo, palavraChave, numPaginas);
    }
    
    @Override
    public void abrir(){
        System.out.println("Abrindo livro." + getTitulo());
    }
    
    @Override
    public void buscar(String palavra){
        if(palavra.equals(getPalavra())){
            System.out.println("Palavra encontrada");
        }
        else{
            System.out.println("Palavra nao encontrada");
        }
    }
    
    @Override
    public int paginas(){
        return getPaginas();
    }
}

class Revista extends Documento implements Consultavel{
    public Revista(String titulo, String palavraChave, int numPaginas){
        super(titulo, palavraChave, numPaginas);
    }
    
    @Override
    public void abrir(){
        System.out.println("Abrindo revista." + getTitulo());
    }
    
    @Override
    public void buscar(String palavra){
        if(palavra.equals(getPalavra())){
            System.out.println("Palavra encontrada");
        }
        else{
            System.out.println("Palavra nao encontrada");
        }
    }
    
    @Override
    public int paginas(){
        return getPaginas();
    }
}

class Tese extends Documento implements Consultavel{
    public Tese(String titulo, String palavraChave, int numPaginas){
        super(titulo, palavraChave, numPaginas);
    }
    
    @Override
    public void abrir(){
        System.out.println("Abrindo tese." + getTitulo());
    }
    
    @Override
    public void buscar(String palavra){
        if(palavra.equals(getPalavra())){
            System.out.println("Palavra encontrada");
        }
        else{
            System.out.println("Palavra nao encontrada");
        }
    }
    
    @Override
    public int paginas(){
        return getPaginas();
    }
}

public class Exercicio04DocumentosConsultaveis{
    
    public static void colecao(Consultavel[] d){
        for(Consultavel c : d){
            c.abrir();
            c.buscar("Dinheiro");
            System.out.println(c.paginas());
            System.out.println("------------------------------");
        }
    }
    
    public static void main(String[] args){
        Consultavel d1 = new Livro("Linguica", "Dinheiro", 60);
        Consultavel d2 = new Revista("Pascoa", "Samba", 20);
        Consultavel d3 = new Tese("Carros", "Fusca", 100);
        Consultavel d4 = new Livro("Botafogo", "Futebol", 1000);
        Consultavel d5 = new Revista("Rua", "Dinheiro", 80);
        Consultavel d6 = new Tese("Campo", "Noruega", 10);
        Consultavel d7 = new Tese("Isso", "Dinheiro", 90);
        
        Consultavel[] d = {d1, d2, d3, d4, d5, d6, d7};
        
        colecao(d);
    }
}