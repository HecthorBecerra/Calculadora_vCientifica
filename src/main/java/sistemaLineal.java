public class sistemaLineal {
    // Calcula determinante 2x2
    public static double det(double[][] M){
        return M[0][0]*M[1][1] - M[0][1]*M[1][0];
    }

    public static double[] calcularSoluciones(double[][] A, double[] B){
        double detA = det(A);
        double[][] craX = {
            {B[0], A[0][1]},
            {B[1], A[1][1]}
        };
        double[][] craY = {
            {A[0][0],B[0]},
            {A[1][0],B[1]}
                        };
        double x = det(craX) / detA;
        double y = det(craY) / detA;
        return new double[]{x, y};
    }

    public static void imprimirSoluciones(double[] sol) {
        System.out.printf("x = %.4f y = %.4f", sol[0], sol[1]);
    }

    public static boolean tieneInfinitas(double[][] A, double[] B){
        double[][] M1 ={
            {A[0][0],B[0]},
            {A[1][0],B[1]}
        };
        double[][] M2 ={
            {A[0][1],B[0]},
            {A[1][1],B[1]}
        };
        double detM1 = det(M1);
        double detM2 = det(M2);
        return detM1 == 0 && detM2 == 0;
    }

    public static void imprimirCasosExepcional(double[][] A, double[] B){
        if(tieneInfinitas(A, B))
            System.out.println("El sistema tiene infinitas soluciones");
        else
            System.out.println("El sistema no tiene solucion");
    }

    public static void copiarEnmain(double[][] A, double[] B){
        double detA = det(A);
        if(detA != 0){
            double[] soluciones = calcularSoluciones(A, B);
            imprimirSoluciones(soluciones);
        }else{
            imprimirCasosExepcional(A, B);
        }
    }
}
