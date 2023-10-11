package Ciclos;

import javax.swing.JOptionPane;

//Ingresa dos numeros y como resultado los suma,resta,multiplica y divide entre ellos.

public class Ciclos {

    public static void main(String[] args) {

        int x, y, z, w, o, h;

        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", 1));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", 1));
        z = suma(x, y);
        JOptionPane.showMessageDialog(null, "La Suma es igual a: " + z, "Suma", 1);
        w = resta(x, y);
        JOptionPane.showMessageDialog(null, "La Resta es igual a: " + w, "Resta", 1);
        o = multiplicacion(x, y);
        JOptionPane.showMessageDialog(null, "La Multiplicacion es igual a: " + o, "Multiplicacion", 1);
        h = Division(x, y);
        JOptionPane.showMessageDialog(null, "La Dision es igual a: " + h, "Division", 1);
    }

    public static int suma(int a, int b) {
        return (a + b);
    }

    public static int resta(int a, int b) {
        return (a - b);

    }

    public static int multiplicacion(int a, int b) {
        return (a * b);
    }

    public static int Division(int a, int b) {
        return (a / b);
    }
}