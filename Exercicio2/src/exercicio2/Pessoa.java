package exercicio2;

import java.util.Calendar;

public class Pessoa {
	protected String nome;
	protected String sobrenome;
	protected int idade;
	protected double altura;
	protected double peso;
	protected double imc;
	protected Data data_nascimento;
	
	public Pessoa(String nome, String sobrenome, 
			int idade, double altura, double peso, double imc, Data data_nascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.imc = imc;
		this.data_nascimento = data_nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}
	
	public void CalculaIMC(){
		imc = peso/(Math.pow(altura,2));
	}
	
	public void InformaDados(int i) {
		System.out.println("Cadastro " + i + ":");
		System.out.println("---------------");
		System.out.println("Nome completo: " + nome + " " + sobrenome);
		String nomeMaiusculo = nome.toUpperCase();
		System.out.println("Nome de referencia: " + sobrenome + ", " + nomeMaiusculo);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("IMC: " + imc);
		if(imc<18.5) {
			System.out.println("Classificacao: ABAIXO DO PESO\n");
		}
		else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Classificacao: PESO NORMAL\n");
		}
		else if(imc >= 25.0 && imc <= 29.9) {
			System.out.println("Classificacao: SOBREPESO\n");
		}
		else if(imc >= 30 && imc <= 34.9) {
			System.out.println("Classificacao: OBESIDADE GRAU 1\n");
		}
		else if(imc >= 35 && imc <= 39.9) {
			System.out.println("Classificacao: OBESIDADE GRAU 2\n");
		}
		else if(imc >40) {
			System.out.println("Classificacao: OBESIDADE GRAU 3\n");
		}
	}
	
	public void calculaIdade (Data data_nascimento) {
		
		Calendar hoje = Calendar.getInstance();

	    idade = hoje.get(Calendar.YEAR) - data_nascimento.ano;

	    if ((hoje.get(Calendar.MONTH) + 1) < data_nascimento.mes ||
	       ((hoje.get(Calendar.MONTH) + 1) == data_nascimento.mes &&
	        hoje.get(Calendar.DAY_OF_MONTH) < data_nascimento.dia)) 
	    {
	        idade--;
	    }

		}
	}
	


