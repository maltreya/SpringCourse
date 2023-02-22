package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class RockMusic implements Music {
    private List<String> listRockMusic = new ArrayList<>();
    {
        listRockMusic.add("The Cure");
        listRockMusic.add("In Flames");
        listRockMusic.add("Wind cries Mary");
    }
    @Override
    public List<String> getSong() {
        return listRockMusic;
    }
}
