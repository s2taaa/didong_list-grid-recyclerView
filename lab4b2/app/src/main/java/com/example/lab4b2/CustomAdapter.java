package com.example.lab4b2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context ctx;
    private int layoutItem;
    ArrayList<ElectricThings> arrayList;

    public CustomAdapter(Context ctx, int layoutItem, ArrayList<ElectricThings> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        viewHolder viewHolder;
        if(convertView==null){
            convertView = LayoutInflater.from(ctx).inflate(layoutItem,parent,false);

            viewHolder = new viewHolder();
            viewHolder.tvName=convertView.findViewById(R.id.tvName);
            viewHolder.tvGia=convertView.findViewById(R.id.tvGia);
            viewHolder.tvPPR=convertView.findViewById(R.id.tvPPR);
            viewHolder.tvReduce=convertView.findViewById(R.id.tvReduce);
            viewHolder.img=convertView.findViewById(R.id.img);
            viewHolder.rating=convertView.findViewById(R.id.ratingBar);

            convertView.setTag(viewHolder);

        }
        else {
            viewHolder =(viewHolder) convertView.getTag();
        }

        viewHolder.tvName.setText(arrayList.get(position).getName());
        viewHolder.tvGia.setText(String.valueOf(arrayList.get(position).getNewPrice()));
        viewHolder.tvPPR.setText(String.valueOf(arrayList.get(position).getPeopleRate()));
        viewHolder.tvReduce.setText(String.valueOf(arrayList.get(position).getReducePersent()));
        viewHolder.img.setImageResource(arrayList.get(position).getImg());
        viewHolder.rating.setRating(arrayList.get(position).getRate());

        return convertView;
    }
    private class viewHolder {
        TextView tvName;
        TextView tvGia;
        TextView tvPPR;
        TextView tvReduce;
        ImageView img;
        RatingBar rating;


    }
}

