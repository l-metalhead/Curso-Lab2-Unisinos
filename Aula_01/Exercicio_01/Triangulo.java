
public class Triangulo extends Figura {
	private double base, altura, lado1, lado2;
	
	public Triangulo(String cor, double base, double altura, double lado1, double lado2) {
		super(cor);
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double calculaArea() {
		return (base * altura) / 2;
	}

	@Override
	public double calculaPerimetro() {
		return base + lado1 + lado2;
	}

}
