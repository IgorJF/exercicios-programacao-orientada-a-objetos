class Veiculo{
    private String placa;
    private double quilometragem;
    
    public Veiculo(String placa, double quilometragem){
        this.placa = placa;
        this.quilometragem = quilometragem;
    }
    
    public double registarViagem(double distancia){
        return quilometragem = quilometragem + distancia;
    }
}

class Furgao extends Veiculo{
    public Furgao(String placa, double quilometragem){
        super(placa, quilometragem);
    }
    public Furgao(String placa){
        super(placa, 0);
        //this(placa, 0); //da certo tambem, pois faz a sobrecarga do primeiro construtor
    }
}

class Caminhao extends Veiculo{
    private int capacidade;
    
    public Caminhao(String placa, int capacidade){
        super(placa, 0);//por mais que eu nao tenho passado o parametro de quilometragem
        //ele sabe que o 0 eh referente a isso, pois o construtor da classe mae, tem quilometragem    
        this.capacidade = capacidade;
    }
}

public class Exercicio23VeiculosSobrecargaConstrutores{
	public static void main(String[] args) {
	    Veiculo v1 = new Furgao("A");
	    Veiculo v2 = new Furgao("B", 3000);
	    Veiculo v3 = new Caminhao("C", 100);
	    
	    System.out.println(v1.registarViagem(250));
	    System.out.println(v2.registarViagem(530));
	    System.out.println(v3.registarViagem(1000));
	}
}
