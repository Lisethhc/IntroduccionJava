package co.com.ps.c5;

import java.util.Scanner;

public class Login {

    private static final String LOGIN = "Lisethherazo";
    private static final String CONTRASENA = "12345";

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String LOGIN = "Lisethherazo";
        String CONTRASENA = "12345";

        System.out.println("Escriba su usuario");
        String usuario = scanner.nextLine();
        System.out.println("Escriba su contraseña");
        String contrasena = scanner.nextLine();

        boolean usuarioValido = esUsuarioValido(usuario);
        boolean contrasenaValida = esContrasenaValida(contrasena);

        if (usuarioValido && contrasenaValida) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");

        } else {
            System.out.println("Usuario y contraseña incorrectos");
        }
    }
    private static boolean esUsuarioValido(String usuario) {
        return usuario.compareTo(LOGIN) == 0;
    }
    private static boolean esContrasenaValida(String contrasena) {
        return contrasena.compareTo(CONTRASENA) == 0;
            }
        }





