package com.application.yeh.refrigrecip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class IngredientsAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<Ingredients> ingred;

    public IngredientsAdapter(Context context, List<Ingredients> ingred) {
        layoutInflater = LayoutInflater.from(context);
        this.ingred = ingred;
    }

    @Override
    public int getCount() {
        return ingred.size();
    }

    @Override
    public Object getItem(int position) {
        return ingred.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = layoutInflater.inflate(R.layout.search_list_view,parent,false);

        ImageView imageView = (ImageView)convertView.findViewById(R.id.image);
        Bitmap image = BitmapFactory.decodeByteArray(spot.get(position).getImage(), 0, spot.get(position).getImage().length);
        imageView.setImageBitmap(image);

        TextView textView=(TextView)convertView.findViewById(R.id.textview);
        textView.setText(" "+spot.get(position).getId()+" "+spot.get(position).getName()+" (Click me to get more information)");


        return convertView;
    }
}
