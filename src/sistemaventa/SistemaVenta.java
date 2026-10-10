/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaventa;


import java.util.Scanner;

public class SistemaVenta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // El menú deberá permanecer activo mediante un ciclo do-while
        do {
            System.out.println("\n====== 2. MENU PRINCIPAL ======");
            System.out.println("1. Registrar una venta");
            System.out.println("2. Consultar caja");
            System.out.println("3. Mostrar estadisticas");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(">> Entrando a Registrar una venta...");
                    // Aqui llamas a tu metodo de ventas
                    break;
                case 2:
                    System.out.println(">> Consultando caja...");
                    break;
                case 3:
                    System.out.println(">> Mostrando estadisticas...");
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo");
                    break;
            }

        } while (opcion != 4);

        sc.close();
    }
}

