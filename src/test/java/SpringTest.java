import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class SpringTest {

    @Test
    public void testDisplay() {

        Display display = new Display();
        display.setName("Sankar");
        /*Assert.assertTrue(display.getName().contains("sankar"));*/
        /*assertThat(1,is(equalTo(1)));*/
        /*assertThat(display.getName(), is(not(isEmptyString())));*/


    }

}
