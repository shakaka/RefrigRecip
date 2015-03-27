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
            convertView = layoutInflater.inflate(R.layout.listview_ingredients,parent,false);

        ImageView imageView = (ImageView)convertView.findViewById(R.id.image);
        Bitmap image = BitmapFactory.decodeByteArray(ingred.get(position).getImage(), 0, ingred.get(position).getImage().length);
        imageView.setImageBitmap(image);

        TextView txvName=(TextView)convertView.findViewById(R.id.txvName);
        txvName.setText(" "+ingred.get(position).getName()+" "+ingred.get(position).getName());

        TextView txvNumber=(TextView)convertView.findViewById(R.id.txvNumber);
        txvNumber.setText(" "+ingred.get(position).getNumber()+" "+ingred.get(position).getName());

        TextView txvUnit=(TextView)convertView.findViewById(R.id.txvUnit);
        txvUnit.setText(" "+ingred.get(position).getUnit()+" "+ingred.get(position).getName());


        return convertView;
    }
}
