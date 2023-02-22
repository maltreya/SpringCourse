package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {
    private List<String> listClassicalMusic = new ArrayList<>();
    {
        listClassicalMusic.add("Sonata 8");
        listClassicalMusic.add("Hungarian Rhapsody");
        listClassicalMusic.add("Grig - Morning");
    }
    @Override
    public List<String> getSong() {
        return listClassicalMusic;
    }
}
