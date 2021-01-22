
package gr11review.part2;
import java.io.*;

import jdk.internal.jshell.tool.resources.l10n;

public class Utility {
//.Methods 2
  public static int sumNumbers(String str){
    int intlength;
    int intcountsub;
    int intcountnum;
    String strletter;

    intcountsub = 0;
    intcountnum = 0;

    intlength = str.length();

    for (intcountsub = 0; intcountsub < intlength;intcountsub++){
      if(Character.isDigit(str.charAt(intcountsub)) == true){
        strletter = Character.toString(str.charAt(intcountsub));
        int intnewnum = Integer.parseInt(strletter);
        intcountnum = intcountnum*10 + intnewnum; 
      }
    }
    return intcountnum;
  }

//File IO - Read 2
  public static String alphaWord(String strfilename){
    int intcountlines;
    int intcountarray;
    int intcountsort1;
    int intcountsort2;
    String strwords[];
    String strtemp;

    intcountlines = 0;

    File fileread = new File(strfilename);

    while(fileread.eof() == false){
      intcountlines++;
    }
    for(intcountarray=0;intcountarray <intcountlines;intcountarray++){
      strwords[intcountarray]= file.readLine();
    } 
    
    for(intcountsort1=0; intcountsort1<intcountlines; intcountsort1++){
      for(intcountsort2=1; intcountsort2<intcountlines; intcountsort2++){
        if(strwords[intcountsort1].compareTo(strwords[intcountsort2])>0){
        strtemp=strwords[intcountsort1];
        strwords[intcountsort1]=strwords[intcountsort2];
         strwords[intcountsort2]=strtemp;
        }
      }
    }
    return strwords[0];
    file.close();
  }

//Array 2 - One Dimensional
  public int[] notAlone(int[] nums, int value){
    int intcounter;

    intcounter = 1;

    while(intcounter< nums.length){
      if (nums[intcounter] == value){
        if(nums[intcounter-1]!= value){
          if(nums[intcounter] !=value){
            if(nums[intcounter -1]>nums[intcounter]){
              nums[intcounter]= nums[intcounter -1];
            }
            if (nums[intcounter + 1]>nums[intcounter]){
              nums[intcounter] = nums[intcounter+1];
            }
          }
        }
      }
      intcounter++;
    }
    return nums;
  }

//Array 4 - One Dimensional - Two Loops
  public boolean canBalance(int[]num){
    boolean split;
    int intcounter;
    int intcountersmall;
    int intcounterlarge;
    int intsumsmall;
    int intsumlarge;

    intcounter = 1;
    intsumsmall = 0;
    intsumlarge = 0;
    split =false;

    while(intcounter<nums.length && split == false){
      for(intcountersmall = intcounter; intcountersmall>=0; intcountersmall--){
        intsumsmall= intsumsmall + num[intcountersmall];
      }
      for(intcounterlarge = intcounter + 1; intcounterlarge<=num.length; intcounterlarge++){
        intsumlarge = intsumlarge + num[intcounterlarge];
      }
      if (intsumlarge == intsumsmall){
        split = true;
      }
      intcounter++;
    }
    return split;
  }

  //Array 6 - Two Dimensional
    public static void diagonal(int n){
    int square[][];
    int intcount1;
    int intcount2;
    int inthori;
    int inthori2;

    square = new int[n][n];
    intcount1 = n;
    intcount2 = 0;
    inthori = 0;
    inthori2=n;

    for(intcount1=n; intcount1>0;intcount1--){
      square[intcount1][intcount2] = 1;
      for(inthori=0;inthori<intcount1;inthori++){
        square[intcount1][inthori]=0;
      }
      for(inthori2=n;inthori2>intcount1;inthori2--){
        square[intcount1][inthori2]=2;
      }
    }
    System.out.println(square);
  }


    /**
    * remove the middle letter
    * @param String 1  The first letter
    * @param String 2  The last letter
    * @param String 2  Both letters 
    * @author Adsana 
    */



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

     /**
    * print longest word in file
    * @param String 1  The words 
    * @param String 2  The longest word
    * @author Adsana 
    */
    
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

    /**
    * continue multiples of 10 in each row
    * @param Nums  The numbers in the array
    * @param Count  counter variable
    * @author Adsana 
    */

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

      /**
    * print true if inner numbers are in the outer numbers
    * @param Count 1  counter variable
    * @param Count 2  counter variable
    * @param Inner    Inner numbers
    * @param Outer    Outer numbers
    * @author Adsana 
    */

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
    
    /**
    * print Pascal triangle in grid form
    * @param Int i  The rows
    * @param Int j  The columns
    * @author Adsana 
    */

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

            for (inti = 0; inti < 10; inti++){
              System.out.println();
              for (intj = 0; intj < 10; intj++){
                System.out.println(intPascalTri[i][j] +" ");            
               }
            }
        
    }

}