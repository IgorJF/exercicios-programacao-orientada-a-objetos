public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", 3000);
        Gerente g = new Gerente("Ana", 5000, 2000);
		
		double contraCheque = g.exibirContracheque() + g.exibirBonus();

        // Impressão de instância de Funcionário (superclasse)
        System.out.println("Funcionário: " + f.getNome() + " | Salário: R$ " + f.getSalario() + " | Contracheque: R$ " + f.exibirContracheque());
        // Impressão de instância de Gerente (subclasse)
        System.out.println("Gerente: " + g.getNome() + " | Salário: R$ " + g.getSalario() + " | Bônus: R$ " + g.getBonus() + " | Contracheque: R$ " + contraCheque);
		
		//Como nao criei um metodo de exibir dados, eu uso o get para puxar
    }
}
