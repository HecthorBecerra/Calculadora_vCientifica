import java.util.Scanner;


public class OperacionesAritmeticas {

    public void realizarOperaciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        double mayor = Math.max(num1, num2);
        double menor = Math.min(num1, num2);
        double potencia = Math.pow(num1, num2);

        System.out.println("Ingrese el porcentaje a calcular de su primer numero: ");
        double porcentaje = scanner.nextDouble();
        double resultadoPorcentaje = calcularPorcentaje(porcentaje, num1);

        imprimirResultados(suma, resta, multiplicacion, division, mayor, menor, potencia, resultadoPorcentaje);
        scanner.close();
    }

    public double calcularPorcentaje(double porcentaje, double num1) {
        return (porcentaje / 100) * num1;
    }


    public void imprimirResultados(double suma, double resta, double multiplicacion, double division, double mayor, double menor, double potencia, double resultadoPorcentaje) {
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
