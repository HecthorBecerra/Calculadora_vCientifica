import java.util.Scanner;

public class OperacionesAritmeticas {

    public void realizarOperaciones() {
        Scanner scanner = new Scanner(System.in);
        double num1 = pedirNumero("Ingrese el primer número: ", scanner);
        double num2 = pedirNumero("Ingrese el segundo número: ", scanner);

        double suma = sumar(num1, num2);
        double resta = restar(num1, num2);
        double multiplicacion = multiplicar(num1, num2);
        double division = dividir(num1, num2);
        double mayor = determinarMayor(num1, num2);
        double menor = determinarMenor(num1, num2);
        double potencia = calcularPotencia(num1, num2);

        double porcentaje = pedirNumero("Ingrese el porcentaje a calcular de su primer número: ", scanner);
        double resultadoPorcentaje = calcularPorcentaje(porcentaje, num1);

        imprimirResultados(suma, resta, multiplicacion, division, mayor, menor, potencia, resultadoPorcentaje);
        scanner.close();
    }

    private double pedirNumero(String mensaje, Scanner scanner) {
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    private double sumar(double num1, double num2) {
        return num1 + num2;
    }

    private double restar(double num1, double num2) {
        return num1 - num2;
    }

    private double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    private double dividir(double num1, double num2) {
        return num1 / num2;
    }

    private double determinarMayor(double num1, double num2) {
        return Math.max(num1, num2);
    }

    private double determinarMenor(double num1, double num2) {
        return Math.min(num1, num2);
    }

    private double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    private double calcularPorcentaje(double porcentaje, double num) {
        return (porcentaje / 100) * num;
    }

    private void imprimirResultados(double suma, double resta, double multiplicacion, double division, double mayor, double menor, double potencia, double resultadoPorcentaje) {
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("La multiplicación de los números es: " + multiplicacion);
        System.out.println("La división de los números es: " + division);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("La potencia de los números es: " + potencia);
        System.out.println("El porcentaje de " + resultadoPorcentaje);
    }
}
