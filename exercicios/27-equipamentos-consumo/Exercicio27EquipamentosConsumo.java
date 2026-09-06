import java.util.ArrayList;

abstract class Equipamento{
    protected int id;
    protected String localizacao;
    protected double consumo;
    
    public Equipamento(int id, String localizacao, double consumo){
        this.id = id;
        this.localizacao = localizacao;
        this.consumo = consumo;
    }
    
    // @Override
    // public String toString() {
    //     return id + "-" + localizacao + "-" + consumo;
    // }
    
    public abstract double calcularConsumo();
    public abstract void exibirRelatorio();
}

class Sensor extends Equipamento{
    private int numLigados;
    
    public Sensor(int id, String localizacao, double consumo, int numLigados){
        super(id, localizacao, consumo);
        this.numLigados = numLigados;
    }
    
    @Override
    public double calcularConsumo(){
        return consumo * numLigados;
    }
    
    @Override
    public void exibirRelatorio(){
        System.out.println(id + "-" + localizacao + "-" + consumo + "-" + numLigados + "-" + calcularConsumo());
    }
}

class Camera extends Equipamento{
    private double horasLigadas;
    
    public Camera(int id, String localizacao, double consumo, int horasLigadas){
        super(id, localizacao, consumo);
        this.horasLigadas = horasLigadas;
    }
    
    @Override
    public double calcularConsumo(){
        return consumo * horasLigadas;
    }
    
    @Override
    public void exibirRelatorio(){
        System.out.println(id + "-" + localizacao + "-" + consumo + "-" + horasLigadas + "-" + calcularConsumo());
    }
}

public class Exercicio27EquipamentosConsumo{
	public static void main(String[] args) {
	    ArrayList<Equipamento> lista = new ArrayList<>();
	    lista.add(new Sensor(21, "Sala", 200, 4));
	    lista.add(new Camera(22, "Cozinha", 40, 80));
	    
	    for(Equipamento e : lista){
	        e.exibirRelatorio();
	    }
	}
}
