 package com.example.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

 public class HomeActivity extends AppCompatActivity {

    ImageButton CalcuIbtn, HistoryIbtn, HimnIBtn, WebIbtn, VideoIbtn, QRCGbtn;
    TextView Nametxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        QRCGbtn = findViewById(R.id.ibtnQRCG);
        CalcuIbtn = findViewById(R.id.ibtnCalcu);
        HistoryIbtn = findViewById(R.id.ibtnHistory);
        HimnIBtn = findViewById(R.id.ibtnSTIHimn);
        Nametxt = findViewById(R.id.txtName);
        WebIbtn = findViewById(R.id.ibtnWebsite);
        VideoIbtn = findViewById(R.id.ibtnVideo);
        String Name = getIntent().getStringExtra("newname");
        Nametxt.setText(Name);

        CalcuIbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCalcu = new Intent (HomeActivity.this, GradeCalcularor.class);
                startActivity(intentCalcu);
            }
        });

        HistoryIbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenthistory = new Intent (HomeActivity.this, HistoryActivity.class);
                startActivity(intenthistory);
            }
        });

        HimnIBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenthistory = new Intent (HomeActivity.this, STIHimnActivity.class);
                startActivity(intenthistory);
            }
        });
        WebIbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.sti.edu/";
                Intent intentWebsite = new Intent(Intent.ACTION_VIEW);
                intentWebsite.setData(Uri.parse(url));
                startActivity(intentWebsite);
            }
        });
        VideoIbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentvideo = new Intent (HomeActivity.this, VideoActivity.class);
                startActivity(intentvideo);
            }
        });
        QRCGbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentqrcg = new Intent(HomeActivity.this, QRCodeGenerator.class);
                startActivity(intentqrcg);
            }
        });
    }
}