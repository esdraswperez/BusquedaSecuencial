
import java.util.Scanner;

/* 
Búsqueda Secuencial en un arreglo estático
Por Esdras Pérez
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = {4, 1, 5, 2, 3}, dato;
        boolean bandera = false;

        System.out.print("Ingresa el numero a buscar en el arreglo: ");
        dato = entrada.nextInt();

        // Búsqueda Secuencial en el arreglo de enteros
        int i = 0;
        while (i < arreglo.length && bandera == false) {
            if (arreglo[i] == dato) {
                bandera = true;
            }
            i++;
        }

        // Mustra los datos
        if (bandera == false) { // Si no encuentró el dato en el arreglo
            System.out.println("El numero no se encuentra en el arreglo");
        } else { // Si encontró el dato en el arreglo
            System.out.println("El numero " + dato + " se encuentra en la posicion " + (i - 1));
        }

    }
}
