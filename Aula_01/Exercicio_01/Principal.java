
public class Principal {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo("Vermelho", 2.15, 1.56);
		Circulo circulo = new Circulo("Azul", 3.14);
		Triangulo triangulo = new Triangulo("Verde", 2.15, 15, 3.4, 4.5);
		
		System.out.println("Cor do Retângulo: " + retangulo.cor);
		System.out.println("Área do Retângulo: " + retangulo.calculaArea());
		System.out.println("Perimetro do Retângulo: " + retangulo.calculaPerimetro());
		
		System.out.println();
		
		System.out.println("Cor do Círculo: " + circulo.cor);
		System.out.println("Área do Círculo: " + circulo.calculaArea());
		System.out.println("Perímetro do Círculo: " + circulo.calculaPerimetro());
		
		System.out.println();
		
		System.out.println("Cor do Triângulo: " + triangulo.cor);
		System.out.println("Área do Triângulo: " + triangulo.calculaArea());
		System.out.println("Perímetro do Triângulo: " + triangulo.calculaPerimetro());

	}

}
