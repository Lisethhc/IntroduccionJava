package co.com.ps.c4;

import java.util.Scanner;

public class Estudiante {

    public static void main(String[] args) {
      Estudiante estudiante = new Estudiante();
      Scanner scanner = new Scanner (System.in);
      System.out.println("Escriba su nombre");
      String nombre = scanner.nextLine();

      System.out.println("Ingrese la nota del estudiante");
      double nota = scanner.nextDouble();

      if (nota >= 3 && nota <= 5){
            System.out.println("El estudiante ganó la materia");
        } else if (nota >= 0 && nota <3) {
            System.out.println("El estudiante perdió la materia");
        } else if (nota >= 0 && nota <3) {
        } else {
        System.out.println("El número inválido");
        }
    }
}
