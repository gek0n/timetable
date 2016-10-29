package com.example.gek0n.timetable.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.gek0n.timetable.R;
import com.example.gek0n.timetable.model.ParaClass;

import java.util.List;

/**
 * Created by gek0n on 029, 29.10.2016.
 */

public class ParaListAdapter extends BaseAdapter {
    private Context context;
    private List<ParaClass> lstItem;

    public ParaListAdapter(Context context, List<ParaClass> lstItem) {
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
        ParaClass item = lstItem.get(position);
        View v = View.inflate(context, R.layout.para, null);

        TextView tvNumber = (TextView) v.findViewById(R.id.para_number);
        TextView tvName = (TextView) v.findViewById(R.id.para_name);
        TextView tvAuditory = (TextView) v.findViewById(R.id.para_auditory);
        TextView tvPodgr = (TextView) v.findViewById(R.id.para_podgr);
        TextView tvProfessor = (TextView) v.findViewById(R.id.para_professor);
        TextView tvTime = (TextView) v.findViewById(R.id.para_time);
        TextView tvType = (TextView) v.findViewById(R.id.para_type);

        tvNumber.setText(item.getNumber());
        tvName.setText(item.getName());
        tvAuditory.setText(item.getAuditory());
        if(item.getPodgr() == ParaClass.Podgrups.FIRST){
            tvPodgr.setText("1 пг.");
        }
        else{
            tvPodgr.setText("2 пг.");
        }
        tvProfessor.setText(item.getProfessor());
        tvTime.setText(item.getTime().toString());
        switch (item.getType()){
            case LABA:
                tvType.setText("лаб.");
                break;
            case LECTION:
                tvType.setText("лекц.");
                break;
            case PRACTICE:
                tvType.setText("практ.");
                break;
        }

        return v;
    }
}
