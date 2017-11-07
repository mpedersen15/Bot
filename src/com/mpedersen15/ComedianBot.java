package com.mpedersen15;

import java.util.ArrayList;

/**
 * Created by Matt on 11/6/2017.
 */
public class ComedianBot extends JokeBot {
    public ComedianBot(String name, ArrayList<Joke> jokes) {
        super(name, jokes);
    }

    public void performShow() {
        sayIntroduction();
        for (Joke joke : jokes ) {
            sayJoke(joke);
        }
        sayGoodnight();
    }

    public void sayIntroduction() {
        System.out.println("Hello, my name is " + this.name + ", and I'm here to make you laugh!");
    }

    public void sayGoodnight() {
        System.out.println("Thank you all, you've been a great audience! Goodnight!");
    }
}
