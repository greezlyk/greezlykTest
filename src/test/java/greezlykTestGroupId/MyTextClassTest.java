package greezlykTestGroupId;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MyTextClassTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MyTextClassTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MyTextClassTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testRandomNumer()
    {
    	MyTextClass myTest = new MyTextClass();
    			String result = myTest.getRandomNumber();
        
    			assertTrue( true );
    			assertNotNull(result);
    			assertTrue(!result.isEmpty());
    			
    			
    }
}
