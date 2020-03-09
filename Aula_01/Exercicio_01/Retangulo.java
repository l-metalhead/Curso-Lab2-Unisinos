
public class Retangulo extends Figura {
	private double base, altura;
	
	public Retangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		return base * altura;
	}

	@Override
	public double calculaPerimetro() {
		return (base * 2) + (altura * 2);
	}

}
