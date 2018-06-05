import junit.framework.Assert;
import org.junit.Test;

public class OperacionesArtimeticasTest {
    @Test
    public void verificarPotencia() {
        int a=2;
        int b=2;
        int expectedResults= 4;
        int actualResults = OperacionesArtimeticas.potencia(a,b);
        Assert.assertEquals(expectedResults,actualResults);
    }

}
