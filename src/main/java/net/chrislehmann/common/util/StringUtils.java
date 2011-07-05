package net.chrislehmann.common.util;


public class StringUtils {

    public static String removeNonNumeric(String text) {
        int length = text.length();
        String normalizedString = "";
        for(char character: text.toCharArray())
        {
            if( Character.isDigit(character ))
            {
                normalizedString += character;
            }
        }
        return normalizedString;
    }

}
