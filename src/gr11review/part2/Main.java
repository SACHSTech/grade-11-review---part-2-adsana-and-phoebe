package gr11review.part2;

import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    String strTwoLetters;
    String strInput;
    System.out.println("Give a 3 letter word");
    strInput = keyboard.readLine();

    strInput = Utility.zipZap(strTwoLetters);

    System.out.println("ZipZap --> " +Utility.zipZap(strTwoLetters));


  }
}