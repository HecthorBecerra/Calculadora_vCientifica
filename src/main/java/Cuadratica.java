public class Cuadratica {

    public double discriminante(double A, double B, double C){
        return Math.pow(B, 2) - 4 * A * C;
    }
    public double[] formulaCuadratica(double A, double B, double C){
        double[] raices = new double[2];
        double discriminante = discriminante(A, B, C);
        raices[0] = (-B + Math.sqrt(discriminante)) / (2 * A);
        raices[1] = (-B - Math.sqrt(discriminante)) / (2 * A);
        return raices;
    }
    public double[] calcularRaicesIguales(double A, double B){
        double[] raices = new double[2];
        raices[0] = -B / (2 * A);
        raices[1] = raices[0];
        return raices;
    }
    public boolean esCuadratica(double A){
        return A != 0;
    }
    public void determinarTipoSolucion(double A, double B, double C){
        double discriminante = discriminante(A, B, C);
        if(discriminante > 0){
            System.out.println("La ecuacion tiene Raices reales y diferentes");
        } else if(discriminante == 0){
            System.out.println("LA ecuacion tiene Raices reales e iguales");
        } else {
            System.out.println("La ecuacion tiene Raices complejas");
        }
    }
}
