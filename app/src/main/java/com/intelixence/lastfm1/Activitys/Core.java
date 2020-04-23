package com.intelixence.lastfm1.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.intelixence.lastfm1.CustomUi.ListViews.TopTrack.ItemTopTrack;
import com.intelixence.lastfm1.CustomUi.ListViews.TopTrack.ListViewTopTrack;
import com.intelixence.lastfm1.R;
import com.intelixence.lastfm1.Utils.CustomTime;
import com.intelixence.peticiones.EasyReq;

import java.util.ArrayList;

public class Core extends AppCompatActivity implements EasyReq.Event {

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

        //process
        ArrayList<ItemTopTrack> itemsTopTracks = new ArrayList<>();
        itemsTopTracks.add(new ItemTopTrack(1, "Do you wanna know?", CustomTime.minutes_seconds(272),"google.com","Arctic Monkeys", "google.com", 1800000, null));
        ListViewTopTrack listViewTopTrack = new ListViewTopTrack(this, itemsTopTracks);
        lv_top_tracks.setAdapter(listViewTopTrack);

    }

    @Override
    public void Response(String response, int code_request) {

    }

    @Override
    public void Error(VolleyError error, int code_request) {

    }
}
