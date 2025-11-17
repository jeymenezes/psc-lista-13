package ListadeExercíciosVIII;

public class Exercicio03 {
    public class Gerente extends Funcionario {
        private String departamento;

        public Gerente(String nome, String cpf, int idade, double salario, String cargo, String departamento) {
            super(nome, cpf, idade, salario, cargo); // chama o construtor de Funcionario
            this.departamento = departamento;
        }

        @Override
        public void exibirDadosBasicos() {
            super.exibirDadosBasicos(); // chama o método da superclasse (Funcionario → Pessoa)
            System.out.println("Departamento: " + departamento);
        }
    }

}
