import java.util.Scanner;

public class KeltoCel {

	public static void main(String[] args) {

		double kelvin;

		System.out.printf("Introduza uma temperatura em kelvin :");

		Scanner entrada = new Scanner(System.in);
		kelvin = entrada.nextDouble();

		double celsius = (kelvin - 273.15);

		System.out.println(celsius + " celsius");

	}
}