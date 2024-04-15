import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sistemaLinealTest {

    @Test
    void det() {
        assertEquals(sistemaLineal.det(new double[][]{{1,2},{3,4}}), -2);
        assertEquals(sistemaLineal.det(new double[][]{{0,0},{0,0}}), 0);
    }

    @Test
    void calcularSoluciones() {
        assertArrayEquals(sistemaLineal.calcularSoluciones(new double[][]{{1,-1},{1,1}},new double[]{1,1}), new double[]{1,0});
        assertArrayEquals(sistemaLineal.calcularSoluciones(new double[][]{{1,-1},{3,1}},new double[]{2,2}), new double[]{1,-1});
    }

    @Test
    void tieneInfinitas() {
        assertTrue(sistemaLineal.tieneInfinitas(new double[][]{{1,1},{4,4}},new double[]{1,4}));
        assertFalse(sistemaLineal.tieneInfinitas(new double[][]{{1,1},{4,4}},new double[]{1,5}));
    }

}