package com.lambton;

public class Student {
    int studentID;
    String name;

    public Student()
    {
this.studentID =1;
this.name = "NO NAME";
    }

    public Student(int studentID , String name) {
        this.studentID = studentID;
        this.name = name;
    }

        public void display() throws NameLengthException
        {
            if(this.name.length() <10)
            {
             throw new NameLengthException(" Name length invalid");
            }
            System.out.println(studentID);
            System.out.println(name);
        }


    public String toString()
    {

        return "Student{" + "studentID =" + studentID +",\t name" + name + "\'" + ")";
    }
    public void finalize()
    {
        System.out.println(" i am  in finalize() method");
    }

    }
