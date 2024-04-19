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
            System.out.println("3. Calcular sistema lineal 2x2");
            System.out.println("4. Menu Cris");
            System.out.println("5. Salir");

            try {
                opcionPrincipal = scanner.nextInt();

                switch (opcionPrincipal) {
                    case 1:
                        limpiarPantalla();
                        operacionesAritmeticas.ejecutarMenu(scanner);
                        break;
                    case 2:
                        limpiarPantalla();
                        calculadoraGeometrica.ejecutarMenuGeometrico(scanner);
                        break;
                    case 3:
                        limpiarPantalla();
                        SistemaLineal.calcularSistemaEcuaciones();
                        break;
                    case 4:
                        limpiarPantalla();
                        //opciones Cris
                        break;
                    case 5:
                        limpiarPantalla();
                        System.out.println("Saliendo del programa.....");
                        break;
                        
                    default:
                        limpiarPantalla();
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        break;
                }
            } catch (Exception e) {
                limpiarPantalla();
                System.out.println("Error: Ingrese un número entero válido.");
                scanner.next();
                opcionPrincipal = 0;
            }

        } while (opcionPrincipal != 5);
        scanner.close();
    }

    public static void limpiarPantalla() {
        String os = System.getProperty("os.name").toLowerCase();
        try {
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Unix, Linux, macOS, etc.
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error al limpiar la pantalla");
        }
    }
}