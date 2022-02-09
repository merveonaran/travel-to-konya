package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Catalhoyuk extends AppCompatActivity implements View.OnClickListener {
    private Button buttonLoc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalhoyuk);
        buttonLoc2 = findViewById(R.id.buttonLoc2);
        buttonLoc2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Uri gmmIntentUri =  Uri.parse("geo:37.66721852881807,32.8255740693118?q="
                +Uri.parse("37.66721852881807,"+"32.8255740693118(Museum!"));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }


}