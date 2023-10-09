package net.darkness;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private final Feline feline = new Feline();

    @Test
    public void checkGetFoodMethodCalled() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void checkGetFamilyMethodReturn() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void checkGetKittensWithParameterReturn() {
        Assert.assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void checkGetKittensWithoutParameterReturn() {
        Assert.assertEquals(1, feline.getKittens());
    }
}