public class ContaBancaria {
    private static class Conta {
        private double saldo;
        private static int contador;

        public Conta(double saldo) {
            this.saldo = saldo;
            contador++;
        }

        public double saque(double valor) {
            if (valor > saldo) return -1;
            saldo -= valor;
            return saldo;
        }
    }

    public static void main(String[] args) {
        Conta[] contas = {
            new Conta(1000), new Conta(10), new Conta(900), new Conta(5)
        };

        for (Conta conta : contas) {
            double saldo = conta.saque(10);
            if (saldo == -1) System.out.println("Saldo insuficiente");
            System.out.println(saldo);
        }
        System.out.println(Conta.contador);
    }
}
