/**
 * 
 */

package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;


/**
 * @author a
 * 
 */
public class HelloWorldTest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {}

    @Test
    public void firstTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void secondTest() {
        Assert.assertTrue(true);
    }

    @Ignore
    public void thirdTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void fourthTest() {
        Assert.assertTrue(true);
    }

}
