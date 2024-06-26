import java.util.Scanner;

public class OperacionesAritmeticas {

    public void ejecutarMenu(Scanner scanner) {
        int opcion;
        do {
            imprimirOpciones();
            try {
                opcion = scanner.nextInt();
                if (opcion == 9) {
                    break;
                }
                manejarOpcion(opcion, scanner);
            } catch (Exception e) {
                System.out.println("Error: Ingrese un número entero válido.");
                scanner.next();
                opcion = 0;
            }
        } while (opcion != 9);
    }

    public void imprimirOpciones() {
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Determinar mayor");
        System.out.println("6. Determinar menor");
        System.out.println("7. Calcular potencia");
        System.out.println("8. Calcular porcentaje");
        System.out.println("9. Volver al menú principal");
    }

    public void manejarOpcion(int opcion, Scanner scanner) {
        try {
            double num1 = pedirNumero("Ingrese el primer número: ", scanner);
            double num2 = pedirNumero("Ingrese el segundo número: ", scanner);
            double resultado;

            switch (opcion) {
                case 1:
                MenuPrincipal.limpiarPantalla();
                    resultado = sumar(num1, num2);
                    break;
                case 2:
                    MenuPrincipal.limpiarPantalla();
                    resultado = restar(num1, num2);
                    break;
                case 3:
                    MenuPrincipal.limpiarPantalla();
                    resultado = multiplicar(num1, num2);
                    break;
                case 4:
                    MenuPrincipal.limpiarPantalla();
                    resultado = dividir(num1, num2);
                    break;
                case 5:
                    MenuPrincipal.limpiarPantalla();
                    resultado = determinarMayor(num1, num2);
                    break;
                case 6:
                    MenuPrincipal.limpiarPantalla();
                    resultado = determinarMenor(num1, num2);
                    break;
                case 7:
                    MenuPrincipal.limpiarPantalla();
                    resultado = calcularPotencia(num1, num2);
                    break;
                case 8:
                    MenuPrincipal.limpiarPantalla();
                    double porcentaje = pedirNumero("Ingrese el porcentaje a calcular: ", scanner);
                    resultado = calcularPorcentaje(porcentaje, num1);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    return;
            }

            System.out.println("El resultado de la operación es: " + resultado+"\n");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error, por favor intente de nuevo. " + e.getMessage()+"\n");
        }
    }

    public double pedirNumero(String mensaje, Scanner scanner) {
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        return num1 / num2;
    }

    public double determinarMayor(double num1, double num2) {
        return Math.max(num1, num2);
    }

    public double determinarMenor(double num1, double num2) {
        return Math.min(num1, num2);
    }

    public double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double calcularPorcentaje(double porcentaje, double num) {
        return (porcentaje / 100) * num;
    }
}