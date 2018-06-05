import org.junit.Assert;
import org.junit.Test;

public class OperacionesArtimeticasTest {

    @Test
    public void verificarMultiplicacion(){
        int expectedResult = 140;

        int actualResult = (new OperacionesArtimeticas()).multiplicar(28,5);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
