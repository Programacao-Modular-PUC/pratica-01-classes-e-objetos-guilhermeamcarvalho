package exercicio1;

public class TrianguloRetangulo {
	private double h;
	private double base;
	private double altura;
	
	public TrianguloRetangulo(double h, double base, double altura){
		this.h=h;
		this.base=base;
		this.altura=altura;
	}
	

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	public double CalculaArea () {
		return (base*altura)/2;
	}
	
	
	
	public double CalculaHipotenusa(){
		h = Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
		return h;
	}
	
}
