import java.util.ArrayList;

interface ItemVenda{
    double getPreco();
}

interface Descontavel extends ItemVenda{
    double getPrecoComDesconto();
}

class ProdutoFisico implements Descontavel{
    private double preco;
    private double desconto;
    
    public ProdutoFisico(double preco, double desconto){
        this.preco = preco;
        this.desconto = desconto;
    }
    
    @Override
    public double getPreco(){
        return preco;
    }//obrigado a implementar por que Descontavel herda de ItemVenda
    
    @Override
    public double getPrecoComDesconto(){
        return preco - desconto;
    }
}

class ProdutoDigital implements ItemVenda{
    private double preco;
    
    public ProdutoDigital(double preco){
        this.preco = preco;
    }
    
    @Override
    public double getPreco(){
        return preco;
    }
}

class ServicoAssinatura implements ItemVenda{
    private double preco;
    
    public ServicoAssinatura(double preco){
        this.preco = preco;
    }
    
    @Override
    public double getPreco(){
        return preco/12;
    }
}


public class Exercicio28ItensVendaDescontos{
    
    public static double calcularTotal(ArrayList<ItemVenda> lista){
        double total = 0;
        for(ItemVenda i : lista){
            if(i instanceof Descontavel){
                total += ((Descontavel) i).getPrecoComDesconto();
            }
            else{
                total += i.getPreco();
            }
        }
        return total;
    }//criacao de metodo
    
	public static void main(String[] args){
	    ArrayList<ItemVenda> lista = new ArrayList<>();
	    
        lista.add(new ProdutoFisico(1200, 250));
        lista.add(new ProdutoDigital(800));
        lista.add(new ServicoAssinatura(3200));
        
        for(ItemVenda i : lista){
            if(i instanceof ProdutoDigital){
                System.out.println("Produto Digital: " + i.getPreco());
            }
            else if(i instanceof ProdutoFisico){
                System.out.println("Produto Fisico: " + ((Descontavel) i).getPrecoComDesconto());//tratar i como Descontavel, 
                //pois i é itemVenda e nao tem preco com desconto implementado
            }
            else{
                System.out.println("ServicoAssinatura: " + i.getPreco());
            }
        }
        
        System.out.println("Total = " + calcularTotal(lista));
	}
}
