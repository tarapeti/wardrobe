package com.codecool;

public class ClipHanger extends Hanger {
    
    Cloth clip;

    public ClipHanger(Cloth top, Cloth clip) {
        super(top);
        this.clip = clip;
    }

    public Cloth getClip() {
        return clip;
    }

    public void setClip(Cloth clip) {
        this.clip = clip;
    }

}
