package com.codecool;

import javax.sound.sampled.Clip;
import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NoEmptyHangersException {

        Cloth cloth = new Cloth("polo", "clip");
        Cloth cloth1 = new Cloth("gatya", "hang");

        ClipHanger ch = new ClipHanger(null, cloth1);
        Hanger h = new Hanger(cloth);

        Cloth clip = ch.getClip();

        System.out.println(clip);

        Cloth top = h.getTop();

        System.out.println(top);



        List<Hanger> hangers = new ArrayList<>(10);
        for (int i = 0; i < 10 ; i++) {
            hangers.add(new Hanger(null));

        }

        List<ClipHanger> chs = new ArrayList<>(10);
        for (int i = 0; i <10 ; i++) {
            chs.add(new ClipHanger(null,null));
        }


        Pole pole = new Pole(hangers, chs);

        Wardrobe w = new Wardrobe();

        Hanger HforCloth = w.getHforCloth(pole);

        HforCloth.setTop(top);




        List<Hanger> hangers1 = pole.getHangers();
        for (Hanger han : hangers1){
            System.out.println(han.getTop() + " ");
        }


    }
}
