package com.mpedersen15;

public class Main {

    public static void main(String[] args) {
	    ComedianBot myComedian = new ComedianBot("Matt Pederse", JokeWriter.getJokeListOne());

	    myComedian.performShow();
    }
}
