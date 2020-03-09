
public class Circulo extends Figura {
	private double raio;
	
	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * raio * raio;
	}

	@Override
	public double calculaPerimetro() {
		return Math.PI * 2 * raio;
	}

}
