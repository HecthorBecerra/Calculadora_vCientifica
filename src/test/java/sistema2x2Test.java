import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sistema2x2Test {

    @Test
    void det() {
        assertEquals(sistema2x2.det(1,2,3,4), -2);
        assertEquals(sistema2x2.det(0,0,0,0), 0);
    }

    @Test
    void calcularSoluciones() {
        assertArrayEquals(sistema2x2.calcularSoluciones(1,-1,1,1,1,1), new double[]{1,0});
        assertArrayEquals(sistema2x2.calcularSoluciones(1,-1,2,3,1,2), new double[]{1,-1});
    }

    @Test
    void imprimirSolucionSistema() {
    }

    @Test
    void tieneInfinitas() {
        assertTrue(sistema2x2.tieneInfinitas(1,1,1,4,4,4));
        assertFalse(sistema2x2.tieneInfinitas(1,1,1,4,4,5));
    }

    @Test
    void imprimirCasosExepcional() {
    }

}