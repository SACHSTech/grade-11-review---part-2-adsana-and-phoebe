package gr11review.part2;

import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    Utility.zipZap(strWord);
    String strTwoLetters;
    String strWord;
    String strInput;
    System.out.println("Give a 3 letter word");
    strInput = keyboard.readLine();

    strTwoLetters = Utility.zipZap(strWord);

    System.out.println("ZipZap --> " +strTwoLetters);


  }
}