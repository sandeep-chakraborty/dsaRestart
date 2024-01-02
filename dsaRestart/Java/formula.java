// These are the program list from the  basic section which includes these codes:Write Java programs for the following:
// Area Of Circle Java Program
// Area Of Triangle
// Area Of Rectangle Program
// Area Of Isosceles Triangle
// Area Of Parallelogram
// Area Of Rhombus
// Area Of Equilateral Triangle
// Perimeter Of Circle
// Perimeter Of Equilateral Triangle
// Perimeter Of Parallelogram
// Perimeter Of Rectangle
// Perimeter Of Square
// Perimeter Of Rhombus
// Volume Of Cone Java Program
// Volume Of Prism
// Volume Of Cylinder
// Volume Of Sphere
// Volume Of Pyramid
// Curved Surface Area Of Cylinder
// Total Surface Area Of Cube
// Fibonacci Series In Java Programs
// Subtract the Product and Sum of Digits of an Integer
// Input a number and print all the factors of that number (use loops).
// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
// Take integer inputs till the user enters 0 and print the largest number from all.
// Addition Of Two Numbers
//---------------------------------

//https://github.com/kunal-kushwaha/DSA-BootcamParallelogramp-Java/blob/main/assignments/03-conditionals-loops.md

import java.util.*;
public class formula{
    public static void main(String[] args) {
        double x=circle(20);
        System.out.println(x);
    }
    public static double circle(double n){
        return 3.14*n*n;
    }
    public static double triagle(double m, double n){
        return m*n/2;    
    }
    public static double rect(int m,int n){
        return m*n;
    }
    public static double iscos(int m, int n){
        return m*n/2;
    }
    public static double Parallelogram(int m, int n){
        return m*n;
    }
    public static double Rhombus(int m, int n){
        return m*n/2;
    }
    public static double AreaOfCylen(int m, int n){
        return 2*3.14*m*n;
    }
}