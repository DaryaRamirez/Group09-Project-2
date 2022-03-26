package com.syntax.Group09Project2;
/*
We have to calculate the average of marks obtained
in three subjects by student A and by student B.
Create   class   'Marks'   with   an   abstract   method
'getPercentage' that will be returning the average
percentage   of   marks.   Provide   implementation   of
abstract   method   in   classes   'A'   and   'B'.   The
constructor of student A takes the marks in three
subjects as its parameters and the marks in four
subjects as its parameters for student B. Test your
code
 */
public abstract class Marks {
    double mark1;
    double mark2;
    double mark3;


    public Marks(double mark1,double mark2,double mark3){
     this.mark1=mark1;
     this.mark2=mark2;
     this.mark3=mark3;


    }


    abstract void getPercentage();
}
class A extends Marks{
    public A(double mark1,double mark2,double mark3) {
        super(mark1, mark2, mark3);
    }


        @Override
    void getPercentage() {
            System.out.println("The average percentage of marks for student A is " + ((mark1 + mark2 + mark3) / 3) * 0.01 + "%");

    }
}


    class B extends Marks {
    public double mark4;

    public B(double mark1, double mark2, double mark3, double mark4) {

        super(mark1, mark2, mark3);
        this.mark4=mark4;
    }

    @Override
    void getPercentage() {
        System.out.println("The average percentage of marks for student B is "+((mark1+mark2+mark3+mark4)/4)*0.01+"%");


    }
}

