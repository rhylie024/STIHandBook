package com.example.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    VideoView STIVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        STIVideo = findViewById(R.id.vvSTIVideo);
        STIVideo.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.sti_video);
        MediaController VideoControl = new MediaController(this);
        VideoControl.setAnchorView(STIVideo);
        STIVideo.setMediaController(VideoControl);
        STIVideo.start();
    }
}