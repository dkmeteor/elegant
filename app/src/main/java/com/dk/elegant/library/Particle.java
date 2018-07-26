package com.dk.elegant.library;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by dk on 18/5/14.
 */
public class Particle {
    float x;
    float y;
    float radius;

    float start_x;
    float start_y;
    float end_x;
    float end_y;

    int totalSteps;
    int currentStep;
    boolean isDead = false;
    Paint paint;


    public void drawSelf(Canvas canvas) {
        canvas.drawCircle(x, y, radius, paint);
    }

    public void next() {
        currentStep++;
        x = start_x + (end_x - start_x) * currentStep / totalSteps;
        y = start_y + (end_y - start_y) * currentStep / totalSteps;
    }
}
