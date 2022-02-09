package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sille extends AppCompatActivity implements View.OnClickListener {
    private Button buttonLocation6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sille);

        buttonLocation6 = findViewById(R.id.buttonLocation6);
        buttonLocation6.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Uri gmmIntentUri = Uri.parse("geo:37.930550203850544,32.40242481461186?q="
                +Uri.parse("37.930550203850544,"+"32.40242481461186(sille!"));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
}