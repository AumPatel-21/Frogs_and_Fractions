package com.company;

public class Fraction {
    private int numerator;    //attributes
    private int denominator;

    // constructor
    public Fraction(int n, int d)  // constructor
    {
        numerator = n;
        denominator = d;
    }
    public Fraction(){

    }

    //TODO default constructor (no arguments)

    public int getNum()
    {
        return numerator;
    }
    public int getDenom()
    {
        return denominator;
    }
    public Fraction add(Fraction other)
    {
        int n = this.numerator*other.denominator + this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }
    public void Fraction(){

    }
    // TODO  subtract()
    public Fraction subtract(Fraction other) {
        int n = this.numerator* other.denominator - this.denominator*other.numerator;
        int d = this.denominator*other.denominator;

        return new Fraction(n,d);

    }

    // TODO multiply()
    public Fraction multiply (Fraction other){
        int n = this.numerator*other.numerator;
        int d = this.denominator*other.denominator;

        return new Fraction(n,d);

    }

    // TODO toString()
    public String toString(){
        return (numerator+"/"+denominator);
    }

    // TODO reciprocal()
    public Fraction reciprocal(Fraction other){
        int x = this.numerator * other.numerator;
        int y = this.denominator * other.denominator;
        return new Fraction(y,x);
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);   // create an instance of fraction
        Fraction f2 = new Fraction(4,5);
        Fraction fadd1 = new Fraction(8,5);
        Fraction fadd2 = new Fraction(9,7);


        Fraction f3 = f1.add(f2);        // add 2 fractions
        System.out.println("3/4 + 4/5 = " + f3);   // print the answer

        Fraction f4 = f1.subtract(f2);
        System.out.println(f1 + " - " + f2 + " = " + f4);

        Fraction f5 = f1.multiply(f2); // multiply fractions
        System.out.println(f1 + " * " + f2 +"= "+f5);

        Fraction f6 = f1.reciprocal(f2);   // reciprocal
        System.out.println(f6);

        Fraction f7 = fadd1.add(fadd2);   //adding 2 new fractions
        System.out.println(fadd1 + " + " + fadd2 + " = " + f7);

     /*



     Add code to call reciprocal here

     create 2 new fractions and add them here.

     */


    }

}
