package com.example.project_chefino;



import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import android.annotation.SuppressLint;


public class recipescrollview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipescrollview);

        // Reference the VideoView from XML
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) VideoView videoView = findViewById(R.id.recipe_video_view1);



        // Option 2: Load a video from a URL
        String videoPath = "https://www.youtube.com/watch?v=HI2-u2zu8Ss";

        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        // Add media controls (play, pause, etc.)
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        // Start the video
        videoView.start();
    }
}