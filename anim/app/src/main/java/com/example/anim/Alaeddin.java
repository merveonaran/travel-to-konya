package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alaeddin extends AppCompatActivity implements View.OnClickListener {
    private Button buttonLocation3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alaeddin);
        buttonLocation3 = findViewById(R.id.buttonLocation3);
        buttonLocation3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Uri gmmIntentUri = Uri.parse("geo:37.8735937357897,32.49321788385079?q="
                +Uri.parse("37.8735937357897,"+"32.49321788385079(alaeddin Museum!"));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }

}