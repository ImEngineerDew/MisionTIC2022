package com.toadsdewin.mintic.Java.challengeONE;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentRecord {
    private static Scanner object = new Scanner(System.in);
    static Integer i, sum = 0;
    static Double average, array[];

    static double quantityOfData(Integer amount) {
        array = new Double[amount];
        System.out.println("Size of the array: " + amount);
        for (i = 0; i < amount; i++) {
            System.out.print("Record # " + i + ": ");
            array[i] = object.nextDouble();
        }
        return amount;
    }

    public static void main(String args[])
    {
        double sumatory = 0;
        Boolean flag;

        sumatory = (double) sum;

        do {
            try {
                flag = false;
                System.out.print("Please type your DNI: ");
                Integer DNI = object.nextInt();

                    do
                    {
                        if(DNI>0)
                        {
                            try {
                                flag = false;
                                System.out.print("Please write the amount of data: ");
                                Integer amnt = object.nextInt();

                                quantityOfData(amnt);

                                for (int j=0; j<amnt;j++)
                                {
                                    sumatory+=array[j];
                                    average = sumatory/amnt;
                                }
                                System.out.println("Sum: "+sumatory);
                                if(average>3.0)
                                {
                                    System.out.print("Average: "+average);
                                    System.out.println(", Congratulations, you've been passed the course!");
                                    break;
                                }
                                else if(average>2.0 && average<2.99)
                                {
                                    System.out.print("Average: "+average);
                                    System.out.println(", you will have a chance of pass the course!");
                                    break;
                                }
                                else
                                {
                                    System.out.print("Average: "+average);
                                    System.out.println(", You're been lost the course!");
                                    break;
                                }
                            }catch(NullPointerException nullError)
                            {
                                System.out.print("Please write the amount of data: ");
                                object.next();
                                flag = true;
                            }
                        }
                        else
                        {
                            flag= false;
                            System.out.println("This program has been ended!");
                        }
                    }while(flag);
            } catch (InputMismatchException e) {
                System.out.println("Try again!");
                object.next();
                flag = true;
            }
        } while (flag);
    }
}