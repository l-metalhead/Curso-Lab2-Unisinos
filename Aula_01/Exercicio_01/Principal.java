
public class Principal {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo("Vermelho", 2.15, 1.56);
		Circulo circulo = new Circulo("Azul", 3.14);
		Triangulo triangulo = new Triangulo("Verde", 2.15, 15, 3.4, 4.5);
		
		System.out.println("Cor do Ret�ngulo: " + retangulo.cor);
		System.out.println("�rea do Ret�ngulo: " + retangulo.calculaArea());
		System.out.println("Perimetro do Ret�ngulo: " + retangulo.calculaPerimetro());
		
		System.out.println();
		
		System.out.println("Cor do C�rculo: " + circulo.cor);
		System.out.println("�rea do C�rculo: " + circulo.calculaArea());
		System.out.println("Per�metro do C�rculo: " + circulo.calculaPerimetro());
		
		System.out.println();
		
		System.out.println("Cor do Tri�ngulo: " + triangulo.cor);
		System.out.println("�rea do Tri�ngulo: " + triangulo.calculaArea());
		System.out.println("Per�metro do Tri�ngulo: " + triangulo.calculaPerimetro());

	}

}
