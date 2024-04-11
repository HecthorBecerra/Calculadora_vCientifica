public class sistemaLineal {
    // Calcula determinante 2x2
    public static double det(double a, double b, double c, double d){
        return a*d - b*c;
    }

    public static double[] calcularSoluciones(double a,double b,double c,double d,double e,double f){
        double detA = det(a, b, d, e);
        double y = det(a, c, d, f) / detA;
        double x = det(c, b, f, e) / detA;
        return new double[]{x, y};
    }

    public static void imprimirSoluciones(double[] sol) {
        System.out.printf("x = %.4f y = %.4f", sol[0], sol[1]);
    }

    public static boolean tieneInfinitas(double a,double b,double c,double d,double e,double f){
        double det1 = det(a,c,d,f);
        double det2 = det(b,c,e,f);
        return det1 == 0 && det2 == 0;
    }

    public static void imprimirCasosExepcional(double a, double b, double c, double d, double e, double f){
        if(tieneInfinitas(a,b,c,d,e,f))
            System.out.println("El sistema tiene infinitas soluciones");
        else
            System.out.println("El sistema no tiene solucion");
    }

    public static void copiarEnmain(double a, double b, double c, double d, double e, double f){
        double det = det(a,b,d,e);
        if(det != 0){
            double[] soluciones = calcularSoluciones(a, b, c, d, e, f);
            imprimirSoluciones(soluciones);
        }else{
            imprimirCasosExepcional(a, b, c, d, e, f);
        }
    }
}
