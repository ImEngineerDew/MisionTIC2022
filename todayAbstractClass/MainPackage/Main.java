package com.toadsdewin.mintic.todayAbstractClass.MainPackage;
import com.toadsdewin.mintic.todayAbstractClass.AbstractMarket.Products;
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
                System.out.println("Type of products: \n1.Meat \n2.Clothes");
                Integer typeProduct = object.nextInt();
                object.nextLine();
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
