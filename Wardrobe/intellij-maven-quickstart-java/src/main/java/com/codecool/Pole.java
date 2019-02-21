package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Pole extends Wardrobe{

    List<Hanger> hangers;
    List<ClipHanger> clipHangers;

    public Pole(List<Hanger> hangers, List<ClipHanger> clipHangers) {
        this.hangers = hangers;
        this.clipHangers = clipHangers;
    }

    public List<Hanger> getHangers() {
        return hangers;
    }

    public List<ClipHanger> getClipHangers() {
        return clipHangers;
    }

    public void setHangers(List<Hanger> hangers) {
        this.hangers = hangers;
    }

    public void setClipHangers(List<ClipHanger> clipHangers) {
        this.clipHangers = clipHangers;
    }

}
