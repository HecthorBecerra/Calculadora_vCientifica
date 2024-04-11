import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sistemaLinealTest {

    @Test
    void det() {
        assertEquals(sistemaLineal.det(1,2,3,4), -2);
        assertEquals(sistemaLineal.det(0,0,0,0), 0);
    }

    @Test
    void calcularSoluciones() {
        assertArrayEquals(sistemaLineal.calcularSoluciones(1,-1,1,1,1,1), new double[]{1,0});
        assertArrayEquals(sistemaLineal.calcularSoluciones(1,-1,2,3,1,2), new double[]{1,-1});
    }

    @Test
    void imprimirSolucionSistema() {
    }

    @Test
    void tieneInfinitas() {
        assertTrue(sistemaLineal.tieneInfinitas(1,1,1,4,4,4));
        assertFalse(sistemaLineal.tieneInfinitas(1,1,1,4,4,5));
    }

    @Test
    void imprimirCasosExepcional() {
    }

}