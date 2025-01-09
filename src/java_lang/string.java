package java_lang;

import java.util.Optional;
import java.util.stream.IntStream;

public class string {

    public static void main(String[] args) {

        String myName = "Jessica";
        System.out.println(myName);

        //char
        //charAt(int index)
        //Returns the char value at the specified index
        char thirdLetter = myName.charAt(2);
        System.out.println(thirdLetter);

        //IntStream
        //chars()
        //Returns a stream of int zero-extending the char values from this sequence
        IntStream nameStream = myName.chars();
        System.out.println(nameStream);

        //int
        //codePointAt(int index)
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
        String sameName = "Jessica";
        String sameName2 = "jessica";
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
        boolean containsEssica = myName.contains("essica");
        System.out.println(containsEssica);

        //Compares this string to the specified CharSequence.
        boolean isJessica = myName.contentEquals("Jessica");
        System.out.println(isJessica);
        boolean isBob = myName.contentEquals("Bob");
        System.out.println(isBob);

        //Equivalent to valueOf(char[]).
        char[] nameArray = {'S','u','s','i','e'};
        String nameChange = myName.copyValueOf(nameArray);
        System.out.println(nameChange);

        //static String
        //copyValueOf(char[] data, int offset, int count)
        //Equivalent to valueOf(char[], int, int).
        String nickname = myName.copyValueOf(nameArray,0,3);
        System.out.println(nickname);

        //Optional<String>
        //describeConstable()
        //Returns an Optional containing the nominal descriptor for this instance, which is the instance itself.
        Optional<String> optionalString = myName.describeConstable();
        System.out.println(optionalString);

        //boolean
        //endsWith(String suffix)
        //Tests if this string ends with the specified suffix.
        System.out.println(myName.endsWith("ca"));
        System.out.println(myName.endsWith("ie"));

        //boolean
        //equals(Object anObject)
        //Compares this string to the specified object.
        System.out.println(myName.equals(myName));
        System.out.println(myName.equals(otherName));

        //boolean
        //equalsIgnoreCase(String anotherString)
        //Compares this String to another String, ignoring case considerations.
        System.out.println(myName.equalsIgnoreCase(myName));
        System.out.println(myName.equalsIgnoreCase(sameName2));
        System.out.println(myName.equalsIgnoreCase(otherName));

        //static String
        //format(String format, Object... args)
        //Returns a formatted string using the specified format string and arguments.
        //System.out.println(String.format()); ??????

        //static String
        //format(Locale l, String format, Object... args)
        //Returns a formatted string using the specified locale, format string, and arguments.

        //String
        //formatted(Object... args)
        //Formats using this string as the format string, and the supplied arguments.

        //byte[]
        //getBytes()
        //Encodes this String into a sequence of bytes using the default charset, storing the result into a new byte array.
        byte[] myNameByteArray = myName.getBytes();
        System.out.println(myNameByteArray);
        for(int i = 0; i < myNameByteArray.length; i++){
            System.out.print(myNameByteArray[i]);
            System.out.println(((char) myNameByteArray[i]));
        }

        //byte[]
        //getBytes(String charsetName)
        //Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array.










    }
}
