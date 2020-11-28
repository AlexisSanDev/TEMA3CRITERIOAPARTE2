package tema3criterioaswitch;

public class Bienvenida {

	public void comprobarEdad(int e) {
		switch (e) {
		case 1:
			System.out.println("Bienvenido al sistema, como usted es un usuario novato aquí tiene unos trucos para entender mejor nuestro sistema.");
			break;
		case 2:
			System.out.println("Bienvenido al sistema");
			break;
		default:
			System.out.println("Usted es menor de edad, no puede entrar al sistema.");
		}
	}
}