


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KeyPadPressTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KeyPadPressTest
{
    KeyPad kp ;
    
    /**
     * Default constructor for test class KeyPadPressTest
     */
    public KeyPadPressTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        kp = new KeyPad() ;
    }


    @Test
    public void testOne()
    {
        // Press 1
        kp.touch(1,5);
        // Assertion (Replace with appropriate test)
        assertEquals( "1", kp.lastKey());
    }

   @Test
    public void testTwo()
    {
kp.touch(2,5);
        // Assertion (Replace with appropriate test)
        assertEquals( "2", kp.lastKey() );
    }

   @Test
    public void testThree()
    {
        kp.touch(3,5);
        // Assertion (Replace with appropriate test)
        assertEquals( "3", kp.lastKey() );
    }

   @Test
    public void testFour()
    {
        kp.touch(1,6);
        // Assertion (Replace with appropriate test)
        assertEquals( "4", kp.lastKey() );
    }

   @Test
    public void testFive()
    {
        kp.touch(2,6);
        // Assertion (Replace with appropriate test)
        assertEquals( "5", kp.lastKey() );
    }

   @Test
    public void testSix()
    {
        kp.touch(3,6);
        // Assertion (Replace with appropriate test)
        assertEquals( "6", kp.lastKey() );
    }

   @Test
    public void testSeven()
    {
        kp.touch(1,7);
        // Assertion (Replace with appropriate test)
        assertEquals( "7", kp.lastKey() );
    }

   @Test
    public void testEight()
    {
        kp.touch(2,7);
        // Assertion (Replace with appropriate test)
        assertEquals( "8", kp.lastKey() );
    }

   @Test
    public void testNine()
    {
        kp.touch(3,7);
        // Assertion (Replace with appropriate test)
        assertEquals( "9", kp.lastKey() );
    }

   @Test
    public void testZero()
    {
        kp.touch(2,8);
        // Assertion (Replace with appropriate test)
        assertEquals( "0", kp.lastKey() );
    }

   @Test
    public void testBackspace()
    {
        kp.touch(3,8);
        // Assertion (Replace with appropriate test)
        assertEquals( "X", kp.lastKey() );
    }

   @Test
    public void testNoKey()
    {
        kp.touch(1,8);
        // Assertion (Replace with appropriate test)
        assertEquals( " ", kp.lastKey() );
    }


    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
