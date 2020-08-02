package com.dk.elegant;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;

import com.dk.elegant.library.World;

/**
 * Created by dk on 2018/7/26.
 */

public class MainActivity extends AppCompatActivity {
    SurfaceView surface;
    World world;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        surface.findViewById(R.id.surface);

        world = new World();
        world.init();
        world.setHolder(surface.getHolder());
        world.start();
    }
}
