public class CarroEncapsulamento {
    private static class Carro {
        private String marca;
        private String modelo;
        private String placa;

        public Carro(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
            this.placa = "Sem placa";
        }

        public Carro(String marca, String modelo, String placa) {
            this(marca, modelo);
            this.placa = placa;
        }

        public void exibirDetalhes() {
            System.out.println("Marca: " + marca + "|Modelo: " + modelo + "|Placa: " + placa);
        }
    }

    public static void main(String[] args) {
        Carro carroSemPlaca = new Carro("Toyota", "Supra MK4");
        Carro carroComPlaca = new Carro("Honda", "Civic", "ABC-123");
        carroSemPlaca.exibirDetalhes();
        carroComPlaca.exibirDetalhes();
    }
}
