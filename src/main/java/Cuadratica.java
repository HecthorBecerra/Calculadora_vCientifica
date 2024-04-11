public class Cuadratica {

    public double discriminante(double A, double B, double C){
        return Math.pow(B, 2) - 4 * A * C;
    }
    public double[] raicesReales(double A, double B, double C){
        double[] raices = new double[2];
        double discriminante = discriminante(A, B, C);
        raices[0] = (-B + Math.sqrt(discriminante)) / (2 * A);
        raices[1] = (-B - Math.sqrt(discriminante)) / (2 * A);
        return raices;
    }
}
