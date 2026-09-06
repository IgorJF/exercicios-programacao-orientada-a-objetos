interface MetodoPagamento{
    boolean autorizar(double valor);
}

class Cartao implements MetodoPagamento{
    public double limite;
    
    public Cartao(double limite){
        this.limite = limite;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    public double getLimite(){
        return limite;
    }
    
    @Override
    public boolean autorizar(double valor){
        if(valor > limite){
            return false;
        }
        else{
            return true;
        }
    }
}

class Pix implements MetodoPagamento{
    public double saldo;
    
    public Pix(double saldo){
        this.saldo = saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    
    @Override
    public boolean autorizar(double valor){
        if(valor > saldo){
            return false;
        }
        else{
            return true;
        }
    }
}

class Boleto implements MetodoPagamento{
    public double minimo;
    
    public Boleto(double minimo){
        this.minimo = minimo;
    }
    
    public void setMinimo(double minimo){
        this.minimo = minimo;
    }
    public double getMinimo(){
        return minimo;
    }
    
    @Override
    public boolean autorizar(double valor){
        if(valor > minimo){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Exercicio03MetodosPagamento{
    
    public static void processarPagamento(MetodoPagamento p, double valor){
        boolean i = p.autorizar(valor);
        if(i){
            System.out.println("Pagamento autorizado");
        }
        else{
            System.out.println("Pagamento bloqueado");
        }
    }
    
    public static void main(String[] args){
        MetodoPagamento c = new Cartao(5000);
        processarPagamento(c, 8000);
        
        MetodoPagamento p = new Pix(5000);
        processarPagamento(p, 2000);
        
        MetodoPagamento b = new Boleto(5000);
        processarPagamento(b, 9000);
    }
}