package exercicio1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o valor da base: ");
		double base = sc.nextDouble();
		
		System.out.printf("Informe o valor da altura: ");
		double altura = sc.nextDouble();
		
		TrianguloRetangulo t = new TrianguloRetangulo(0.0, base, altura);
		
		double h = t.CalculaHipotenusa();
		t.setH(h);
		double area = t.CalculaArea();
		

		System.out.println("\nResultados:");
        System.out.println("Base = " + t.getBase());
        System.out.println("Altura = " + t.getAltura());
        System.out.println("Hipotenusa (h) = " + h);
        System.out.println("Área = " + area);

        sc.close();
	}

}
