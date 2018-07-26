package com.dk.elegant.library;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by dk on 18/5/14.
 */

public class Creator {
    List<Particle> particles = new LinkedList<Particle>();

    public void createParticles(int[] pixels, int width, int height) {
        for (int i = 0; i < 100 * 100; i++) {
            int color = pixels[(int) (pixels.length / 10000f * i)];
            //TODO
            particles.add(new Particle());
        }
    }

    public List<Particle> getParticle(int count) {
        return particles.subList(0, count);
    }
}
