package com.mpedersen15;

/**
 * Created by Matt on 11/6/2017.
 */
public class Joke {
    private String jokeSetup;
    private String jokePunchline;

    public Joke(String jokeSetup, String jokePunchline) {
        this.jokeSetup = jokeSetup;
        this.jokePunchline = jokePunchline;
    }

    public String getJokeSetup() {

        return jokeSetup;
    }

    public void setJokeSetup(String jokeSetup) {
        this.jokeSetup = jokeSetup;
    }

    public String getJokePunchline() {
        return jokePunchline;
    }

    public void setJokePunchline(String jokePunchline) {
        this.jokePunchline = jokePunchline;
    }
}
