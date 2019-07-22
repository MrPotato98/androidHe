package com.huypo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Images> arrayList;
    ImagesAdapter imagesAdapter;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        arrayList = Images.init();

        imagesAdapter = new ImagesAdapter(MainActivity.this,
                R.layout.layout_cell,
                arrayList);
        gridView.setAdapter(imagesAdapter);

        textView = findViewById(R.id.textview);
        textView.getText().toString();
        textView.setGravity(Gravity.RIGHT | Gravity.BOTTOM);
    }
}
