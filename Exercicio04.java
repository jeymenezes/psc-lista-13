package ListadeExercíciosVIII;

public class Exercicio04 {
    public class TesteHeranca {
        public static void main(String[] args) {

            // 1. Instância de Pessoa
            Pessoa p = new Pessoa("Maria", "111.222.333-44", 30);

            // 2. Instância de Funcionario
            Funcionario f = new Funcionario("Carlos", "555.666.777-88", 40, 3500.0, "Analista");

            // 3. Instância de Gerente
            Gerente g = new Gerente("Fernanda", "999.888.777-66", 38, 8000.0, "Gerente de Projetos", "TI");

            // Exibindo dados
            System.out.println("----- Pessoa -----");
            p.exibirDadosBasicos();

            System.out.println("\n----- Funcionario -----");
            f.exibirDadosBasicos();
            System.out.println("Salário Anual: " + f.calcularSalarioAnual());

            System.out.println("\n----- Gerente -----");
            g.exibirDadosBasicos();
            System.out.println("Salário Anual: " + g.calcularSalarioAnual());
        }
    }

}
