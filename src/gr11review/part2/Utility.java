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
    public static linearIn(int[] outer, int[] inner){
      int intCount1;
      int intCount2; 
      int intInner;
      int intOuter;

      // increasing values for both outer and inner
      for (intCount1 = 0; intCount1 < intInner; intCount1++){
      for (intCount2 = 0; intCount2 < intOuter; intCount2++){
          // create the restriction that both values have to be there in order for it to be true
          if (intInner[] == intOuter[]){
            return true;
          }else{ 
            return false;
          }
      }
      }
    }
    public static void pascalTri(int i, int j){
        // Create pascal triangle in grid from using arrays 
        int intPascalTri[][] = { {1,1,1,1,1,1,1,1,1,1},
                                 {1,2,3,4,5,6,7,8,9,10},
                                 {1,3,6,10,15,21,28,36,45,55},
                                 {1,4,10,20,35,56,84,120,165,220},
                                 {1,5,15,35,70,126,210,330,495,715},
                                 {1,6,21,56,126,252,462,792,1287,2002},
                                 {1,7,28,84,210,462,924,1716,3003,5005},
                                 {1,8,36,120,330,792,1716,3432,6435,11440},
                                 {1,9,45,165,495,1287,3003,6435,12870,24310},
                                 {1,10,55,220,715,2002,5005,11440,24310,48620}};
            
            // create a loop to print these rows and columns out
            // create a empty println for rows' for loops so it can print out each row separately
            // put a space for columns' for loops so theres spaces between each number
            int inti;
            int intj;

            for (inti = 0; intsi < 10; inti++){
              System.out.println();
              for (intj = 0; intj < 10; intj++){
                System.out.println(intPascalTri[i][j] +" ");            
               }
            }
        
    }

}