import java.util.ArrayList;

interface Movimentavel{
    void moverPara(double x, double y);
}

interface Operavel{
    void executarOperacao(String nome);
}

class RoboSoldador implements Movimentavel, Operavel{
    public void moverPara(double x, double y){
        System.out.println("Robo soldador movendo-se para " + x + " " + y);
    }
    public void executarOperacao(String nome){
        System.out.println("Robo soldador iniciando operacao " + nome);
    }
}

class RoboTransportador implements Movimentavel{
    public void moverPara(double x, double y){
        System.out.println("Robo transpotador movendo-se para " + x + " " + y);
    }
}

class RoboMontagem implements Operavel{
    public void executarOperacao(String nome){
        System.out.println("Robo montador iniciando operacao " + nome);
    }
}

class Controlador {
    public void controlarMovimento(ArrayList<Movimentavel> lista){
        for(Movimentavel m : lista){
            m.moverPara(6, 10);
        }
    }
    public void controlarOperacoes(ArrayList<Operavel> lista){
        for(Operavel o : lista){
            o.executarOperacao("Montar");
        }
    }
}

public class Exercicio22RobosInterfacesControle
{
	public static void main(String[] args) {
		ArrayList<Movimentavel> listaM = new ArrayList<>();
		ArrayList<Operavel> listaO = new ArrayList<>();
		
        listaM.add(new RoboSoldador());
        listaM.add(new RoboTransportador());
        
        listaO.add(new RoboSoldador());
        listaO.add(new RoboMontagem());
		
		Controlador c = new Controlador();
        c.controlarMovimento(listaM);
        c.controlarOperacoes(listaO);
	}
}
