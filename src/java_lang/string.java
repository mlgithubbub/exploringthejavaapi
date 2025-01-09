package java_lang;

import java.util.stream.IntStream;

public class string {

    public static void main(String[] args) {

        String myName = "Morgan";
        System.out.println(myName);

        //Returns the char value at the specified index
        char thirdLetter = myName.charAt(2);
        System.out.println(thirdLetter);

        //Returns a stream of int zero-extending the char values from this sequence
        IntStream nameStream = myName.chars();
        System.out.println(nameStream);

        //Returns the character (Unicode code point) at the specified index
        int thirdLetterCodePoint = myName.codePointAt(2);
        System.out.println(thirdLetterCodePoint);

        //Returns the character (Unicode code point) before the specified index
        int previousCodePoint = myName.codePointBefore(2);
        System.out.println(previousCodePoint);

        //Returns the number of Unicode code points in the specified text range of this String.
        int countCodePoints = myName.codePointCount(0,2);
        System.out.println(countCodePoints);

        //Returns a stream of code point values from this sequence
        IntStream codePoints = myName.codePoints();
        System.out.println(codePoints);

        //Compares two strings lexicographically.
        String otherName = "Bob";
        String sameName = "Morgan";
        String sameName2 = "morgan";
        int comparison = myName.compareTo(otherName);
        System.out.println(comparison);
        int comparison2 = myName.compareTo(sameName);
        System.out.println(comparison2);
        int comparison3 = myName.compareTo(sameName2);
        System.out.println(comparison3);

        //Compares two strings lexicographically, ignoring case differences.
        int comparisonIgnoreCase = myName.compareToIgnoreCase(sameName2);
        System.out.println(comparisonIgnoreCase);

        //Concatenates the specified string to the end of this string.
        String lastName = " Richards";
        String concatenated = myName.concat(lastName);
        System.out.println(concatenated);

        //Returns true if and only if this string contains the specified sequence of char value
        boolean containsOrgan = myName.contains("organ");
        System.out.println(containsOrgan);

        //Compares this string to the specified CharSequence.
        boolean isMorgan = myName.contentEquals("Morgan");
        System.out.println(isMorgan);
        boolean isBob = myName.contentEquals("Bob");
        System.out.println(isBob);

        //Equivalent to valueOf(char[]).
        char[] nameArray = {'S','u','s','i','e'};
        String nameChange = myName.copyValueOf(nameArray);
        System.out.println(nameChange);








    }
}
