package tech.valery;

import org.junit.Assert;
import org.junit.Test;

public class SingletoneTest {

    @Test
    public void SimpleSingletonShouldBeOnlyOne(){
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        SimpleSingleton simpleSingleton2 = SimpleSingleton.getInstance();

        Assert.assertTrue(simpleSingleton == simpleSingleton2);
    }

    @Test
    public void DoubleCheckSingletonShouldBeNonInitialized_BeforeMethodCall() {

        Assert.assertFalse(DCSingleton.isInitialized());
        DCSingleton instance1 = DCSingleton.getInstance();
        Assert.assertTrue(DCSingleton.isInitialized());
    }
}
