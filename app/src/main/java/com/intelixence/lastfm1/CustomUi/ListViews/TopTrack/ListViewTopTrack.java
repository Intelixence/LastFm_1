package com.intelixence.lastfm1.CustomUi.ListViews.TopTrack;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.intelixence.lastfm1.R;

import java.util.ArrayList;

public class ListViewTopTrack extends BaseAdapter {

    private Activity activity;
    private ArrayList<ItemTopTrack> itemsTopTrack = new ArrayList<>();

    public ListViewTopTrack(Activity activity, ArrayList<ItemTopTrack> itemsTopTrack) {
        this.activity = activity;
        this.itemsTopTrack = itemsTopTrack;
    }

    @Override
    public int getCount() {
        return itemsTopTrack.size();
    }

    @Override
    public Object getItem(int position) {
        return itemsTopTrack.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if ( convertView == null ) {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.item_listview_top_tracks, null);
        }
        return convertView;
    }
}
