package com.example.gek0n.timetable.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gek0n.timetable.R;
import com.example.gek0n.timetable.model.CheckedSlideMenuItem;
import com.example.gek0n.timetable.model.HeaderGroupSlideMenuItem;
import com.example.gek0n.timetable.model.HeaderSlideMenuItem;
import com.example.gek0n.timetable.model.ShareSlideMenuItem;
import com.example.gek0n.timetable.model.SlideMenuItem;
import com.example.gek0n.timetable.model.TextWithIconSlideMenuItem;

import java.util.List;

/**
 * Created by NgocTri on 10/18/2015.
 */
public class SlidingMenuAdapter extends BaseAdapter {

    private Context context;
    private List<SlideMenuItem> lstItem;

    public SlidingMenuAdapter(Context context, List<SlideMenuItem> lstItem) {
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
        if(item instanceof TextWithIconSlideMenuItem) {
            TextWithIconSlideMenuItem newItem = (TextWithIconSlideMenuItem)item;
            View v = View.inflate(context, R.layout.text_without_icon_sliding_menu, null);
            ImageView img = (ImageView) v.findViewById(R.id.item_img);
            TextView tv = (TextView) v.findViewById(R.id.item_title);

            img.setImageResource(newItem.getImgId());
            tv.setText(newItem.getTitle());

            return v;
        }
        if(item instanceof CheckedSlideMenuItem){
            CheckedSlideMenuItem newItem = (CheckedSlideMenuItem)item;
            View v = View.inflate(context, R.layout.checked_sliding_menu, null);
            CheckBox cb = (CheckBox) v.findViewById(R.id.checkbox);
            TextView tv = (TextView) v.findViewById(R.id.item_title);

            cb.setChecked(newItem.getIsChecked());
            tv.setText(newItem.getTitle());

            return v;
        }
        if(item instanceof HeaderGroupSlideMenuItem){
            HeaderGroupSlideMenuItem newItem = (HeaderGroupSlideMenuItem)item;
            View v = View.inflate(context, R.layout.header_group_sliding_menu, null);
            TextView tv = (TextView) v.findViewById(R.id.item_title);

            tv.setText(newItem.getTitle());

            return v;
        }
        if(item instanceof HeaderSlideMenuItem){
            HeaderSlideMenuItem newItem = (HeaderSlideMenuItem)item;
            View v = View.inflate(context, R.layout.header_sliding_menu, null);
            TextView tv = (TextView) v.findViewById(R.id.item_title);

            tv.setText(newItem.getTitle());

            return v;
        }
        if(item instanceof ShareSlideMenuItem){
            ShareSlideMenuItem newItem = (ShareSlideMenuItem)item;
            View v = View.inflate(context, R.layout.share_sliding_menu, null);
            TextView tv = (TextView) v.findViewById(R.id.item_title);
            ImageView img1 = (ImageView) v.findViewById(R.id.item_img1);
            ImageView img2 = (ImageView) v.findViewById(R.id.item_img2);
            ImageView img3 = (ImageView) v.findViewById(R.id.item_img3);

            tv.setText(newItem.getTitle());
            img1.setImageResource(newItem.getImgId1());
            img2.setImageResource(newItem.getImgId2());
            img3.setImageResource(newItem.getImgId3());

            return v;
        }
        return View.inflate(context,R.layout.fragment1, null);
    }
}
