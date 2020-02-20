package exercicio1;

public class Triangulo {

	private double base;
	private double altura;
	private double area;
	
	Triangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double verArea() {
		this.area = this.base * this.altura;
		return area;
	}
	
	
	
}
