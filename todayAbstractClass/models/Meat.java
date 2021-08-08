package com.toadsdewin.mintic.todayAbstractClass.models;
import com.toadsdewin.mintic.todayAbstractClass.AbstractMarket.Products;

public class Meat extends Products
{
    protected String meatCut;

    public Meat()
    {
        super();
        meatCut = "Butterfly cut";
    }
    public Meat(String meatCut, Integer code, String nameMeat)
    {
        super(code,nameMeat);
        this.meatCut = meatCut;
    }

    @Override
    public String toString() {
        String text;

        text = "Meat\n"+"\nCode of product:"+productCode+"\nName of meat:"+nameProduct+
                "\nCut:"+meatCut+"\nPrices:\n";

        for (Double yourPrice: arrayPrices)
        {
            text = text+"-->"+yourPrice+"\n";
        }

        text = text +"Lower price: "+lessPrice()+"\n";
        text = text +"Higher price: "+highPrice()+"\n";
        text = text +"Average price: "+averagePrices();

    return text;
    }
}
