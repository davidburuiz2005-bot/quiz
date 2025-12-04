
import java.util.Scanner;

public class Main {
    
    
Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        GestorPedidos gestorPedidos = new GestorPedidos();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double total;

        do {
        
            System.out.println("1. Agregar ");
            System.out.println("2. Mostrar Pedido");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                
            } else if (opcion == 2) {
                System.out.println("\n su pedido es:");
                total = 0;

                for (int i = 0; i < gestorPedidos.contador; i++) {
                    ItemMenu item = gestorPedidos.lista[i];
                    System.out.println(item.obtenerDetalles());
        total += item.getPrecio();
                }

                System.out.println("Total: " + total);

            } else if (opcion != 3) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 3);

        System.out.println("\nopcion no valida");
        scanner.close();
    }
}
