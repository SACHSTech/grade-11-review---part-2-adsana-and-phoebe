package gr11review.part2;  
import java.io.*;

import jdk.internal.jshell.tool.resources.l10n;

public class Utility{


    // Create a method to print out first and last letters of a 3 letter word
    // Use substring
    public static String zipZap(String strWord){
      String strLetter1;
      String strLetter2;
      String strTwoLetters;
     
      strWord = "";
      strLetter1 = strWord.substring(0);
      strLetter2 = strWord.substring(2);
      strTwoLetters = strLetter1 + strLetter2; 

    
    return strTwoLetters;
    }
}

