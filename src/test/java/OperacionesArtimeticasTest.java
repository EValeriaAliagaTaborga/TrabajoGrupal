import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperacionesArtimeticasTest {

  @Test
  public void testDiv(){
    int expected = 0;
    int actual = OperacionesArtimeticas.div(20,0);

    assertEquals(expected, actual);
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
        assertEquals(expectedResults,actualResults);
    }

    @Test
    public void verificarMultiplicacion(){
        int expectedResult = 140;

        int actualResult = (new OperacionesArtimeticas()).multiplicar(28,5);

        assertEquals(expectedResult, actualResult);
    }

}
