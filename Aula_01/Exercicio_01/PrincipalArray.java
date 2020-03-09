
public class PrincipalArray {

	public static void imprimeArea(Figura f) {
		if (f instanceof Retangulo) {
			Retangulo retangulo = new Retangulo("Laranja", 2, 8);
		} else if(f instanceof Circulo) {
			Circulo circulo = new Circulo("Magenta", 6);
		} else if(f instanceof Triangulo) {
			Triangulo triangulo = new Triangulo("Preto", 1, 2, 3, 4);
		}
	}
	
	public static void main(String[] args) {
		

	}

}
