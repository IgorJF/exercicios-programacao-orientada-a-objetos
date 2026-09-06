import java.util.ArrayList;

abstract class Atendimento{
    private String nomePaciente;
    private String nomeResponsavel;
    
    public Atendimento(String nomePaciente, String nomeResponsavel){
        this.nomePaciente = nomePaciente;
        this.nomeResponsavel = nomeResponsavel;
    }
    
    public abstract int tempoConsulta();
    
    public void exibirAtendimento(){
        System.out.print(nomePaciente + " - " + nomeResponsavel + " - " + tempoConsulta());
    }
}

class Consulta extends Atendimento{
    private int numSintomas;
    
    public Consulta(String nomePaciente, String nomeResponsavel, int numSintomas){
        super(nomePaciente, nomeResponsavel);
        this.numSintomas = numSintomas;
    }
    
    @Override
    public int tempoConsulta(){
        return 30 + (numSintomas*5);
    }
    
    @Override
    public void exibirAtendimento(){
       super.exibirAtendimento();
       System.out.println(" - " + numSintomas);
    }
}

class Exame extends Atendimento{
    private int tempoExame;
    
    public Exame(String nomePaciente, String nomeResponsavel, int tempoExame){
        super(nomePaciente, nomeResponsavel);
        this.tempoExame = tempoExame;
    }
    
    @Override
    public int tempoConsulta(){
        return 15 + tempoExame;
    }
    
    @Override
    public void exibirAtendimento(){
       super.exibirAtendimento();
       System.out.println(" - " + tempoExame);
    }
}

public class Exercicio17AtendimentosMedicos{
    public static void main(String[] args){
        ArrayList<Atendimento> lista = new ArrayList<>();
        
        lista.add(new Consulta("A", "B", 4));
        lista.add(new Exame("I", "J", 120));
        
        for(Atendimento a : lista){
            a.exibirAtendimento();
        }
    }
}