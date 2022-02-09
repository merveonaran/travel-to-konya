package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Mevlanaa extends AppCompatActivity implements OnClickListener{
    private Button buttonLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mevlanaa);
        buttonLocation = findViewById(R.id.buttonLocation);
        buttonLocation.setOnClickListener(this);


    }

            @Override
            public void onClick(View view) {

                Uri gmmIntentUri = Uri.parse("geo:37.871421045168184,32.50499827815542?q="
                                  +Uri.parse("37.871421045168184,"+"32.50499827815542(MEVLANA Museum!"));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }

}