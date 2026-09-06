public class MediaTemperaturas {
    private static class Meteorologia {
        private double[] temperaturas;

        public Meteorologia(double[] temperaturas) {
            this.temperaturas = temperaturas;
        }

        public double calcularMedia() {
            double soma = 0;
            for (double temperatura : temperaturas) soma += temperatura;
            return soma / temperaturas.length;
        }
    }

    public static void main(String[] args) {
        double[] semana = {25.5, 27.0, 30.2, 22.1, 24.5, 28.0, 26.0};
        Meteorologia meteorologia = new Meteorologia(semana);
        System.out.println("Média semanal: " + meteorologia.calcularMedia() + "°C");
    }
}
