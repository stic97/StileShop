package com.example.stileshop;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.stileshop.R.layout.activity_productdetails;
import static com.example.stileshop.R.layout.products_row_item;


public class Productdetails extends AppCompatActivity {

    TextView mtextView11;
    ImageView mimage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





        if(mtextView11.getText().toString().equals("Sobna lampa Zvezdano Nebo"))
        {
            setContentView(activity_productdetails);
        }




    }

}
