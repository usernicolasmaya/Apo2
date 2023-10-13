package Condicionales;

import javax.swing.JOptionPane;

public class numero_par {
	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", 1));
		if (numero == 0) {
			System.out.print("El numero es 0");
		} else if (numero % 2 == 0) {
			System.out.print("El numero es par");
		} else {
			System.out.print("El numero es impar");
		}

	}

}
