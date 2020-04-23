package com.intelixence.lastfm1.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.intelixence.lastfm1.R;

public class Core extends AppCompatActivity {

    //components
    ListView lv_top_tracks;
    TextView tv_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core);

        //starts the view components
        tv_url = findViewById(R.id.ac_tv_url);
        lv_top_tracks = findViewById(R.id.ac_lv_top_tracks);

    }
}
