package com.application.yeh.refrigrecip;

public class Ingredients {
    private String name;
    private double number;
    private String unit;

    public Ingredients(String name, double number, String unit) {
        this.name = name;
        this.number = number;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String toString (){
        int numResult;
        if ((""+Math.floor(number)).equals(""+number)){
            numResult = (int) number;
            return  (name+"\t\t\t"+numResult+" "+unit+"\n").trim();
        }
        else{
            return  (name+"\t\t\t"+number+" "+unit+"\n").trim();
        }
//        String string = new BigDecimal(number).stripTrailingZeros().toString();
//        return  name+"\t\t\t"+numResult+" "+unit+"\n";
    }
}
