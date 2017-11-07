package com.mpedersen15;

/**
 * Created by Matt on 11/6/2017.
 */
public class Bot {
    public final String creator = "Matt Pedersen";
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bot(String name) {

        this.name = name;
    }

    public void talk(String words) {
        System.out.println(words);
    }
}
