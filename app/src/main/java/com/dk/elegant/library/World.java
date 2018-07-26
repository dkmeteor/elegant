package com.dk.elegant.library;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dk on 18/5/14.
 */
public class World {
    Bitmap background;
    Bitmap foreground;

    Creator creator;
    Canvas canvas;
    List<Particle> particles = new LinkedList<Particle>();

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public void init() {

    }

    private void next() {
        for (Particle p : particles) {
            p.next();
        }
    }

    private void drawWorld() {
        List<Particle> deadObjects = new ArrayList<>();
        for (Particle p : particles) {
            if (p.isDead) {
                deadObjects.add(p);
            } else {
            }
            p.next();
            p.drawSelf(canvas);
        }
        if (deadObjects.size() > 0) {
            particles.removeAll(deadObjects);
            particles.addAll(creator.getParticle(deadObjects.size()));
        }
    }


}
