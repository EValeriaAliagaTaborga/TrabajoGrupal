import org.junit.Test;

import junit.framework.Assert;

public class OperacionesArtimeticasTest {
  @Test
  public void testDiv(){
    int expected = 0;
    int actual = OperacionesArtimeticas.div(20,0);

    Assert.assertEquals(expected, actual);
  }

}
