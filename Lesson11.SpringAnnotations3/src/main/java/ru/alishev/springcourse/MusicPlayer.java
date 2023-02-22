package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Neil Alishev
 */

public class MusicPlayer {
    private List<Music> listMusic = new ArrayList<>();


    public MusicPlayer(List<Music> listMusic){
        this.listMusic = listMusic;
    }

    public String playMusic() {
        Random random = new Random();

        return "Playing: " + listMusic.get(random.nextInt(listMusic.size())).getSong();
    }
}
