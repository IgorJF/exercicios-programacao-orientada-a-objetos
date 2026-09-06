class Livro{
    private String titulo;
    private String autor;
    private int ano;
    
    public void setTitulo(String titulo){
        this.titulo = titulo; //this é referenciando a variavel da class, o private String titulo
        //this vai diferenciar a variavel da classe do parametro do metodo
        //por isso o metodo nao retorna nada, apenas atribui o valor do parametro passado a variavel da classe
        //que é chamada pelo this    
    }
    public String getTitulo(){
        return titulo;//aqui nao precisa receber nada como parametro, pois vai apenas mostrar
        //a variavel da classe, nao ira alterala
    }
    
    public void setAutor(String autor){
        this.autor = autor; 
    }
    public String getAutor(){
        return autor;
    }
    
    public void setAno(int ano){
        this.ano = ano; 
    }
    public int getAno(){
        return ano;
    }
    
    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    
    public Livro(String titulo, String autor){
        this(titulo, autor); //chama o construtor da mesma classe, ai tem que usar o this
        this.ano = 0;
        //não pode ser:
        // public Livro(String titulo, String autor, int ano){
        //     this.titulo = titulo;
        //     this.autor = autor;
        //     this.ano = ano;
        // }
        // public Livro(String titulo, String autor){
        //     this(titulo, autor); // ERRO
        //     this.ano = 0;
        // }
        //pois o this(titulo, autor) estaria chamando um construtor de dois parametros
        //e esse construtor nao existe ainda, existe o de tres que foi criado acima
        //caso eu queira o construtor de 3 parametros primeiro eu poderia chamar ele no 
        //segundo construtor de 2 parametros como this(titulo, autor, 0);
    }
    
    public void exibirInformacoes(){
        if(ano == 0){
            System.out.println(titulo + "-" + autor);
        }
        else{
            System.out.println(titulo + "-" + autor + "-" + ano);
        }
    }
    
}

public class Exercicio21LivroConstrutoresSobrecarga {
	public static void main(String[] args) {
		Livro l1 = new Livro("A", "B", 2000);
		Livro l2 = new Livro("C", "D");
		
		l2.setAno(1984);
		
		l1.exibirInformacoes();
		l2.exibirInformacoes();
	}
}
