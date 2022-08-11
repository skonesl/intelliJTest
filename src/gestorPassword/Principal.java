package gestorPassword;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Password> arrayPasswords = new ArrayList<Password>();
        List<Boolean> arraySeguras = new ArrayList<Boolean>();

        System.out.print("Introduzca la cantidad de contraseñas aleatorias que desea generar: ");
        int cantPasswords = sc.nextInt();
        System.out.print("Indique la longitud que tendrán sus contraseñas: ");
        int longPassword = sc.nextInt();

        for (int i = 0; i < cantPasswords; i++) {
            Password pass = new Password();
            pass.generarPassword(longPassword);
            arrayPasswords.add(pass);
        }

        for (int i = 0; i < cantPasswords; i++) {
            arraySeguras.add(arrayPasswords.get(i).esFuerte(arrayPasswords.get(i).getPassword()));
        }

        for (int i = 0; i < cantPasswords; i++) {

            String segura;
            if (arraySeguras.get(i) == true) {
                segura = "es segura";
            } else {
                segura = "NO es segura";
            }
            System.out.println("La contraseña: " + arrayPasswords.get(i).getPassword() + " " + segura);
        }

    }
}
