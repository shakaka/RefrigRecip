package com.application.yeh.refrigrecip;

import java.util.ArrayList;
import java.util.Vector;

public class Recipes {
    private String name;
    private Vector<Ingredients> ingredList = new Vector<>();

    public Recipes(String name, Vector<Ingredients> ingredList) {
        this.name = name;
        this.ingredList = ingredList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Ingredients> getIngredList() {
        return ingredList;
    }

    public void addIngredList(Ingredients ingredients) {
        ingredList.add(ingredients);
    }


    // search the abundance of the ingredients
    public void searchIngred() {
        ArrayList<String> ingredName = new ArrayList<>();
        for (int i = 0; i < ingredList.size(); i++) {
            ingredName.add(ingredList.get(i).getName());
        }
    //get the ingredients data from the save


    }
}
