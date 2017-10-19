package com.example.android.project4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("setContentView"," yes its set.");

        //Albums        this is set up onclick listener for intent a new view
        TextView albums = (TextView) findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, Albums.class);

                startActivity(playlistIntent);
            }
        });

        //Artists        this is set up onclick listener for intent a new view
        TextView Artists = (TextView) findViewById(R.id.artists);
        Artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, Artists.class);

                startActivity(playlistIntent);
            }
        });

        //Download Music        this is set up onclick listener for intent a new view
        TextView downloadMusic = (TextView) findViewById(R.id.downloaded_music);
        downloadMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, DownloadMusic.class);

                startActivity(playlistIntent);
            }
        });

//        //Playing Music        this is set up onclick listener for intent a new view
//        TextView playingMusic = (TextView) findViewById(R.id.playing_music);
//        playingMusic.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent playlistIntent = new Intent(MainActivity.this, PlayingMusic.class);
//
//                startActivity(playlistIntent);
//            }
//        });

        //Playlist        this is set up onclick listener for intent a new view
        TextView playlist = (TextView) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, Playlist.class);

                startActivity(playlistIntent);
            }
        });

        //Songs        this is set up onclick listener for intent a new view
        TextView songs = (TextView) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, Songs.class);

                startActivity(playlistIntent);
            }
        });
    }
}
