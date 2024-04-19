import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class OperacionesAritmeticasTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testEntradaDeLetra(){
        String input = "a";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        OperacionesAritmeticas operacionesAritmeticas = new OperacionesAritmeticas();
        Scanner scanner = new Scanner(System.in);

        double resultadoActual = operacionesAritmeticas.pedirNumero("Ingrese el primer número: ", scanner);

        double expectedResult = 0.0;
        assertEquals(expectedResult, resultadoActual, 0.0001);
    }

    @Test
    public void testEntradaDeNumero(){
        String input = "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        OperacionesAritmeticas operacionesAritmeticas = new OperacionesAritmeticas();
        Scanner scanner = new Scanner(System.in);

        double resultadoActual = operacionesAritmeticas.pedirNumero("Ingrese el primer número: ", scanner);

        double expectedResult = 2.0;
        assertEquals(expectedResult, resultadoActual, 0.0001);
    }

    @Test
    void manejarOpcionResta() {
        InputStream in = new ByteArrayInputStream("-2\n-5".getBytes());
        System.setIn(in);

        OperacionesAritmeticas operacionesAritmeticas = new OperacionesAritmeticas();
        Scanner scanner = new Scanner(System.in);

        operacionesAritmeticas.manejarOpcion(2, scanner);
        double expectedResult = 3.0;
        double actualResult = operacionesAritmeticas.restar(-2.0, -5.0);
        assertEquals(expectedResult, actualResult, 0.0001);

    }
}