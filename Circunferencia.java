package revisão;

public class Circunferencia {

	public static void main(String[] args) {
//DECLARA VARIÁVEIS
		int raio = 4;
		final double PI = 3.14159;
		double area = PI * raio * raio;
		
		//EXIBE O RESULTADO
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("a área é igual a: " + area + "m²");
	}

}
