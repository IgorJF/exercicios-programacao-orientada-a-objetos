import java.util.ArrayList;

interface Certificavel{
    void emitirCertificado();
}

interface Discutivel{
    void criarForum();
}

class Modulo implements Certificavel{
    @Override
    public void emitirCertificado(){
        System.out.println("Emitindo certificado de modulo");
    }
}

class Video implements Discutivel{
    @Override
    public void criarForum(){
        System.out.println("Criando forum de Video");
    }
}

class Artigo implements Certificavel, Discutivel{
    @Override
    public void emitirCertificado(){
        System.out.println("Emitindo certificado de artigo");
    }
    
    @Override
    public void criarForum(){
        System.out.println("Criando de forum de artigo");
    }
}

public class Main{
    public static void main(String[] args){
        ArrayList<Certificavel> listaC = new ArrayList<>();
        ArrayList<Discutivel> listaD = new ArrayList<>();
        
        listaC.add(new Modulo());
        listaC.add(new Artigo());
        listaD.add(new Video());
        listaD.add(new Artigo());
        
        for(Certificavel c : listaC){
            c.emitirCertificado();
        }
        for(Discutivel d : listaD){
            d.criarForum();
        }
    }
}