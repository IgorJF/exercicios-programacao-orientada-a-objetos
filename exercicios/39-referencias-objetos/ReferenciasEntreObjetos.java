public class ReferenciasEntreObjetos {
    private static class Objeto {
        private int valor;

        public void setValor(int valor) { this.valor = valor; }
        public int getValor() { return valor; }
    }

    public static void main(String[] args) {
        Objeto primeiraReferencia = new Objeto();
        Objeto segundaReferencia = primeiraReferencia;
        Objeto terceiroObjeto = new Objeto();
        Objeto quartoObjeto = new Objeto();

        primeiraReferencia.setValor(10);
        System.out.println(primeiraReferencia.getValor());
        System.out.println(segundaReferencia.getValor());

        terceiroObjeto.setValor(20);
        System.out.println(terceiroObjeto.getValor());
        System.out.println(quartoObjeto.getValor());
    }
}
