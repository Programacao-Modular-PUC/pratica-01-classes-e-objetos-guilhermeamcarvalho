package exercicio2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.print("Digite seu peso: ");
		double peso = sc.nextDouble();
		
		Pessoa pessoa1 = new Pessoa (nome, sobrenome, idade, altura, peso, 0.0);
		
		pessoa1.CalculaIMC();
		pessoa1.InformaObesidade();
		
		sc.close();
		}

}
