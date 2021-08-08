package com.toadsdewin.mintic.todayAbstractClass.AbstractMarket;
import com.toadsdewin.mintic.todayAbstractClass.InterfaceD1.Price;
import java.util.ArrayList;

public abstract class Products implements Price
{
    protected Integer productCode;
    protected String  nameProduct;
    protected ArrayList<Double> arrayPrices;

    public Products()
    {
        productCode = 001;
        nameProduct = "Butterfly meat";
        arrayPrices = new ArrayList<>();
    }
    public Products(Integer productCode, String nameProduct)
    {
        this.productCode = productCode;
        this.nameProduct = nameProduct;
        arrayPrices = new ArrayList<>();
    }
    public Double addPrice(Double value)
    {
        arrayPrices.add(value);
        return value;
    }

    @Override
    public double averagePrices()
    {
        double priceAverage = 0.0;
        for(double myPrice: arrayPrices)
        {
            priceAverage+=myPrice;
        }
        priceAverage= priceAverage/arrayPrices.size();
        return priceAverage;
    }
    @Override
    public double highPrice()
    {
        double priceHigh = 0.0;
        for(double myPrice: arrayPrices)
        {
            if(myPrice>priceHigh) {
                priceHigh = myPrice;
            }
        }
        return priceHigh;
    }
    @Override
    public double lessPrice()
    {
        double priceLess = arrayPrices.get(0);
        for(double myPrice: arrayPrices)
        {
            if(myPrice<priceLess)
            {
                priceLess = myPrice;
            }
        }
        return priceLess;
    }
}
