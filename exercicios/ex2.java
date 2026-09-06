import java.util.ArrayList;
import java.util.List;

interface Conectavel{
    void conectar();
    void desconectar();
}

class Impressora implements Conectavel{
    @Override
    public void conectar(){
        System.out.println("Conectando Impressora");
    }
    @Override
    public void desconectar(){
        System.out.println("Desconectando Impressora");
    }
}

class Scanner implements Conectavel{
    @Override
    public void conectar(){
        System.out.println("Conectando Scanner");
    }
    @Override
    public void desconectar(){
        System.out.println("Desconectando Scanner");
    }
}

class Webcam implements Conectavel{
    @Override
    public void conectar(){
        System.out.println("Conectando Webcam");
    }
    @Override
    public void desconectar(){
        System.out.println("Desconectando Webcam");
    }
}

public class Main{
    public static void main(String[] args){
        List<Conectavel> lista = new ArrayList<>();
        Conectavel c1 = new Impressora();
        Conectavel c2 = new Scanner();
        Conectavel c3 = new Webcam();
        
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        
        for(Conectavel c : lista){
            c.conectar();
        }
        
        for(Conectavel c : lista){
            c.desconectar();
        }
    }
}