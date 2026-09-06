class Musica{
    private String titulo;
    private int duracao;
    
    public Musica(String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }
    
    public int getDuracao(){
        return duracao;
    }
}

class Playlist{
    private Musica[] musicas; //cria o vetor de musicas que aponta para null no momento, ele esta pronto para receber um 
    //vetor de musicas, mas aponta para null inicialmente
    private int contador = 0;
    
    public Playlist(int capacidade){
    //por mais que eu nao tenha a variavel, o enunciado diz para inicializar uma playlist, com a capacidade de musicas
        this.musicas = new Musica[capacidade]; //aqui ele transforma o vetor musicas da classe em um vetor de Musicas 
        //com o parametro capacidade, ou seja faz musicas apontar para um vetor de Musica com o tamanho de capacidade
    }
    
    public int getContador(){
        return contador;
    }
    
    public void adicionarMusica(Musica m){
        if(contador < musicas.length){ //nao deixa contador ultrapassar o tamanho do vetor, .length vai retornar o tamanho
        //do vetor de musicas
            musicas[contador] = m; //na posicao atual de contador (inicia em 0), recebe m(musica passada)
            contador++; //aumenta o contador para o proximo indice
        }
    }
    
    public int calcularTempo(){
        int s = 0;
        for(int i = 0;i < contador;i++){//ate contador, pois contador tem o numero de musicas adicionadas na playlist
            s = s + musicas[i].getDuracao();
        }
        return s;
    }
}

public class Main{
	public static void main(String[] args) {
	    Musica m1 = new Musica("A", 130);
	    Musica m2 = new Musica("B", 250);
	    
	    Playlist p1 = new Playlist(5);
	    
	    p1.adicionarMusica(m1);
	    p1.adicionarMusica(m2);
	    
	    System.out.println(p1.getContador());
	    System.out.println(p1.calcularTempo());
	    
	}
}
