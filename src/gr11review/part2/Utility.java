package gr11review.part2;  
import java.io.*;

public class Utility {


    // Create a method to print out first and last letters of a 3 letter word
    // Use substring
    public static String zipZap(String strTwoLetters){
     String strRemoveletter;
     int intCount;
     for (intCount = 0; intCount <= 3; intCount++){
     strRemoveletter = strTwoLetters.substring(intCount, intCount-1);
    }
    return strRemoveletter;
}

}
