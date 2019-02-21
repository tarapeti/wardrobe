package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    //kulon kell ruhafajtara, ami lekezeli a ruhafajtat, utana ha van meg sima akkor arra, ha nincs akkor clipperesre

    public Wardrobe(){
    }

    public ClipHanger getCHforCloth(Pole pole) throws NoEmptyHangersException{

        List<ClipHanger> emptyClipHangers = new ArrayList<>();

        List<ClipHanger> chs = pole.getClipHangers();
        for (ClipHanger ch : chs){
            if (ch.getClip() == null){
                emptyClipHangers.add(ch);
            }
        }
        if (emptyClipHangers.size() == 0){
            throw new NoEmptyHangersException("No empty hangers...");
        }
        return emptyClipHangers.get(0);
    }

    public Hanger getHforCloth(Pole pole) throws NoEmptyHangersException {

        List<Hanger> emptyHangers = new ArrayList<>();

        List<Hanger> hangers = pole.getHangers();
        for (Hanger hanger : hangers) {
            if (hanger.getTop() == null) {
                emptyHangers.add(hanger);
            }
        }
        if (emptyHangers.size() == 0){
            throw new NoEmptyHangersException("No empty hangers...");
        }
        return emptyHangers.get(0);
    }
}
