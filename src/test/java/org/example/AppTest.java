package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void _18_x_18_should_be_324(){
        Rectangle rec = new Rectangle();
        rec.setHeight(18);
        rec.setWidth(18);
        Assert.assertEquals(324, rec.getArea(),0);

    }
}
