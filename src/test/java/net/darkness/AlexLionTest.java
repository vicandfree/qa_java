package net.darkness;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {
    @Spy
    private final Feline feline = new Feline();

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void checkGetFriendsMethodReturn() throws Exception {
        AlexLion alex = new AlexLion(feline);

        Map<String, String> expectedFriends = new HashMap<>() {{
            put("Зебра", "Марти");
            put("Бегемотиха", "Глория");
            put("Жираф", "Мелман");
        }};

        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    public void checkGetPlaceOfLivingMethodReturn() throws Exception {
        AlexLion alex = new AlexLion(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void checkGetKittensMethodReturn() throws Exception {
        AlexLion alex = new AlexLion(feline);
        assertEquals(0, alex.getKittens());
    }
}