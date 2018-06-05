import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperacionesArtimeticasTest {

    @Test
    public void verificarSuma(){
        int a = 1;
        int b = 1;
        assertEquals(2, OperacionesArtimeticas.suma(a,b));
    }

}
