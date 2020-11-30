package gr11review.part2;  
import java.io.*;

import jdk.internal.jshell.tool.resources.l10n;

public class Utility{


    // Create a method to print out first and last letters of a 3 letter word
    // Use substring to print out the letters we want
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

    
    TextInputFile words = new TextInputFile("words.txt");

    public static String longestword(String strWordstxt){
        String strWords;
        String strLongestWord;
        // finding the longest word in the file 
        // no word can be longer than the longest word so will print the highest one
        if (strWords.length() > strLongestWord.length()){
          strWords = strLongestWord;
        }
    return strLongestWord;
    }

    public static int[] tenRun(int[] nums){
      int intNums;
      int intCount;

      for(intCount = 0; intCount < intNums.length(); intCount++){
         // Check if numbers are multiples of 10
         intNums[intCount] % 10 == 0;
          // check if the net number is a multiple of 10
          if(intNums[intCount + 1] % 10 != 0){
            intNums[intCount + 1] = intNums[intCount];
          }
        }
        return intNums;
      }


    }


