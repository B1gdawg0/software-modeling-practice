package org.example;

public class Square {
    public String name;
    public int index;
    Square(String name, int index){
        this.name = name;
        this.index = index;
    }

    public int getIndex(){
        return  index;
    }

    public String getName() {
        return name;
    }
}
