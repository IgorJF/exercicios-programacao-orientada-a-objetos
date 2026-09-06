import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Produto{
    private int codigo;
    private String nome;
    private String categoria;
    private double preco;
    private int estoque;
    
    // public Produto(int codigo, String nome, String categoria, double preco, int estoque){
    //     this.codigo = codigo;
    //     this.nome = nome;
    //     this.categoria = categoria;
    //     this.preco = preco;
    //     this.estoque = estoque;
    // }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return categoria;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }
    
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    public int getEstoque(){
        return estoque;
    }
    
    @Override
    public String toString(){
        return "Codigo: " + codigo + " | Nome: " + nome + " | Categoria: " + categoria + " | Preco: " + preco + " | Estoque: " + estoque;
    }
}

class ComparadorNome implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2){
        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }
}

class ComparadorPrecoCrescente implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}

class ComparadorPrecoDescrescente implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2){
        return Double.compare(p2.getPreco(), p1.getPreco());
    }
}

class ComparadorCategoria implements Comparator<Produto>{
    @Override
     public int compare(Produto p1, Produto p2){ 
        int resultadoCategoria = p1.getCategoria().compareToIgnoreCase(p2.getCategoria());
        
        if (resultadoCategoria == 0) {
            return p1.getNome().compareToIgnoreCase(p2.getNome());
        }
        
        return resultadoCategoria;
    }
}

public class Exercicio19CrudProdutosEstoque{
        
    public static void cadastrarProduto(Produto p, ArrayList<Produto> produtos){
        for(Produto pr : produtos){
            if(p.getCodigo() == pr.getCodigo()){
                System.out.println("Codigo ja cadastrado");
                return; // Encerra o método imediatamente se achar duplicado
            }
        }
        produtos.add(p);
        System.out.println("Cadastrado com sucesso");
    }
    
    public static void consultarProduto(int codigo, ArrayList<Produto> produtos){
        for(Produto p : produtos){
            if(codigo == p.getCodigo()){
                System.out.println(p);
                return;
            }
        }
        System.out.println("Não encontrado");
    }
    
    public static void atualizarNome(int codigo, ArrayList<Produto> produtos, String nome){
        for(Produto p : produtos){
            if(codigo == p.getCodigo()){
                p.setNome(nome);
                System.out.println("Atualizado com sucesso");
                return;
            }
        }
        System.out.println("Codigo nao encontrado");
    }
    
    public static void atualizarCategoria(int codigo, ArrayList<Produto> produtos, String categoria){
        for(Produto p : produtos){
            if(codigo == p.getCodigo()){
                p.setCategoria(categoria);
                System.out.println("Atualizado com sucesso");
                return;
            }
        }
        System.out.println("Codigo nao encontrado");
    }
    
    public static void atualizarPreco(int codigo, ArrayList<Produto> produtos, double preco){
        for(Produto p : produtos){
            if(codigo == p.getCodigo()){
                p.setPreco(preco);
                System.out.println("Atualizado com sucesso");
                return;
            }
        }
        System.out.println("Codigo nao encontrado");
    }
    
    public static void atualizarEstoque(int codigo, ArrayList<Produto> produtos, int estoque){
        for(Produto p : produtos){
            if(codigo == p.getCodigo()){
                p.setEstoque(estoque);
                System.out.println("Atualizado com sucesso");
                return;
            }
        }
        System.out.println("Codigo nao encontrado");
    }
    
    public static int verificarCodigo(int codigo, ArrayList<Produto> produtos){
        for(Produto p : produtos){
            if(codigo == p.getCodigo()){
                return 1;
            }
        }
        return 0;
    }
    
    public static void removerProduto(int codigo, ArrayList<Produto> produtos){
        Iterator<Produto> it = produtos.iterator();
        while (it.hasNext()){//verifica se ha elemento na frente para saber se para ou continua o loop
            Produto p = it.next();//pula para o proximo elemento, e guarda o elemento que foi pulado
            if (p.getCodigo() == codigo) {
                it.remove(); 
                System.out.println("Produto removido.");
            }
        }
    }
    
    public static void listarProdutos(ArrayList<Produto> produtos){
        double total = 0;
        for(Produto p : produtos){
            System.out.println(p);
            total = total + (p.getPreco() * p.getEstoque());            
        }
        System.out.println("Numero de produtos cadastrados: " + produtos.size());
        System.out.println("Total em Estoque: " + total);
    }
    
    public static void produtoMaisCaro(ArrayList<Produto> produtos){
        Iterator<Produto> it = produtos.iterator();
        Produto maisCaro = it.next(); //salva o produto, nao o valor
        while (it.hasNext()){
            Produto p = it.next();
            if (p.getPreco() > maisCaro.getPreco()){
                maisCaro = p;
            }
        }
        System.out.println("Produto mais caro: " + maisCaro.getNome() + " | Preço: R$ " + maisCaro.getPreco());
    }
    
    public static void produtoMaisBarato(ArrayList<Produto> produtos){
        Iterator<Produto> it = produtos.iterator();
        Produto maisBarato = it.next();
        while (it.hasNext()){
            Produto p = it.next();
            if (p.getPreco() < maisBarato.getPreco()){
                maisBarato = p;
            }
        }
        System.out.println("Produto mais barato: " + maisBarato.getNome() + " | Preço: R$ " + maisBarato.getPreco());
    }
    
    public static void mediaDosPrecos(ArrayList<Produto> produtos){
        double soma = 0;
        for(Produto p : produtos){
            soma = soma + p.getPreco();
        }
        System.out.println("Media dos precos: " + soma/produtos.size());
    }
    
