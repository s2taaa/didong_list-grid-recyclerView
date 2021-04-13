package com.example.lab4b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter  extends BaseAdapter {
    Context ctx;
    int layoutItem;
    ArrayList<Goods> list;

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> list) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
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

        convertView = LayoutInflater.from(ctx).inflate(layoutItem,parent,false);

        // anh xa
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvShopName = convertView.findViewById(R.id.tvShopName);
        ImageView img =convertView.findViewById(R.id.img);

        // gan vao
        tvName.setText(list.get(position).getName());
        tvShopName.setText(list.get(position).getShopName());
        img.setImageResource(list.get(position).getImg());

        return convertView;
    }
}
