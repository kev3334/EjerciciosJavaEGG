import java.util.Scanner;

public class PruebaCodigo {
    public static void main(String[] args) {
        String password;
        boolean cantCaract;
        Scanner entrada = new Scanner(System.in);
        int mayus = 0;
        int minus = 0;
        int numbCoun = 0;
        int spec = 0;
        System.out.print("Por favor ingrese una contraseña: ");
        password = entrada.nextLine();
        entrada.close();
        if (password.length() < 8) {
            cantCaract = false;
            System.out.println("La contraseña debe tener al menos 8 caracteres");
        } else {
            cantCaract = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char letra = password.charAt(i);
            if (Character.isUpperCase(letra)) {
                mayus++;
            }
            if (Character.isLowerCase(letra)) {
                minus++;
            }

            if (letra > 48 & letra < 57) {
                numbCoun++;
            }
            if (letra >= 32 & letra <= 44) {
                spec++;
            }
        }
        if (mayus < 1 | minus < 1) {
            System.out.println("La contraseña debe tener al menos una mayúscula y una minúscula");
        }
        if (numbCoun < 1) {
            System.out.println("La contraseña debe tener al menos 1 número");
        }
        if (spec < 1) {
            System.out.println("La contraseña debe tener al menos 1 caracter especial");
        }
        if (cantCaract & mayus >= 1 & minus >= 1 & numbCoun >= 1 & spec >= 1) {
            System.out.println("La contraseña es segura");
        }
    }
}