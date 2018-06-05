import org.junit.Test;

import static org.junit.Assert.assertEquals;

import junit.framework.Assert;
import org.junit.Test;

public class OperacionesArtimeticasTest {

    @Test
    public void verificarSuma(){
        int a = 1;
        int b = 1;
        assertEquals(2, OperacionesArtimeticas.suma(a,b));
    }
    @Test
    public void verificarPotencia() {
        int a=2;
        int b=2;
        int expectedResults= 4;
        int actualResults = OperacionesArtimeticas.Potencia(a,b);
        Assert.assertEquals(expectedResults,actualResults);
    }

}
