import java.util.Scanner;

class MenuPrincipal {
    public static void ejecutarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        OperacionesAritmeticas operacionesAritmeticas = new OperacionesAritmeticas();
        CalculadoraGeometrica calculadoraGeometrica = new CalculadoraGeometrica();

        int opcionPrincipal;

        do {
            System.out.println("Seleccione el tipo de cálculo que desea realizar:");
            System.out.println("1. Operaciones aritméticas");
            System.out.println("2. Operaciones geométricas");
            System.out.println("3. Salir");

            try {
                opcionPrincipal = scanner.nextInt();

                switch (opcionPrincipal) {
                    case 1:
                        operacionesAritmeticas.ejecutarMenu(scanner);
                        break;
                    case 2:
                        calculadoraGeometrica.ejecutarMenuGeometrico(scanner);
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese un número entero válido.");
                scanner.next();
                opcionPrincipal = 0;
            }

        } while (opcionPrincipal != 3);
        scanner.close();
    }
}