package Ciclos;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner(System.in);

        while (op != 5) {
            System.out.println(
                    " Que funcion quieres realizar?\n 1: Conversor moneda\n 2: Promedio nota\n 3: Clasificacion equipo\n 4: ParImpar\n 5: Salir");

            op = sc.nextInt();

            if (op == 1) {
                Divisa();
            }

            else if (op == 2) {
                Darpromedio();
            } else if (op == 3) {
                Darpuntos();
            } else if (op == 4) {
                Par();
            } else if (op == 5) {
                System.out.println("Programa finalizado, gracias");
            } else {

                System.out.println("Esa opcion no existe");

            }
        }

    }

    public static void Divisa() {
        double D;
        double NV;

        D = 4150;

        System.out.println("ingrese el valor en pesos:");

        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();

        NV = (v / D);

        if (v < 0) {
            System.out.print("el valor no es valido");
        } else {

        }
        System.out.println("el valor en dolares es:" + NV);

    }

    public static void Darpromedio() {

        int x;
        int t;

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la nota 1:");
        int n1 = sc.nextInt();
        System.out.println("ingrese la nota 2:");
        int n2 = sc.nextInt();
        System.out.println("ingrese la nota 3:");
        int n3 = sc.nextInt();

        n1 = 3;
        n2 = 4;
        n3 = 5;

        x = (n1 + n2 + n3);

        t = (x / 3);

        System.out.println("el promedio es:" + t);
    }

    public static void Darpuntos() {
        int pt;

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese los partidos ganados:");
        int pg = sc.nextInt();
        System.out.println("ingrese los partidos perdidos:");
        int pp = sc.nextInt();
        System.out.println("ingrese los partidos empatados:");
        int pe = sc.nextInt();

        pt = ((pg * 3) + (pp * 0) + (pe * 1));

        System.out.println("los puntos totales son:" + pt);

    }

    public static void Par() {

        System.out.println("ingrese su numero");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        if (no == 0) {

            System.out.println("el numero es 0");
        } else if (no % 2 != 0) {

            System.out.println("el numero es impar");
        } else if (no % 2 == 0) {

            System.out.println("el numero es par");
        }
    }

}
