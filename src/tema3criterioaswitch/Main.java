package tema3criterioaswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bienvenida b1 = new Bienvenida();
		int resultado;

		Scanner sc = new Scanner(System.in);

		System.out.print("Dime tu edad: ");
		resultado = sc.nextInt();
		
		if (resultado == 18) {
			b1.comprobarEdad(1);
		} else if (resultado > 18) {
			b1.comprobarEdad(2);
		} else {
			b1.comprobarEdad(3);
		}

	}

}
