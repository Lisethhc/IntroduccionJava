package co.com.ps.c3;

import java.util.*;
public class Clase3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      System.out.println("Digite su nombre");
      String nombre = scanner.nextLine();

      System.out.println("Digite su edad");
      int edad = scanner.nextInt();

      System.out.println("Su nombre es  "+ nombre +" Su edad es  " + edad + " años Bienvenido.");

       Persona persona = new Persona ();
       persona.setEdad (13);
       persona.setNombre ("Liseth");
       System.out.println(persona.getEdad ());



    }
}
