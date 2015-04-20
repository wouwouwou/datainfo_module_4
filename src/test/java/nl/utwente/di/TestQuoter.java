package nl.utwente.di;

import org.junit.Test;
import org.junit.Assert;

/**
 * @author Wouter Bos
 * @since 20-4-15
 */
public class TestQuoter {
    @Test
    public void testBook1() throws Exception{
        Quoter quoter = new Quoter();
        double price = quoter.getBookPrice("1");
        Assert.assertEquals("Priceofbook1", 10.0, price, 0.0);
    }
}
