package gr11review.part2;
import java.io.*;

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
}
}