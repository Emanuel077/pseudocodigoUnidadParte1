import java.util.*;
public class Ejercicio1{

	public static void main(String[] args) {

		int num1;
		int num2;
		int suma;

		Scanner scanner = new Scanner(System.in);

		System.out.println("");
		System.out.println("Ingrese el primer numero");
		num1 = scanner.nextInt();

		System.out.println("Ingrese el segundo numero");
		num2 = scanner.nextInt();

		suma= num1+num2;

		System.out.println("La suma es: " + suma);
		
	}
}