package com.lambton;

public class Exceptionhandling
{
    public static void main(String[] args)
    {
        int a =100;
        int b=5;
        int c;
        String name ="hello";
        Student s1 = new Student(1, "varinder");
        int x[] = {1,2,3};
        System.out.println("START");
        try
        {

            x[2] = 1000;
            c = a / b;
            System.out.println( "C  :" +c);

            if (b!=10)
            {
                throw new ArithmeticException("Don't divide by 10");
            }

            if(name.length() < 10)
            {
                throw new NameLengthException("Name must have length >=10 characters");
            }
        }



        catch (ArithmeticException ae)
        {
            System.out.println("Value of b=0, Divisible by zero error");
        }

        catch (ArrayIndexOutOfBoundsException aob)
        {
            System.out.println("Array x is trying access index not available");
        }

        catch (NameLengthException nae)
        {
            System.out.println(nae.toString());
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

        s1 = null;
        System.gc();


    }
    public void finalize()
    {
        System.out.println(" i am  in finalize() method");
    }
}
