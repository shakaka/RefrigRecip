package com.application.yeh.refrigrecip;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Recipes {
    private byte[] image;
    private String name;
    private List<Ingredients> ingredList = new Vector<>();

    public Recipes(byte[] image, String name, List<Ingredients> ingredList) {
        this.image = image;
        this.name = name;
        this.ingredList = ingredList;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setIngredList(List<Ingredients> ingredList) {
        this.ingredList = ingredList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredients> getIngredList() {
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
