package exercicio2;

public class Pessoa {
	protected String nome;
	protected String sobrenome;
	protected int idade;
	protected double altura;
	protected double peso;
	protected double imc;
	
	public Pessoa(String nome, String sobrenome, 
			int idade, double altura, double peso, double imc) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.imc = imc;
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
	
	public void InformaObesidade() {
		
		System.out.printf("Seu IMC = %.2f\n", imc);
		
		if(imc<18.5) {
			System.out.println(nome + " " + sobrenome + " esta ABAIXO DO PESO");
		}
		else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println(nome + " " + sobrenome + " esta com PESO NORMAL");
		}
		else if(imc >= 25.0 && imc <= 29.9) {
			System.out.println(nome + " " + sobrenome + " esta com SOBREPESO");
		}
		else if(imc >= 30 && imc <= 34.9) {
			System.out.println(nome + " " + sobrenome + " esta com OBESIDADE GRAU 1");
		}
		else if(imc >= 35 && imc <= 39.9) {
			System.out.println(nome + " " + sobrenome + " esta com OBESIDADE GRAU 2");
		}
		else if(imc >40) {
			System.out.println(nome + " " + sobrenome + " esta com OBESIDADE GRAU 3");
		}
	}
	
	}

