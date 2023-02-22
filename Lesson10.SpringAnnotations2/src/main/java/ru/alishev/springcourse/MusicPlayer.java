package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(Genre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (genre == Genre.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
    }
}
