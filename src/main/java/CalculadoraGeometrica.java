import java.util.Scanner;

public class CalculadoraGeometrica {

    public void ejecutarMenuGeometrico(Scanner scanner) {
        while (true) {
            imprimirOpcionesGeometricas();
            try {
                int opcion = scanner.nextInt();
                if (opcion == 7) {
                    break;
                }
                manejarOpcionGeometrica(opcion, scanner);
            } catch (Exception e) {
                System.out.println("Error: Ingrese un número entero válido.");
                scanner.next();
            }
        }
    }

    public void imprimirOpcionesGeometricas() {
        System.out.println("Seleccione la figura geométrica para realizar cálculos:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Círculo");
        System.out.println("4. Esfera");
        System.out.println("5. Cubo");
        System.out.println("6. Cono");
        System.out.println("7. Volver al menú principal");
    }

    public void manejarOpcionGeometrica(int opcion, Scanner scanner) {
        try {
            switch (opcion) {
                case 1:
                    MenuPrincipal.limpiarPantalla();
                    calcularCuadrado(scanner);
                    break;
                case 2:
                    MenuPrincipal.limpiarPantalla();
                    calcularRectangulo(scanner);
                    break;
                case 3:
                    MenuPrincipal.limpiarPantalla();
                    calcularCirculo(scanner);
                    break;
                case 4:
                    MenuPrincipal.limpiarPantalla();
                    calcularEsfera(scanner);
                    break;
                case 5:
                    MenuPrincipal.limpiarPantalla();
                    calcularCubo(scanner);
                    break;
                case 6:
                    MenuPrincipal.limpiarPantalla();
                    calcularCono(scanner);
                    break;
                case 7:
                    MenuPrincipal.limpiarPantalla();
                    scanner.close();
                    System.exit(0);
                default:
                    MenuPrincipal.limpiarPantalla();
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } catch (Exception e) {
            MenuPrincipal.limpiarPantalla();
            System.out.println("Ha ocurrido un error, por favor intente de nuevo. " + e.getMessage());
        }
    }

    public void calcularCuadrado(Scanner scanner) {
        double lado = pedirNumero("Ingrese el lado del cuadrado: ", scanner);
        double perimetro = calcularPerimetroCuadrado(lado);
        double area = calcularAreaCuadrado(lado);
        System.out.println("Perímetro del cuadrado: " + perimetro);
        System.out.println("Área del cuadrado: " + area);
    }

    public void calcularRectangulo(Scanner scanner) {
        double largo = pedirNumero("Ingrese el largo del rectángulo: ", scanner);
        double ancho = pedirNumero("Ingrese el ancho del rectángulo: ", scanner);
        double perimetro = calcularPerimetroRectangulo(largo, ancho);
        double area = calcularAreaRectangulo(largo, ancho);
        System.out.println("Perímetro del rectángulo: " + perimetro);
        System.out.println("Área del rectángulo: " + area);
    }

    public void calcularCirculo(Scanner scanner) {
        double radio = pedirNumero("Ingrese el radio del círculo: ", scanner);
        double perimetro = calcularPerimetroCirculo(radio);
        double area = calcularAreaCirculo(radio);
        System.out.println("Perímetro del círculo: " + perimetro);
        System.out.println("Área del círculo: " + area);
    }

    public void calcularEsfera(Scanner scanner) {
        double radio = pedirNumero("Ingrese el radio de la esfera: ", scanner);
        double volumen = calcularVolumenEsfera(radio);
        System.out.println("Volumen de la esfera: " + volumen);
    }

    public void calcularCubo(Scanner scanner) {
        double lado = pedirNumero("Ingrese el lado del cubo: ", scanner);
        double volumen = calcularVolumenCubo(lado);
        System.out.println("Volumen del cubo: " + volumen);
    }

    public void calcularCono(Scanner scanner) {
        double radio = pedirNumero("Ingrese el radio de la base del cono: ", scanner);
        double altura = pedirNumero("Ingrese la altura del cono: ", scanner);
        double volumen = calcularVolumenCono(radio, altura);
        System.out.println("Volumen del cono: " + volumen);
    }

    public double pedirNumero(String mensaje, Scanner scanner) {
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    public static double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetroRectangulo(double largo, double ancho) {
        return 2 * (largo + ancho);
    }

    public static double calcularAreaRectangulo(double largo, double ancho) {
        return largo * ancho;
    }

    public static double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularVolumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    public static double calcularVolumenCubo(double lado) {
        return Math.pow(lado, 3);
    }

    public static double calcularVolumenCono(double radio, double altura) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
    }
}
