package com.lambton;

public class Exceptionhandling
{
    public static void main(String[] args)
    {
        int a =100;
        int b=0;
        int c;

        int x[] = {1,2,3};
        System.out.println("START");
        try
        {

            x[4] = 1000;
            c = a / b;
            System.out.println( "C  :" +c);
        }



        catch (ArithmeticException ae)
        {
            System.out.println("Value of b=0, Divisible by zero error");
        }

        catch (ArrayIndexOutOfBoundsException acb)
        {
            System.out.println("Array x is trying access index not available");
        }

        catch (Exception ae)
        {
            System.out.println(ae.toString());
        }

        finally
        {
            System.out.println(" i am in finally block");
        }


        System.out.println("END");
    }

}
