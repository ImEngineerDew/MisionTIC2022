package com.toadsdewin.mintic.Java.challengeONE;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashMap;

public class StudentRecord
{
    private static Scanner object = new Scanner(System.in);
    static Integer i, sum = 0;
    static Double average, array[];

    static double quantityOfData(Integer amount)
    {
        array = new Double[amount];
        System.out.println("Size of the array: " + amount);
        for (i = 0; i < amount; i++)
        {
            System.out.print("Score record # " + i + ": ");     //This is the score record between 0,0 and 5,0
            array[i] = object.nextDouble();
        }
        return amount;
    }

    public static void main(String args[])
    {
        HashMap <Double,String> littleMap = new HashMap();
        double sumatory = 0;
        sumatory = (double) sum;
        Boolean flag;
        String message = " ";


        do {
            try {
                flag = false;
                System.out.print("Please type your DNI: ");
                Integer DNI = object.nextInt();

                    do
                    {
                        if(DNI>0) {
                            try {
                                flag = false;
                                System.out.print("Please write the amount of data: ");
                                Integer amnt = object.nextInt();

                                quantityOfData(amnt);

                                for (int j = 0; j < amnt; j++) {
                                    sumatory += array[j];
                                    average = sumatory / amnt;
                                }
                                System.out.println("Sum: " + sumatory);
                                if (average > 3.0)
                                {
                                    littleMap.put(average,"Congratulations, you've been passed the course!");

                                    littleMap.get(average);
                                    littleMap.get(message);

                                    System.out.println("Information: " + littleMap);
                                    break;
                                } else if (average > 2.0 && average < 2.99) {
                                    littleMap.put(average,"you will have a chance of pass the course!");

                                    littleMap.get(average);
                                    littleMap.get(message);

                                    System.out.println();
                                    System.out.println("Information: " + littleMap);
                                    break;
                                } else {
                                    littleMap.put(DNI, average);

                                    littleMap.get(DNI);
                                    littleMap.get(average);

                                    //System.out.print("Average: "+average);
                                    System.out.println("You're been lost the course!");
                                    System.out.println("Information: " + littleMap);
                                    break;
                                }
                            } catch (NullPointerException nullError) {
                                System.out.println("That array doesn't allow empty fields!");
                                flag = true;
                            }catch(NegativeArraySizeException negativeException)
                            {
                                System.out.println("Only positive numbers");
                                flag= true;
                            }

                        }
                        else
                        {
                            flag= false;
                            System.out.println("This program has been ended!");
                        }
                    }while(flag);
            } catch (InputMismatchException typoError)
            {
                System.out.println("Try again!");
                object.next();
                flag = true;
            }
        } while (flag);
    }
}