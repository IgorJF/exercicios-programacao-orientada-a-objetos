interface Atualizavel{
    void atualizar();
}

class Inimigo implements Atualizavel{
    private String nomeInimigo;
    public Inimigo(String nomeInimigo){
        this.nomeInimigo = nomeInimigo;
    }
    
    public void atualizar() {
        System.out.println("Perseguindo o jogador");
    }
}

class Aliado implements Atualizavel {
    private String tipo;
    public Aliado(String tipo){
        this.tipo = tipo;
    }
    
    public void atualizar() {
        System.out.println("Ajudando o jogador");
    }
}

class NPC implements Atualizavel {
    private String local;
    public NPC(String local){
        this.local = local;
    }
    
    public void atualizar() {
        System.out.println("Reagindo ao ambiente");
    }
}


public class Main{
    public static void main(String[] args){
        Atualizavel[] modulos = {
            new Inimigo("Cinco"),
            new Aliado("Ladino"),
            new NPC("Arvore")
        };
        
        for(Atualizavel a : modulos){
            a.atualizar();
        }
        
    }
}