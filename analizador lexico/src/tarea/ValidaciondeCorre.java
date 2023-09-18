package tarea;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidaciondeCorre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un correo: ");
        String correo = scanner.nextLine();

        String regex = "[a-zA-Z0-9_-]+@[a-zA-Z0-9.-]+[a-zA-Z]{2,4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);

        if (matcher.matches()) {
            System.out.println("Correo valido");
        } else {
            System.out.println("Correo no valido");
        }
    }
}
