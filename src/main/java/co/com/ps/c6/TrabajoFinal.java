package co.com.ps.c6;

import java.util.Scanner;

public class TrabajoFinal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de Unidades");
        System.out.println("Elija la unidad que desea convertir");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Metros a pies");
        int opcion = scanner.nextInt();


        if (opcion == 1) {
            System.out.println("Ingresa una temperatura en grados Celsius");

            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("La temperatura en grados Fahrenheit es: "  + fahrenheit);

        } else if (opcion == 2) {
        System.out.print("Ingresa una longitud en metros: ");

        double metros = scanner.nextDouble();
        double pies = metros * 3.28084;
        System.out.println("La longitud en pies es: " + pies);
    } else {
        System.out.println("Opción inválida. Por favor, selecciona 1 o 2.");
    }
    }
}


