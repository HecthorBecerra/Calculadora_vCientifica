import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;


class OperacionesAritmeticasTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testEntradaDeLetra() {
        String entradaUsuario = "a\n";
        InputStream inputStream = new ByteArrayInputStream(entradaUsuario.getBytes());
        System.setIn(inputStream);
        OperacionesAritmeticas operaciones = new OperacionesAritmeticas();
        operaciones.realizarOperaciones();
    }
}