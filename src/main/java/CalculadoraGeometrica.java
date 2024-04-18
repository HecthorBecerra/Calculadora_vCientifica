public class CalculadoraGeometrica {

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
