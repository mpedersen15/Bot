package com.mpedersen15;

public class Main {

    public static void main(String[] args) {
        JokeBot myJoker = new JokeBot("Ryan Pedersen", JokeWriter.getJokeListOne());

        myJoker.tellRandomJoke();

	    ComedianBot myComedian = new ComedianBot("Matt Pederse", JokeWriter.getJokeListTwo());

	    myComedian.performShow();
    }
}
