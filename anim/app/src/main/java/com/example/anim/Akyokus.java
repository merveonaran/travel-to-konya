package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Akyokus extends AppCompatActivity implements View.OnClickListener {
    private Button buttonLocation4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akyokus);
        buttonLocation4 = findViewById(R.id.buttonLocation4);
        buttonLocation4.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Uri gmmIntentUri = Uri.parse("geo:37.88043310616177,32.42606055129342?q="
                +Uri.parse("37.88043310616177,"+"32.42606055129342(akyokus Museum!"));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }

}