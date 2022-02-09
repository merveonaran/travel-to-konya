package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Food extends AppCompatActivity {
    private ListView listView;

  //  String foodName[]={"Etliekmek","Mevlana Şekeri","Tandır"};
    //private ArrayList<String> foods = new ArrayList<>();
    private ArrayAdapter<String> veriAdaptoru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        listView=findViewById(R.id.listView);



        String food[]={"Etliekmek","Bamya Çorbası","Sacarası","Tahinli Pide","Mevlana Şekeri","Höşmerim","Fırın kebabı","Su böreği",
                "Tandır böreği","Düğün pilavı","Yoğurt çorbası","Mevlana böreği","Arabaşı çorbası","Tirit"};

        int[] image={R.drawable.etliekmek,R.drawable.bamya,R.drawable.sacarasi,R.drawable.tahin,R.drawable.seker,R.drawable.hosmerim,R.drawable.firin,R.drawable.su,R.drawable.tandir,
        R.drawable.dugun,R.drawable.yogurt,R.drawable.mevlanab,R.drawable.arapasi,R.drawable.tirit};


        veriAdaptoru= new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,
                android.R.id.text1,food);

        listView.setAdapter(veriAdaptoru);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    Intent yeniIntent = new Intent(Food.this, FoodList.class);

                    yeniIntent.putExtra("name", food[position]);
                    yeniIntent.putExtra("image", image[position]);

                    startActivity(yeniIntent);



            }
        });







    }
}