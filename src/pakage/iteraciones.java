package pakage;

import java.util.Scanner;

public class iteraciones {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroSecreto;
		int numeroUsuario;
		String ayuda;
		String mensaje;
		int contador;
		
		
		numeroSecreto = (int) (Math.random() * 10 + 1);
		System.out.println(numeroSecreto);
		
		
		contador = 0;
		
		do {
			System.out.print("Introduzca un número [1-100] (-1=Salir): ");
			numeroUsuario = Integer.parseInt(teclado.nextLine());
			
			if (numeroSecreto != numeroUsuario) {
				
				ayuda =(numeroSecreto > numeroUsuario) ? "Es mayor" : "Es menor";
			
				System.out.println(ayuda);
				
		}
		
			
			contador++;
		} while (numeroSecreto != numeroUsuario && numeroUsuario != -1);
		
		
		
		System.out.println("Total de intentos = " + contador);
		mensaje = (numeroSecreto == numeroUsuario) ? "Enhorabiena, has acertado !" : "Lástima, te has rendido. ";
		System.out.println(mensaje);
}
}
