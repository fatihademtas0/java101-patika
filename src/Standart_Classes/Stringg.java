package Standart_Classes;

import java.util.Arrays;
import java.util.Locale;

public class Stringg {
    public static void main(String[] args) {
        String str = "Back-end";
        String str2 = "Front-end";

        System.out.println(str.charAt(4)); // prints the character at the given index

        System.out.println(str.codePointAt(0)); // prints unicode of the character at the given index

        System.out.println(str.compareTo(str2)); // prints "0" if the compared strings are equal

        System.out.println(str.compareToIgnoreCase(str2)); // ignores the case situation

        System.out.println(str.concat(" Developer")); // adds the given character at the end of the string

        System.out.println(str2.contains("s")); // if the string contains the given character it returns true

        System.out.println(str.endsWith("d")); // if the string ends with the given character returns true

        System.out.println(str.startsWith("B")); // if the string starts with the given character this returns true

        System.out.println(str.equals(str2)); // if two strings are equal returns true

        System.out.println(str.indexOf("e")); // prints the given characters index

        System.out.println(str.lastIndexOf("e")); // prints the last index of the given character

        System.out.println(str.isEmpty()); // if the string is empty returns true

        System.out.println(str.length()); // prints the size of the string

        System.out.println(str2.replace("F" ,"S")); // replaces the character with the given character

        String[] list = str.split("a"); // removes the given character from string and the remains are
        System.out.println(Arrays.toString(list)); // split into pieces and joined to an array

        System.out.println(str.substring(2,5)); // prints the character between given indexes * ck- *

        System.out.println(str.toLowerCase()); // all cases are lowered

        System.out.println(str.toUpperCase()); // all cases are uppered

        System.out.println(str.trim()); // deletes all spaces




    }
}
