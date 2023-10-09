package net.darkness;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;

    @Test
    public void checkGetSoundMethodReturn() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void checkGetFoodMethodCalled() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();

        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}