    public static void estoqueAbaixoDeCinco(ArrayList<Produto> produtos){
        for(Produto p : produtos){
            if(p.getEstoque() < 5){
                System.out.println(p);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Produto> lista = new ArrayList<>();
        
        int opc = 0;
        
        do{
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Consultar Produto");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Remover Produto");
            System.out.println("5 - Listar Produto");
            System.out.println("0 - Encerrar");
            
            opc = Integer.parseInt(s.nextLine()); 
            
            switch (opc) {
                case 1:
                    Produto p = new Produto();
                    System.out.println("Digite o codigo do produto: ");
                    p.setCodigo(Integer.parseInt(s.nextLine()));
                    System.out.println("Digite o nome do produto: ");
                    p.setNome(s.nextLine());
                    System.out.println("Digite a categoria do produto: ");
                    p.setCategoria(s.nextLine());
                    System.out.println("Digite o preco do produto: ");
                    p.setPreco(Double.parseDouble(s.nextLine()));
                    System.out.println("Digite o estoque do produto: ");
                    p.setEstoque(Integer.parseInt(s.nextLine()));
                    
                    cadastrarProduto(p, lista);
                    
                    break;
                case 2: {
                    System.out.println("Digite o codigo do produto: ");
                    int codigo = Integer.parseInt(s.nextLine());
                    consultarProduto(codigo, lista);
                    break;
                }
                case 3: {
                    System.out.println("Digite o codigo do produto: ");
                    int codigo = Integer.parseInt(s.nextLine());
                    
                    if(verificarCodigo(codigo, lista) == 0){
                        System.out.println("Codigo nao encontrado");
                        break;
                    }
                    
                    int opcAtualizar = 0;
                    
                    do{
                        System.out.println("Digite a opção desejada: ");
                        System.out.println("1 - Atualizar Nome");
                        System.out.println("2 - Atualizar Categora");
                        System.out.println("3 - Atualizar Preco");
                        System.out.println("4 - Atualizar Estoque");
                        System.out.println("0 - Finalizar");
                        opcAtualizar = Integer.parseInt(s.nextLine());
                    
                        switch(opcAtualizar){
                            case 1:
                                System.out.println("Digite o novo nome: ");
                                atualizarNome(codigo, lista, s.nextLine());
                                break;
                            case 2:
                                System.out.println("Digite a nova categoria: ");
                                atualizarCategoria(codigo, lista, s.nextLine());
                                break;
                            case 3:
                                System.out.println("Digite o novo preco: ");
                                atualizarPreco(codigo, lista, Double.parseDouble(s.nextLine()));
                                break;
                            case 4:
                                System.out.println("Digite o novo estoque: ");
                                atualizarEstoque(codigo, lista, Integer.parseInt(s.nextLine()));
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opcao invalida");
                                break;
                        }
                    }while(opcAtualizar != 0);
                    break;
                }
                case 4:
                    System.out.println("Digite o codigo do produto: ");
                    int codigo = Integer.parseInt(s.nextLine());
                    
                    if(verificarCodigo(codigo, lista) == 0){
                        System.out.println("Codigo nao encontrado");
                        break;
                    }
                    
                    removerProduto(codigo, lista);
                    break;
                case 5:
                    System.out.println("Digite a opção desejada: ");
                    System.out.println("1 - Listar Todos os Produtos");
                    System.out.println("2 - Ordenar Lista");
                    System.out.println("3 - Relatorios");
                    int opcListar = Integer.parseInt(s.nextLine());
                    
                    switch (opcListar) {
                        case 1:{
                            listarProdutos(lista);
                            break;
                        }
                        
                        case 2:{ 
                            System.out.println("Escolha a ordenação desejada:");
                            System.out.println("1 - Por Nome");
                            System.out.println("2 - Por Preço Crescente");
                            System.out.println("3 - Por Preço Decrescente");
                            System.out.println("4 - Por Categoria");
                            
                            int opcOrdem = Integer.parseInt(s.nextLine());
                            
                            switch (opcOrdem) {
                                case 1:
                                    lista.sort(new ComparadorNome());
                                    listarProdutos(lista);
                                    break;
                                case 2:
                                    lista.sort(new ComparadorPrecoCrescente());
                                    listarProdutos(lista);
                                    break;
                                case 3:
                                    lista.sort(new ComparadorPrecoDescrescente());
                                    listarProdutos(lista);
                                    break;
                                case 4:
                                    lista.sort(new ComparadorCategoria());
                                    listarProdutos(lista);
                                    break;
                                default:
                                    System.out.println("Opção de ordenação inválida.");
                                    break;
                            }
                            break;
                        }
                        
                        case 3:{ 
                            System.out.println("Escolha o relatório desejado:");
                            System.out.println("1 - Produto mais caro");
                            System.out.println("2 - Produto mais barato");
                            System.out.println("3 - Média dos preços");
                            System.out.println("4 - Produtos com estoque abaixo de 5 unidades");
                            
                            int opcRelatorio = Integer.parseInt(s.nextLine());
                            switch (opcRelatorio) {
                                case 1:
                                    produtoMaisCaro(lista);
                                    break;
                                case 2:
                                    produtoMaisBarato(lista);
                                    break;
                                case 3:
                                    mediaDosPrecos(lista);
                                    break;
                                case 4:
                                    estoqueAbaixoDeCinco(lista);
                                    break;
                                default:
                                    System.out.println("Opção de relatório inválida.");
                                    break;
                            }
                            break;
                        }
                        default: {
                            System.out.println("Opção inválida.");
                            break;
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
            
        }while(opc != 0);
        
        s.close();
    }
}