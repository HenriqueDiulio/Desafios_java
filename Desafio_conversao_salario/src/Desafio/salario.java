package Desafio;

import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// declarando variaveis;
		String salario1, salario2, salario3;
		double val1, val2, val3;
		double soma, juncaoSalario;

		// recebendo valores ;
		System.out.println("Digito o seu primerio salario:");
		salario1 = sc.nextLine();
		System.out.println("Digito o seu segundo salario:");
		salario2 = sc.nextLine();
		System.out.println("Digito o seu terceiro salario:");
		salario3 = sc.nextLine();
		
		// converção ;
		val1 = Double.parseDouble(salario1);
		val2 = Double.parseDouble(salario2);
		val3 = Double.parseDouble(salario3);
		
		// soma ;
		juncaoSalario = (val1 + val2 + val3);
		soma = juncaoSalario / 2;
		
		// exibindo resultados ;
		System.out.println("A junção dos salarios é: " + juncaoSalario+
		"\nA média salarial é :"+soma);

		sc.close();
		
	}

}
