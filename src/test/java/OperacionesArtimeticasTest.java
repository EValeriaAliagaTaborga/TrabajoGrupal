import org.junit.Test;

import static org.junit.Assert.assertEquals;

import junit.framework.Assert;
import org.junit.Test;

import org.junit.Test;

import junit.framework.Assert;

public class OperacionesArtimeticasTest {
  @Test
  public void testDiv(){
    int expected = 0;
    int actual = OperacionesArtimeticas.div(20,0);

    Assert.assertEquals(expected, actual);
  }
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
