package com.fitstsputnik.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_spotify_streamer)
    public void spotifyStreamerClick() {
        Toast.makeText(this, "This buttton will launch Spotify Streamer app!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button_scores_app)
    public void scoresClick() {
        Toast.makeText(this, "This buttton will launch Scores app!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button_library_app)
    public void libraryClick() {
        Toast.makeText(this, "This buttton will launch Library app!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button_build_it_bigger_app)
    public void buildItClick() {
        Toast.makeText(this, "This buttton will launch Build It Bigger app!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button_xyz_reader_app)
    public void xyzReaderClick() {
        Toast.makeText(this, "This buttton will launch XYZ Reader app!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button_capstone_app)
    public void capstoneAppClick() {
        Toast.makeText(this, "This buttton will launch Capstone Project app!", Toast.LENGTH_SHORT).show();
    }
}
