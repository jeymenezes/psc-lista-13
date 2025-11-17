package ListadeExercíciosVIII;

import Lista010.Objeto01;

public class Exercicio02 {
    public class Funcionario extends Pessoa {
        private double salario;
        private String cargo;

        public Funcionario(String nome, String cpf, int idade, double salario, String cargo) {
            super(nome, cpf, idade); // chama o construtor da superclasse Pessoa
            this.salario = salario;
            this.cargo = cargo;
        }

        public double calcularSalarioAnual() {
            return salario * 12;
        }

        @Override
        public void exibirDadosBasicos() {
            super.exibirDadosBasicos();
            System.out.println("Cargo: " + cargo);
            System.out.println("Salário: " + salario);
        }
    }
