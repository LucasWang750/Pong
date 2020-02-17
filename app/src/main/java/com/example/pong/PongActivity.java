package com.example.pong;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class PongActivity extends Activity {

    private PongGame mGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        mGame = new PongGame(this, size.x, size.y);
        setContentView(mGame);

    }

    @Override
    protected void onResume(){
        super.onResume();
        mGame.resume();
    }

    @Override
    protected void onPause(){
        super.onPause();
        mGame.pause();
    }
}
