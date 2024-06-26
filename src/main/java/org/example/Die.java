package org.example;

import java.util.Random;

/**
 * Lerdphipat Kanjanarungroj
 * 6510450917
 */

public class Die {
    public int faceValue;
    Die(){
        roll();
    }
    public void roll(){
        faceValue = new Random().nextInt(6)+1;
    }

    public int getFaceValue(){
        return faceValue;
    }

}
