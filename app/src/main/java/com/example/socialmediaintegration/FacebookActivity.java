package com.example.socialmediaintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FacebookActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView face_image , google_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        initViews();
    }

    void initViews()
    {
        face_image = findViewById(R.id.facebookimage);
        face_image.setOnClickListener(this);
        google_image = findViewById(R.id.googleimage);
        google_image.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

            case R.id.googleimage:
                startActivity(new Intent(this,GoogleActivity.class));
                //loadFragment(new GoogleFragment());
                break;
        }

    }
}