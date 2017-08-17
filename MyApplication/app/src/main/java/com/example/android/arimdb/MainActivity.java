package com.example.android.arimdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mMovieListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMovieListTextView = (TextView) findViewById(R.id.tv_movie_names);

        String[] movieNames = MovieBox.getMovieNames();

        for (String movieName : movieNames) {
            mMovieListTextView.append(movieName + "\n\n\n");
        }
    }
}
