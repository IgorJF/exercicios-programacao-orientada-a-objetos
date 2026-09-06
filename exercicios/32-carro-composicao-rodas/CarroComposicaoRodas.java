public class CarroComposicaoRodas {
    private static class Roda {
        private int aro;
        private String tipo;

        public void setAro(int aro) { this.aro = aro; }
        public int getAro() { return aro; }
        public void setTipo(String tipo) { this.tipo = tipo; }
        public String getTipo() { return tipo; }
    }

    private static class Carro {
        private String marca;
        private String modelo;
        private int ano;
        private Roda[] rodas;

        public Carro(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.rodas = new Roda[4];
            for (int i = 0; i < 4; i++) rodas[i] = new Roda();
        }

        public Roda[] getRodas() { return rodas; }

        public void exibirDados() {
            System.out.println("Marca: " + marca + "Modelo: " + modelo + "Ano: " + ano);
            for (int i = 0; i < rodas.length; i++) {
                System.out.println("Roda " + i + "Aro: " + rodas[i].getAro() + "Tipo: " + rodas[i].getTipo());
            }
        }
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Fiesta", 2016);
        for (Roda roda : carro.getRodas()) {
            roda.setAro(17);
            roda.setTipo("Cromada");
        }
        carro.exibirDados();
    }
}
