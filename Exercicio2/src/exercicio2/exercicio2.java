package exercicio2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomeAnterior = "";
		String sobrenomeAnterior = "";
		
		Pessoa[] pessoas = new Pessoa[10];
		
		int tam = 0;
		
		for (int i = 0; i < 10; i++) {
		System.out.println("Cadastro " + (i+1));
		System.out.println("---------------");
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		if(i > 0 && (nome.equals(nomeAnterior))&&
				(sobrenome.equals(sobrenomeAnterior))) {
			break;
		}
		
		System.out.print("Digite sua data de nascimento (DD/MM/AAAA): ");
		String data = sc.nextLine();
		String[] partes = data.split("/");

		Data data_nascimento = new Data();
		data_nascimento.dia = Integer.parseInt(partes[0]);
		data_nascimento.mes = Integer.parseInt(partes[1]);
		data_nascimento.ano = Integer.parseInt(partes[2]);
		
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.print("Digite seu peso: ");
		double peso = sc.nextDouble();
		sc.nextLine();
		
		pessoas[i] = new Pessoa(nome, sobrenome, 0, altura, peso, 0, data_nascimento);
		
		pessoas[i].CalculaIMC();
		pessoas[i].calculaIdade(data_nascimento);
		
		nomeAnterior = nome;
		sobrenomeAnterior = sobrenome;
		tam++;
		}
		
		for(int i = 0; i < tam; i++) {
		pessoas[i].InformaDados(i);
		}
		sc.close();
	}
}
