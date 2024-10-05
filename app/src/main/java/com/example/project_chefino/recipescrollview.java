package com.example.project_chefino;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class recipescrollview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipescrollview);

        // Reference the VideoView from XML
        VideoView videoView = findViewById(R.id.recipe_video_view1);

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

        // Add functionality for the "Add Review" button
        Button addReviewButton = findViewById(R.id.btn_add_review);
        addReviewButton.setOnClickListener(v -> {
            Intent intent = new Intent(recipescrollview.this, review1.class); // Replace ReviewPageActivity with your actual review page activity class
            startActivity(intent);
        });
    }
}
