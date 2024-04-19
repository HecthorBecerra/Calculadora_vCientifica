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
            double[] raices = formulaCuadratica(A, B, C);
            System.out.println("Raices reales: " + raices[0] + " y " + raices[1]);
        } else if(discriminante == 0){
            System.out.println("LA ecuacion tiene Raices reales e iguales");
            double[] raices = calcularRaicesIguales(A, B);
            System.out.println("Raices iguales: " + raices[0] + " y " + raices[1]);
        } else {
            System.out.println("La ecuacion tiene Raices complejas");
            String[] raices = calcularRaicesComplejas(A, B, C);
            System.out.println("Raices complejas: " + raices[0] + " y " + raices[1]);
        }
    }
    public String[] calcularRaicesComplejas(double A, double B, double C){
        double discriminante = discriminante(A, B, C);
        double parteReal = -B;
        double parteImaginaria = Math.sqrt(Math.abs(discriminante)) / (2 * A);
        String[] raices = new String[2];
        Complejo raiz1 = new Complejo(parteReal, parteImaginaria);
        raices[0] = raiz1.toString();
        raices[1] = raiz1.conjugado().toString();
        return raices;
    }
    public void mostrarRaices(double A, double B, double C){
        if(esCuadratica(A)){
            determinarTipoSolucion(A, B, C);
        } else {
            System.out.println("No es una ecuacion cuadratica");
        }
    }
}
