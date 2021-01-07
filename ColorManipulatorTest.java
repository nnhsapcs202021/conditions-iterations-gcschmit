

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.awt.Color;

/**
 * The test class ColorManipulatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ColorManipulatorTest
{
    /**
     * Default constructor for test class ColorManipulatorTest
     */
    public ColorManipulatorTest()
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
    
    @Test
    public void testGrayscale()
    {
        Picture picture= new Picture( "Schmit.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        manipulator.grayscale();
        Pixel testPixel= picture.getPixel(10, 50);
        assertEquals(45, testPixel.getRed());
        assertEquals(45, testPixel.getBlue());
        assertEquals(45, testPixel.getGreen());
        
    }
}
