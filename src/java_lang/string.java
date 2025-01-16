package java_lang;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.String.join;
import static java.lang.String.valueOf;

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

        //byte[]
        //getBytes(Charset charset)
        //Encodes this String into a sequence of bytes using the given charset, storing the result into a new byte array.

        //void
        //getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        //Copies characters from this string into the destination character array.
        char[] newCharArray = new char[]{'a','b','c','d','e','f','g'};
        System.out.println(myName);
        myName.getChars(0,6, newCharArray,0);
        System.out.println(newCharArray);

        //int
        //hashCode()
        //Returns a hash code for this string.
        int myNameAsHashCode = myName.hashCode();
        System.out.println(myNameAsHashCode);

        //String
        //indent(int n)
        //Adjusts the indentation of each line of this string based on the value of n, and normalizes line termination characters.
        String paragraph = "Adjusts the indentation of each line of this string based on the value of n, and " +
                "normalizes line termination characters.";
        System.out.println(paragraph);
        String indent3Paragraph = paragraph.indent(3);
        System.out.println(indent3Paragraph);
        String indent10Paragraph = paragraph.indent(10);
        System.out.println(indent10Paragraph);

        //int
        //indexOf(int ch, int fromIndex)
        //Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
        int findx = paragraph.indexOf('x');
        System.out.println(findx);
        int findj = paragraph.indexOf('j');
        System.out.println(findj);

        //int
        //indexOf(int ch, int fromIndex)
        //Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
        String twoS = "01234S6789S";
        int findSecondS = twoS.indexOf("S",6);
        System.out.println(findSecondS);


        //int
        //indexOf(int ch, int beginIndex, int endIndex)
        //Returns the index within this string of the first occurrence of the specified character, starting the search at beginIndex and stopping before endIndex.
        String threeS = "01234S6789S234S";
        int findS1 = threeS.indexOf('S', 0, 5);
        System.out.println(findS1);
        int findS2 = threeS.indexOf('S', 0, 6);
        System.out.println(findS2);
        int findS3 = threeS.indexOf('S',5,11);
        System.out.println(findS3);
        int findS4 = threeS.indexOf('S', 6,15);
        System.out.println(findS4);

        //String
        //intern()
        //Returns a canonical representation for the string object.
        String canonicalName = myName.intern();
        System.out.println(canonicalName);

        //boolean
        //isBlank()
        //Returns true if the string is empty or contains only white space codepoints, otherwise false.
        String blankString1 = " ";
        String blankString2 = "     ";
        System.out.println(blankString1.isBlank());
        System.out.println(blankString2.isBlank());
        System.out.println(myName.isBlank());

        //boolean
        //isEmpty()
        //Returns true if, and only if, length() is 0.
        String zeroLength = "";
        String oneLength = " ";
        System.out.println(zeroLength.isEmpty());
        System.out.println(oneLength.isEmpty());

        //static String
        //join(CharSequence delimiter, CharSequence... elements)
        //Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.
        String friend1 = "Bob";
        String friend2 = "Sam";
        String friend3 = "Jerry";
        String allFriends = join(", ", friend1,friend2,friend3);
        System.out.println(allFriends);

        //static String
        //join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
        //Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.

        //int
        //lastIndexOf(int ch)
        //Returns the index within this string of the last occurrence of the specified character.
        String sString ="SSSSSS";
        System.out.println(sString.lastIndexOf('S'));

        //int
        //lastIndexOf(int ch, int fromIndex)
        //Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index.
        String boop = "boopboop";
        System.out.println(boop.lastIndexOf('b',0));
        System.out.println(boop.lastIndexOf('b',9));

        //int
        //lastIndexOf(String str)
        //Returns the index within this string of the last occurrence of the specified substring.
        System.out.println(boop.lastIndexOf("boop"));

        //int
        //lastIndexOf(String str, int fromIndex)
        //Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.
        System.out.println(boop.lastIndexOf("boop", 3));

        //int
        //length()
        //Returns the length of this string.
        String length = "123456";
        System.out.println(length.length());

        //Stream<String>
        //lines()
        //Returns a stream of lines extracted from this string, separated by line terminators.
        String stringWithLines = "Line 1\nLine 2\nLine 3\nLine 4\n";
        System.out.println(stringWithLines);
        Stream<String> stringLineStream = stringWithLines.lines();
        System.out.println(stringLineStream);
        stringLineStream.forEach(s -> System.out.println(s));

        //boolean
        //matches(String regex)
        //Tells whether or not this string matches the given regular expression.
        //^aeiou
        String noVowels = "a";
        System.out.println(noVowels.matches("[^aeiou]"));
        String nTimesRegex = "aaa";
        System.out.println(nTimesRegex.matches("a{3}"));
        String eitherOrRegex = "y";
        System.out.println(eitherOrRegex.matches("x|y"));

        //int
        //offsetByCodePoints(int index, int codePointOffset)
        //Returns the index within this String that is offset from the given index by codePointOffset code points.
        String codePointOffsetString = "Hmm, I'm not sure how this works";
        System.out.println(codePointOffsetString.offsetByCodePoints(0,5));
        //Still don't get this, what is a code point?

        //boolean
        //regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        //Tests if two string regions are equal.
        //Can't find this one!


        //boolean
        //regionMatches(int toffset, String other, int ooffset, int len)
        //Tests if two string regions are equal.
        String string1 = "Hello, Bob!";
        String string2 = "Hello, Bob!";
        String string3 = "Hallo, Bob!";
        System.out.println(string1.regionMatches(0,string2,0,5));
        System.out.println(string2.regionMatches(0,string3,0,5));

        //String
        //repeat(int count)
        //Returns a string whose value is the concatenation of this string repeated count times.
        String greetTwice = string1.repeat(2);
        System.out.println(greetTwice);

        //String
        //replace(char oldChar, char newChar)
        //Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
        String greetMorgan = "Hallo, Morgan!";
        System.out.println(greetMorgan.replace('a', 'e'));
        String normalTone = "Yes. I know what you mean.";
        String exasperatedTone = normalTone.replace('.', '!');
        System.out.println(exasperatedTone);

        //String
        //replace(CharSequence target, CharSequence replacement)
        //Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
        String alphabetWrong = "abcxyz";
        String alphabetRight = alphabetWrong.replace("xyz","def");
        System.out.println(alphabetRight);

        //String
        //replaceAll(String regex, String replacement)
        //Replaces each substring of this string that matches the given regular expression with the given replacement.
        String mixedNumLet = "abc123def456";
        //Replace characters
        System.out.println(mixedNumLet.replaceAll("[^abc]","#"));
        //Replace strings
        String repLetters = "aaabbbcccddd";
        System.out.println(repLetters.replaceAll("a{3}|b{3}","a"));

        //String
        //resolveConstantDesc(MethodHandles.Lookup lookup)
        //Resolves this instance as a ConstantDesc, the result of which is the instance itself.
        //???

        //String[]
        //split(String regex)
        //Splits this string around matches of the given regular expression.
        String stringToSplit = "Hello, My name is Bob. I am 5 years old. My favorite color is blue";
        String[] splitStringArray1 = stringToSplit.split("\\.");
        System.out.println(Arrays.toString(splitStringArray1));

        //String[]
        //split(String regex, int limit)
        //Splits this string around matches of the given regular expression.
        //What does int limit do?
        String[] splitStringArray2 = stringToSplit.split("\\.",1);
        System.out.println(Arrays.toString(splitStringArray2));

        //String[]
        //splitWithDelimiters(String regex, int limit)
        //Splits this string around matches of the given regular expression and returns both the strings and the matching delimiters.
        String[] splitStringArray3 = stringToSplit.splitWithDelimiters("\\.", 2);
        System.out.println(Arrays.toString(splitStringArray3));

        //boolean
        //startsWith(String prefix)
        //Tests if this string starts with the specified prefix.
        String alphabet = "abcd";
        System.out.println(alphabet.startsWith("z"));
        System.out.println(alphabet.startsWith("a"));

        //boolean
        //startsWith(String prefix, int toffset)
        //Tests if the substring of this string beginning at the specified index starts with the specified prefix.
        System.out.println(alphabet.startsWith("b",1));

        //String
        //strip()
        //Returns a string whose value is this string, with all leading and trailing white space removed.
        String stringWithLeadTrail = "   Hi   ";
        System.out.println(stringWithLeadTrail.strip());

        //String
        //stripIndent()
        //Returns a string whose value is this string, with incidental white space removed from the beginning and end of every line.
        System.out.println(stringWithLeadTrail.stripIndent());

        //String
        //stripLeading()
        //Returns a string whose value is this string, with all leading white space removed.
        System.out.println(stringWithLeadTrail.stripLeading());

        //String
        //stripTrailing()
        //Returns a string whose value is this string, with all trailing white space removed.
        System.out.println(stringWithLeadTrail.stripTrailing());

        //CharSequence
        //subSequence(int beginIndex, int endIndex)
        //Returns a character sequence that is a subsequence of this sequence.
        String fullName = "Bob Jones";
        System.out.println(fullName.subSequence(4,9));

        //String
        //substring(int beginIndex)
        //Returns a string that is a substring of this string.
        System.out.println(fullName.substring(4));

        //String
        //substring(int beginIndex, int endIndex)
        //Returns a string that is a substring of this string.
        System.out.println(fullName.substring(4,9));

        //char[]
        //toCharArray()
        //Converts this string to a new character array.
        String herName = "Julia";
        System.out.println(herName.toCharArray());
        char[] herNameCharArray = herName.toCharArray();
        System.out.println(herNameCharArray);

        //String
        //toLowerCase()
        //Converts all of the characters in this String to lower case using the rules of the default locale.
        String capsString = "THIS STRING IS IN CAPS";
        System.out.println(capsString.toLowerCase());

        //String
        //toLowerCase(Locale locale)
        //Converts all of the characters in this String to lower case using the rules of the given Locale.
        String chineseString = "我很好！";
        System.out.println(chineseString.toLowerCase(Locale.CHINESE));
        //???

        //String
        //toString()
        //This object (which is already a string!)
        String aString = "This is a string";
        System.out.println(aString.toString());
        //WHY?

        //String
        //toUpperCase()
        //Converts all of the characters in this String to upper case using the rules of the default locale.
        String lowerCaseString = "this string is in lower case";
        System.out.println(lowerCaseString.toUpperCase());

        //String
        //toUpperCase(Locale locale)
        //Converts all of the characters in this String to upper case using the rules of the given Locale.

        //<R> R
        //transform(Function<? super String,? extends R> f)
        //This method allows the application of a function to this string.
        //???

        //String
        //translateEscapes()
        //Returns a string whose value is this string, with escape sequences translated as if in a string literal.
        String stringWithEscapes = "First line\nSecond line\nThird line";
        System.out.println(stringWithEscapes.translateEscapes());
        System.out.println(stringWithEscapes);
        //Huh? What's the difference?

        //String
        //trim()
        //Returns a string whose value is this string, with all leading and trailing space removed, where space is defined as any character whose codepoint is less than or equal to 'U+0020' (the space character).
        System.out.println(stringWithLeadTrail.trim());
        //Difference between this and strip?

        //static String
        //valueOf(boolean b)
        //Returns the string representation of the boolean argument.
        System.out.println(valueOf(true));

        //static String
        //valueOf(char c)
        //Returns the string representation of the char argument.
        System.out.println(valueOf('b'));

        //static String
        //valueOf(char[] data)
        //Returns the string representation of the char array argument.
        char[] hisName = {'B','o','b'};
        System.out.println(valueOf(hisName));

        //static String
        //valueOf(char[] data, int offset, int count)
        //Returns the string representation of a specific subarray of the char array argument.
        char[] billyBobBrown = {'B','i','l','l','y',' ','B','o','b',' ','B','r','o','w','n'};
        System.out.println(valueOf(billyBobBrown,6,3));

        //static String
        //valueOf(double d)
        //Returns the string representation of the double argument.
        double dbl1 = 12.5;
        System.out.println(valueOf(dbl1));

        //static String
        //valueOf(float f)
        //Returns the string representation of the float argument.
        float fl1 = 1.5f;
        System.out.println(valueOf(fl1));

        //static String
        //valueOf(int i)
        //Returns the string representation of the int argument.
        int int1 = 5;
        System.out.println(valueOf(int1));

        //static String
        //valueOf(long l)
        //Returns the string representation of the long argument.
        long long1 = 10L;
        System.out.println(long1);

        //static String
        //valueOf(Object obj)
        //Returns the string representation of the Object argument.
        Cat myCat = new Cat();
        System.out.println(valueOf(myCat));
    }
}
