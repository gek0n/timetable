package com.example.gek0n.timetable.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.gek0n.timetable.R;
import com.example.gek0n.timetable.model.HeaderSlideMenuItem;
import com.example.gek0n.timetable.model.ListTextSlideMenuItem;
import com.example.gek0n.timetable.model.SearchSlideMenuItem;
import com.example.gek0n.timetable.model.SlideMenuItem;

import java.util.List;

/**
 * Created by NgocTri on 10/18/2015.
 */
public class SlidingMenuAdapter2 extends BaseAdapter {

    private Context context;
    private List<SlideMenuItem> lstItem;

    public SlidingMenuAdapter2(Context context, List<SlideMenuItem> lstItem) {
        this.context = context;
        this.lstItem = lstItem;
    }

    @Override
    public int getCount() {
        return lstItem.size();
    }

    @Override
    public Object getItem(int position) {
        return lstItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SlideMenuItem item = lstItem.get(position);
        if(item instanceof HeaderSlideMenuItem){
            HeaderSlideMenuItem newItem = (HeaderSlideMenuItem)item;
            View v = View.inflate(context, R.layout.header_sliding_menu, null);
            TextView tv = (TextView) v.findViewById(R.id.item_title);

            tv.setText(newItem.getTitle());

            return v;
        }
        if(item instanceof SearchSlideMenuItem) {
            SearchSlideMenuItem newItem = (SearchSlideMenuItem)item;
            View v = View.inflate(context, R.layout.search_sliding_menu, null);
            TextView tv = (TextView) v.findViewById(R.id.item_title);

            tv.setText(newItem.getTitle());
            return v;
        }
        if(item instanceof ListTextSlideMenuItem) {
            ListTextSlideMenuItem newItem = (ListTextSlideMenuItem)item;
            View v = View.inflate(context, R.layout.list_text_sliding_menu, null);
            return v;
        }
        return View.inflate(context,R.layout.fragment1, null);
    }
}
