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


public class RecipeAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private List<Recipes> recipe;

    public RecipeAdapter(Context context, List<Recipes> recipe) {
        layoutInflater = LayoutInflater.from(context);
        this.recipe = recipe;
    }


    @Override
    public int getCount() {
        return recipe.size();
    }

    @Override
    public Object getItem(int position) {
        return recipe.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = layoutInflater.inflate(R.layout.listview_ingredients, parent, false);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        Bitmap image = BitmapFactory.decodeByteArray(recipe.get(position).getImage(), 0, recipe.get(position).getImage().length);
        imageView.setImageBitmap(image);

        TextView txvName = (TextView) convertView.findViewById(R.id.txvName);
        txvName.setText(" " + recipe.get(position).getName() + " " + recipe.get(position).getName());

        TextView txvNumber = (TextView) convertView.findViewById(R.id.txvIngred);
        txvNumber.setText(" " + recipe.get(position).getIngredList() + " " + recipe.get(position).getName());


        return convertView;
    }
}
