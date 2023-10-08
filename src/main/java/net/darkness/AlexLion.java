package net.darkness;

import java.util.*;

public class AlexLion extends Lion {

    public AlexLion(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public Map<String, String> getFriends() {
        Map<String, String> friends = new HashMap<>();

        friends.put("Зебра", "Марти");
        friends.put("Бегемотиха", "Глория");
        friends.put("Жираф", "Мелман");

        return friends;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}