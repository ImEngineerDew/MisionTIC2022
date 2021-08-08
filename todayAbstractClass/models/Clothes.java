package com.toadsdewin.mintic.todayAbstractClass.models;
import com.toadsdewin.mintic.todayAbstractClass.AbstractMarket.Products;

public class Clothes extends Products
{
    public Clothes()
    {
        super();
    }
    public Clothes(Integer clothesCode, String nameClothes)
    {
        super(clothesCode, nameClothes);
    }

    @Override
    public String toString() {
        String text;

        text = "Clothes\n"+"\nCode of product:"+productCode+"\nName of clothes:"+nameProduct+
                "\nPrices:\n";

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
