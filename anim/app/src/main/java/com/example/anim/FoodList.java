package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodList extends AppCompatActivity {
    private ImageView image;
    private TextView name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        image=findViewById(R.id.image);
        name=findViewById(R.id.name);
        Intent intent=getIntent();

        name.setText(intent.getStringExtra("name"));
        image.setImageResource(intent.getIntExtra("image",0));

        int[] image1 ={R.drawable.akyokus,R.drawable.alaeddin,R.drawable.mevlana};

    }
}