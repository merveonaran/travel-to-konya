package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kelebek extends AppCompatActivity  implements View.OnClickListener {
    private Button buttonLocation5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelebek);
        buttonLocation5 = findViewById(R.id.buttonLocation5);
        buttonLocation5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Uri gmmIntentUri = Uri.parse("geo:37.94852409289987,32.46201971017421?q="
                +Uri.parse("37.94852409289987,"+"32.46201971017421(Kelebek!"));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
}