package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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
