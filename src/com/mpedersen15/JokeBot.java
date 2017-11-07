package com.mpedersen15;

import java.util.ArrayList;

/**
 * Created by Matt on 11/6/2017.
 */
public class JokeBot extends Bot {
    public ArrayList<Joke> jokes;

    public JokeBot(String name, ArrayList<Joke> jokes) {
        super(name);
        this.jokes = jokes;
    }

    public void tellRandomJoke() {
        int randomIndex = (int) (Math.random()*jokes.size());

        sayJoke(jokes.get(randomIndex));
    }

    public void sayJoke(Joke joke){
        talk(joke.getJokeSetup() + " " + joke.getJokePunchline());
    }
}
