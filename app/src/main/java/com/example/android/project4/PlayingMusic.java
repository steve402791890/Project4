package com.example.android.project4;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ningyang on 10/19/17.
 */

public class PlayingMusic extends Application {
    // This Application is Set to Allow Activities to Check Whether Song is Playing
    public boolean isSongPlayingNow = false;

    public boolean getIsSongPlayingNow(){
        return isSongPlayingNow;
    }

    public void setIsSongPlayingNow(boolean isPlayingNow){
        isSongPlayingNow = isPlayingNow;
    }
}