package java_lang;

import org.w3c.dom.ls.LSOutput;

import static java.lang.StrictMath.*;

public class math {

    public static void main(String[] args) {
        //static double
        //abs(double a)
        //Returns the absolute value of a double value.
        double dbl1 = -5;
        System.out.println(abs(dbl1));

        //static float
        //abs(float a)
        //Returns the absolute value of a float value.
        float flt1 = -5f;
        System.out.println(abs(flt1));

        //static int
        //abs(int a)
        //Returns the absolute value of an int value.
        int int1 = -5;
        System.out.println(abs(int1));

        //static long
        //abs(long a)
        //Returns the absolute value of a long value.
        long long1 = -5L;
        System.out.println(abs(long1));

        //static int
        //absExact(int a)
        //Returns the mathematical absolute value of an int value if it is exactly representable as an int, throwing ArithmeticException if the result overflows the positive int range.
        int overflowInt = -2147483648;
        // System.out.println(absExact(overflowInt)); // throws Arithmetic exception
        System.out.println(abs(overflowInt-1));
        System.out.println(abs(overflowInt));

        //static long
        //absExact(long a)
        //Returns the mathematical absolute value of an long value if it is exactly representable as an long, throwing ArithmeticException if the result overflows the positive long range.
        long overflowLong = -9223372036854775808L;
        // System.out.println(absExact(overflowLong)); // throws arithmetic exception
        System.out.println(abs(overflowLong-1));
        System.out.println(abs(overflowLong));

        //static double
        //acos(double a)
        //Returns the arc cosine of a value; the returned angle is in the range 0.0 through pi.
        double double1 = acos(550);
        System.out.println(double1); //???

        //static int
        //addExact(int x, int y)
        //Returns the sum of its arguments, throwing an exception if the result overflows an int.
        //System.out.println(addExact(2147483647,1)); //Arithmetic exception
        System.out.println(addExact(2147483646,1));

        //static long
        //addExact(long x, long y)
        //Returns the sum of its arguments, throwing an exception if the result overflows a long.
        //System.out.println(addExact(9223372036854775807L, 1)); //Arithmetic exception
        System.out.println(addExact(9223372036854775806L, 1));

        //static double
        //asin(double a)
        //Returns the arc sine of a value; the returned angle is in the range -pi/2 through pi/2.
        System.out.println(asin(5.5)); //???

        //static double
        //atan(double a)
        //Returns the arc tangent of a value; the returned angle is in the range -pi/2 through pi/2.
        System.out.println(atan(5.5)); //???

        //static double
        //atan2(double y, double x)
        //Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).
        System.out.println(atan2(5.5,4.5)); //???

        //static double
        //cbrt(double a)
        //Returns the cube root of a double value.
        System.out.println(cbrt(5.5)); //???

        //static double
        //ceil(double a)
        //Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.
        System.out.println(ceil(5.5));

        //static int
        //ceilDiv(int x, int y)
        //Returns the smallest (closest to negative infinity) int value that is greater than or equal to the algebraic quotient.
        System.out.println(ceilDiv(9,5));

        //static long
        //ceilDiv(long x, int y)
        //Returns the smallest (closest to negative infinity) long value that is greater than or equal to the algebraic quotient.
        System.out.println(ceilDiv(50L, 15));

        //static long
        //ceilDiv(long x, long y)
        //Returns the smallest (closest to negative infinity) long value that is greater than or equal to the algebraic quotient.
        System.out.println(ceilDiv(50L,15L));

        //static int
        //ceilDivExact(int x, int y)
        //Returns the smallest (closest to negative infinity) int value that is greater than or equal to the algebraic quotient.
        System.out.println(ceilDivExact(4294967296L,2)); //doesn't throw exception because long?

        //static long
        //ceilDivExact(long x, long y)
        //Returns the smallest (closest to negative infinity) long value that is greater than or equal to the algebraic quotient.
        System.out.println(ceilDivExact(50L,15L));

        //static int
        //ceilMod(int x, int y)
        //Returns the ceiling modulus of the int arguments.
        System.out.println(ceilMod(5,6)); //what is the ceiling mod?

    }


}
