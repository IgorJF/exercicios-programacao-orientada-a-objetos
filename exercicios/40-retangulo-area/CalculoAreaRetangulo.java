public class CalculoAreaRetangulo {
    private static class Retangulo {
        private double altura;
        private double largura;

        public Retangulo() {}

        public Retangulo(double altura, double largura) {
            this.altura = altura;
            this.largura = largura;
        }

        public void setAltura(double altura) { this.altura = altura; }
        public void setLargura(double largura) { this.largura = largura; }
        public double calcularArea() { return altura * largura; }
    }

    public static void main(String[] args) {
        Retangulo primeiroRetangulo = new Retangulo(10, 12);
        Retangulo segundoRetangulo = new Retangulo();
        segundoRetangulo.setAltura(4);
        segundoRetangulo.setLargura(6);

        System.out.println("Area 1\n:" + primeiroRetangulo.calcularArea());
        System.out.println("Area 2\n:" + segundoRetangulo.calcularArea());
    }
}
