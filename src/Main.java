import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo");
        String archivo = sc.nextLine();

        System.out.println("Escribe 5 nombres:");

        for (int i = 1; i <= 5; i++) {
            String nombre = sc.nextLine();
            //FILE WRITER
            try (FileWriter writer = new FileWriter(archivo, true)) {
                writer.write(nombre + "\n");
            } catch (IOException e) {
                System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
            }

        }
    }
}