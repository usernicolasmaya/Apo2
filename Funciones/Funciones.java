package Apo2;

import javax.swing.JOptionPane;

public class Funciones {
	
	public static void main(String[] args) {
		
		int x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero"));
		int y=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero"));
		int s=suma(x,y);
		JOptionPane.showMessageDialog(null, "La suma es: "+ s);
		int r=resta(x,y);
		JOptionPane.showMessageDialog(null, "La resta es: "+ r);
		int m=multiplicacion(x,y);
		JOptionPane.showMessageDialog(null, "La multiplicacion es: "+ m);
		int d=division(x,y);
		JOptionPane.showMessageDialog(null, "La division es: "+ d);
		
		}

	private static int division(int x, int y) {
		return x/y;
	}

	private static int multiplicacion(int x, int y) {
		return x*y;
	}

	private static int resta(int x, int y) {
		return x-y;
	}

	private static int suma(int x, int y) {
		return x+y;
	}
		
	}