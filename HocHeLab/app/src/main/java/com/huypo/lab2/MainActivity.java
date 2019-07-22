package com.huypo.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayList<Flag> arrayList;
    FlagAdapter flagAdapter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        arrayList = Flag.initFlag();
        flagAdapter = new FlagAdapter(MainActivity.this,
                R.layout.layout_row,
                arrayList);

        list.setAdapter(flagAdapter);

        textView = findViewById(R.id.txtview);
        textView.getText().toString();
        textView.setGravity(Gravity.RIGHT | Gravity.BOTTOM);
    }

}
