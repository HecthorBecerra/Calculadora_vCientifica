import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sistemaLinealTest {

    @Test
    void det() {
        assertEquals(SistemaLineal.det(new double[][]{{1,2},{3,4}}), -2);
        assertEquals(SistemaLineal.det(new double[][]{{0,0},{0,0}}), 0);
    }

    @Test
    void calcularSoluciones() {
        assertArrayEquals(SistemaLineal.calcularSoluciones(new double[][]{{1,-1},{1,1}},new double[]{1,1}), new double[]{1,0});
        assertArrayEquals(SistemaLineal.calcularSoluciones(new double[][]{{1,-1},{3,1}},new double[]{2,2}), new double[]{1,-1});
    }

    @Test
    void tieneInfinitas() {
        assertTrue(SistemaLineal.tieneInfinitas(new double[][]{{1,1},{4,4}},new double[]{1,4}));
        assertFalse(SistemaLineal.tieneInfinitas(new double[][]{{1,1},{4,4}},new double[]{1,5}));
    }

}