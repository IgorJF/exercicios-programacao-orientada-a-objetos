import java.util.List;
import java.util.ArrayList;

interface Pagamento{
    void realizarPagamento(double valor);
}

class PagamentoCartao implements Pagamento{
    @Override
    public void realizarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + " via cartao.");
    }
}

class PagamentoBoleto implements Pagamento{
    @Override
    public void realizarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + " via boleto.");
    }
}

public class Exercicio08PagamentosPolimorfismo{
    public static void main(String[] args){
        List<Pagamento> Lista = new ArrayList<>();
        
        for(int i = 0;i < 30;i++){
            Lista.add(new PagamentoCartao());
        }
        
        for(int i = 0;i < 30;i++){
            Lista.add(new PagamentoBoleto());
        }
        
        for(Pagamento p : Lista){
            p.realizarPagamento(Math.random() * 1000.00);
            System.out.println("-----");
        }
        
    }
}
