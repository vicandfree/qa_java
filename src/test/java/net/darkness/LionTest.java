package net.darkness;

import org.junit.*;
import org.mockito.*;

public class LionTest {
    private final Feline feline = Mockito.mock(Feline.class);

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void checkGetKittensMethodCalled() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();

        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void checkGetFoodMethodCalled() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();

        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void checkExceptionThrownOnInvalidSex() {
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("Invalid", feline));
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}