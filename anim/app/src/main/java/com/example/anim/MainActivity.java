package com.example.anim;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {



    private Button button1,button2,button3,button4,button5,button6;

    private Animation righttoleft;
    private Animation lefttoright;
    private NavigationView navigationView;
    private DrawerLayout drawer;
    Context context;
    Resources resources;


 //   @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadLocale();


     button1=findViewById(R.id.button1);
     button2=findViewById(R.id.button2);
     button3=findViewById(R.id.button3);
     button4=findViewById(R.id.button4);
     button5=findViewById(R.id.button5);
     button6=findViewById(R.id.button6);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent yeniIntent = new Intent(MainActivity.this,Mevlanaa.class);

                startActivity(yeniIntent);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent yeniIntent = new Intent(MainActivity.this,Catalhoyuk.class);

                startActivity(yeniIntent);
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent yeniIntent = new Intent(MainActivity.this,Alaeddin.class);

                startActivity(yeniIntent);
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent yeniIntent = new Intent(MainActivity.this,Akyokus.class);

                startActivity(yeniIntent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent yeniIntent = new Intent(MainActivity.this,Kelebek.class);

                startActivity(yeniIntent);
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent yeniIntent = new Intent(MainActivity.this,Sille.class);

                startActivity(yeniIntent);
            }
        });





    righttoleft = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.righttoleft);
    lefttoright = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.lefttoright);

    button2.setAnimation(righttoleft);
    button4.setAnimation(righttoleft);
    button6.setAnimation(righttoleft);


    button1.setAnimation(lefttoright);
    button3.setAnimation(lefttoright);
    button5.setAnimation(lefttoright);


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item2:

                Intent yeniIntent = new Intent(MainActivity.this,About.class);
                startActivity(yeniIntent);
                return true;
            case R.id.item4:
                Intent yeniIntent1 = new Intent(MainActivity.this,Food.class);
                startActivity(yeniIntent1);
                return true;
            case R.id.subItem1:
                Toast.makeText(this, "English selected", Toast.LENGTH_SHORT).show();
                setLocale("en");
                recreate();
                return true;


            case R.id.subItem2:
                Toast.makeText(this, "Türkçe seçildi", Toast.LENGTH_SHORT).show();
                setLocale("tr");
                recreate();
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }



    }

    private void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config=new Configuration();
        config.locale=locale;
        getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings",MODE_PRIVATE).edit();
        editor.putString("my_lang",lang);
        editor.apply();

    }

    public void loadLocale(){
        SharedPreferences prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language = prefs.getString("my_lang","");
        setLocale(language);

    }
}