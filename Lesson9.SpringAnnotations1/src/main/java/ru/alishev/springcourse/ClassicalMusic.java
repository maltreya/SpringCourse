package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {

    public void doMyInit(){
        System.out.println("Doing my initilazition");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    public void doMyDestroy(){
        System.out.println("Doing my destraction");
    }
}
