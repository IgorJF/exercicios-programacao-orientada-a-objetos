public class FuncionarioGerente {
    private static class Funcionario {
        private String nome;
        private double salario;

        public Funcionario(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }

        public String getNome() { return nome; }
        public double getSalario() { return salario; }
        public double exibirContracheque() { return salario; }
    }

    private static class Gerente extends Funcionario {
        private double bonus;

        public Gerente(String nome, double salario, double bonus) {
            super(nome, salario);
            this.bonus = bonus;
        }

        public double getBonus() { return bonus; }
        public double exibirBonus() { return bonus; }
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 3000);
        Gerente gerente = new Gerente("Ana", 5000, 2000);
        double contraCheque = gerente.exibirContracheque() + gerente.exibirBonus();

        System.out.println("Funcionário: " + funcionario.getNome() + " | Salário: R$ " + funcionario.getSalario() + " | Contracheque: R$ " + funcionario.exibirContracheque());
        System.out.println("Gerente: " + gerente.getNome() + " | Salário: R$ " + gerente.getSalario() + " | Bônus: R$ " + gerente.getBonus() + " | Contracheque: R$ " + contraCheque);
    }
}
