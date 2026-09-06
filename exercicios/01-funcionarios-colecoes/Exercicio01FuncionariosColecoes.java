import java.util.Objects;

// INTERFACE
interface Autenticavel {
    boolean autenticar(String senha);
}

// CLASSE ABSTRATA
abstract class Funcionario implements Comparable<Funcionario> {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public double getSalario() { return salario; }

    // MÉTODO ABSTRATO: Cada filho dita seu bônus
    public abstract double calcularBonus();

    // TOSTRING: Transforma o objeto em texto legível
    @Override
    public String toString() {
        return "Nome: " + nome + " | Salário: R$" + salario + " | Bônus: R$" + calcularBonus();
    }

    // COMPARETO: Ordenação natural padrão (Por Salário)
    @Override
    public int compareTo(Funcionario outro) {
        return Double.compare(this.salario, outro.salario);
    }

    // EQUALS E HASHCODE: Obrigatórios para o HashSet não duplicar funcionários com mesmo nome
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(nome, that.nome); // Iguais se tiverem o mesmo nome
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome); // Gera o hash baseado no nome
    }
}

// HERANÇA E POLIMORFISMO (Filho 1)
class Gerente extends Funcionario implements Autenticavel {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() { return this.getSalario() * 0.20; } // Bônus de 20%

    @Override
    public boolean autenticar(String senha) { return "1234".equals(senha); }
}

// HERANÇA E POLIMORFISMO (Filho 2)
class Programador extends Funcionario {
    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() { return this.getSalario() * 0.10; } // Bônus de 10%
}


import java.util.Comparator;

// COMPARATOR: Ordenação alternativa (Por Nome em ordem alfabética)
class CompararPorNome implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        return f1.getNome().compareTo(f2.getNome()); // Compara Strings usando .compareTo nativo delas
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio01FuncionariosColecoes {
    public static void main(String[] args) {
        
        // REFERÊNCIA DE SUPERTIPO: Tipo da esquerda é o Pai (Funcionario), instância é o Filho
        Funcionario f1 = new Programador("Carlos", 5000.0);
        Funcionario f2 = new Gerente("Ana", 8000.0);
        Funcionario f3 = new Programador("Bruno", 4000.0);
        Funcionario f4 = new Programador("Carlos", 5000.0); // DUPLICADO (Mesmo nome de f1)

        // FRAMEWORK COLLECTIONS: Criando um ArrayList (Permite duplicados e mantém ordem)
        List<Funcionario> lista = new ArrayList<>();
        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4); // Adiciona o duplicado

        System.out.println("--- LISTA ORIGINAL (Com duplicados) ---");
        // FOR EACH: Percorre a lista. O println faz a CHAMADA implícita do toString()
        for (Funcionario f : lista) {
            System.out.println(f);
        }

        // ORDENAÇÃO EM COLECÕES (Usando o Comparable - por Salário)
        Collections.sort(lista);
        System.out.println("\n--- LISTA ORDENADA POR SALÁRIO (Comparable) ---");
        for (Funcionario f : lista) { System.out.println(f); }

        // ORDENAÇÃO EM COLECÕES (Usando o Comparator - por Nome)
        lista.sort(new CompararPorNome());
        System.out.println("\n--- LISTA ORDENADA POR COMPARATOR (Nome) ---");
        for (Funcionario f : lista) { System.out.println(f); }

        // TRANSFORMAR ARRAYLIST EM HASHSET (Para remover duplicados usando hashCode/equals)
        Set<Funcionario> conjunto = new HashSet<>(lista);

        System.out.println("\n--- HASHSET (Duplicados removidos e sem ordem garantida) ---");
        for (Funcionario f : conjunto) {
            System.out.println(f);
        }
        
        // COMPARAÇÃO DE STRINGS (Exemplo prático solicitado)
        String nome1 = "Carlos";
        String nome2 = new String("Carlos");
        System.out.println("\nComparando Strings com ==: " + (nome1 == nome2));      // false
        System.out.println("Comparando Strings com .equals(): " + nome1.equals(nome2)); // true
    }
}
