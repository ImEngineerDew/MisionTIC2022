package com.toadsdewin.mintic.todayAbstractClass.MainPackage;
import com.toadsdewin.mintic.todayAbstractClass.AbstractMarket.Products;
import com.toadsdewin.mintic.todayAbstractClass.models.Meat;

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    private static Scanner object = new Scanner(System.in);
    private static ArrayList<Products> productList = new ArrayList<>();

    public void readData()
    {
        boolean flag = true;
        do
        {
            System.out.print("Code of the product (press 0 to exit): ");
            Integer code = object.nextInt();

            if(code>0)
            {
                System.out.print("Type of products: \n1.Meat \n2.Clothes");
                Integer typeProduct = object.nextInt();
                object.nextLine();

                System.out.print("Name of the product: ");
                String nameProd = object.nextLine();

                System.out.println("Prices: ");
                Integer quantityPrices = object.nextInt();

                switch(typeProduct)
                {

                    case 1:
                        object.nextLine();
                        System.out.println("Meat cut: ");
                        String cutMeat = object.nextLine();

                        Meat objectMeat = new Meat(cutMeat,code,nameProd);
                        break;

                }
            }
            else
            {
                flag = false;
                System.out.println("Hasta la vista baby!");
            }
        }while(flag);
    }
    public void toPrint()
    {

    }
    public static void main(String[] args)
    {

    }


}
