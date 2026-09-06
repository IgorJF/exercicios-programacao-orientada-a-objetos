public class Main {
    public static void main(String[] args) {
        double[] semana = {25.5, 27.0, 30.2, 22.1, 24.5, 28.0, 26.0};
		Meteorologia m = new Meteorologia(semana);
        //m.setTemperaturas(semana);
        System.out.println("Média semanal: " + m.calcularMedia() + "°C");
    }
}
