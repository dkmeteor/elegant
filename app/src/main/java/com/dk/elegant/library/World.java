package com.dk.elegant.library;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.SurfaceHolder;

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
    SurfaceHolder holder;
    Canvas canvas;
    List<Particle> particles = new LinkedList<Particle>();

    public void setHolder(SurfaceHolder holder) {
        this.holder = holder;
    }

    public void init() {
        creator = new Creator();
        particles.addAll( creator.getParticle(100));
    }

    private void drawWorld() {
        canvas = holder.lockCanvas();
        List<Particle> deadObjects = new ArrayList<>();
        for (Particle p : particles) {
            if (p.isDead) {
                deadObjects.add(p);
            } else {
            }
            p.next();
            p.drawSelf(canvas);
        }
        holder.unlockCanvasAndPost(canvas);
        if (deadObjects.size() > 0) {
            particles.removeAll(deadObjects);
            particles.addAll(creator.getParticle(deadObjects.size()));
        }
    }

    private void drawDeadRects(List<Particle> deadObjects){
        //TODO
    }

    public void start() {
        while (true) {
            drawWorld();
        }
    }

}
